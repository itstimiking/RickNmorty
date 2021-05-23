package com.example.ricknmorty.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ricknmorty.databinding.RecyclerCharacterItemViewBinding
import com.example.ricknmorty.network.Result

class CharactersAdapter(val context: Context, val characters : List<Result>): RecyclerView.Adapter<CharactersAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: RecyclerCharacterItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(name: String, specie: String){
            val name = binding.characterName
            val specie = binding.characterSpecie
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerCharacterItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val character = characters[position]
        holder.setData(character.name, character.species)
    }

    override fun getItemCount(): Int {
        return characters.size
    }
}