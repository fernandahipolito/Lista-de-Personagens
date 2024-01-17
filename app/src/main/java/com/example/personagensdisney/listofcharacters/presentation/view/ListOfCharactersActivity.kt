package com.example.personagensdisney.listofcharacters.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.personagensdisney.R
import com.example.personagensdisney.databinding.ActivityListOfCharactersBinding
import com.example.personagensdisney.listofcharacters.presentation.list.adapter.CharacterListAdapter
import com.example.personagensdisney.listofcharacters.presentation.viewmodel.ListOfCharactersViewModel
import com.example.personagensdisney.listofcharacters.presentation.viewmodel.ListOfCharactersViewState
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListOfCharactersActivity : AppCompatActivity() {
    private val binding: ActivityListOfCharactersBinding by lazy {
        ActivityListOfCharactersBinding.inflate(
            layoutInflater
        )
    }
    private val viewModel: ListOfCharactersViewModel by viewModel()
    private val adapter by lazy { CharacterListAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        observeViewModel()
        initList()
        viewModel.getListOfCharacters()
    }

    private fun initList() {
        binding.rvListOfCharacters.apply {
            adapter = this@ListOfCharactersActivity.adapter
            layoutManager = LinearLayoutManager(this@ListOfCharactersActivity)
        }
    }

    private fun observeViewModel() {
        viewModel.characterState.observe(this) { state ->
            when (state) {
                is ListOfCharactersViewState.Success -> adapter.updateAdapter(state.characters)
                is ListOfCharactersViewState.Error -> showError()
            }
        }
    }

    private fun showError() {
        val message = getString(R.string.inexpected_error)
        Toast.makeText(this@ListOfCharactersActivity, message, Toast.LENGTH_SHORT)
            .show()
    }
}
