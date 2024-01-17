package com.example.personagensdisney.listofcharacters.presentation.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.personagensdisney.databinding.ItemOfListCharactersBinding
import com.example.personagensdisney.listofcharacters.domain.entity.Character

internal class CharacterViewHolder(private val binding: ItemOfListCharactersBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(character: Character) {
        binding.imgCharacter.setImageResource(character.data.imageUrl.toInt())
        binding.txtNameCharacter.text = character.data.name
        binding.lstOfFilms.text = character.data.getTop3Films()
    }
}
