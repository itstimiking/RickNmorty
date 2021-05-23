package com.example.ricknmorty.characterList
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ricknmorty.network.CharacterApi
import com.example.ricknmorty.network.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterViewModel: ViewModel() {
    var characters = MutableLiveData<List<Result>>()
    var charactersString = MutableLiveData<String>()

    fun getCharactersString(){
        charactersString.value = "Getting strings if network is available"
    }

    fun getStrings(context: Context){
        CharacterApi.retrofitService.getCharacters().enqueue(object : Callback<String?> {
            override fun onResponse(call: Call<String?>, response: Response<String?>) {
                charactersString.value = response.body()
            }

            override fun onFailure(call: Call<String?>, t: Throwable) {
                Toast.makeText(context, "No data", Toast.LENGTH_SHORT).show()
                charactersString.value = "No data"
            }
        })
    }
}