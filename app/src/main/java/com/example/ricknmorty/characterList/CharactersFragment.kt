package com.example.ricknmorty.characterList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ricknmorty.R
import com.example.ricknmorty.databinding.FragmentCharactersBinding

class CharactersFragment : Fragment() {

    private lateinit var viewModel : CharacterViewModel
    private lateinit var binding: FragmentCharactersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(CharacterViewModel::class.java)
        // Inflate the layout for this fragment
        binding = FragmentCharactersBinding.inflate(inflater,container, false)

        viewModel.charactersString.observe(viewLifecycleOwner, Observer { charactersString ->
            binding.charactersString.text = charactersString
        })
        addCharacters()
        val view = binding.root

        return view
    }

    private fun addCharacters() {
        val characters = viewModel.getCharactersString()
    }


}