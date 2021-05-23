package com.example.ricknmorty.characterList
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ricknmorty.network.Result

class CharacterViewModel: ViewModel() {
    var characters = MutableLiveData<List<Result>>()

    fun getCharacters(){

    }
}