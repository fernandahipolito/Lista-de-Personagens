package com.example.personagensdisney.listofcharacters.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.personagensdisney.databinding.ItemOfListCharactersBinding
import com.example.personagensdisney.listofcharacters.domain.entity.Character
import com.example.personagensdisney.listofcharacters.presentation.list.viewholder.CharacterViewHolder

internal class CharacterListAdapter() :
    RecyclerView.Adapter<CharacterViewHolder>() {

    private val characters: MutableList<Character> = mutableListOf()
    //criar metodo update list recebe a nova lista e limpa a antiga
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterViewHolder {
        val binding =
            ItemOfListCharactersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CharacterViewHolder(binding)
    }
    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    fun updateAdapter(newListOfCharacters: List<Character>) {
        characters.clear()
        characters.addAll(newListOfCharacters)
        notifyDataSetChanged()
    }
}
