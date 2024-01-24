package com.example.personagensdisney.listofcharacters.presentation.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.personagensdisney.databinding.ItemOfListCharactersBinding
import com.example.personagensdisney.listofcharacters.domain.entity.Data
import com.squareup.picasso.Picasso

internal class CharacterViewHolder(private val binding: ItemOfListCharactersBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(data: Data) {
        Picasso.get()
            .load(data.imageUrl)
            .into(binding.imgCharacter)
        binding.txtNameCharacter.text = data.name
        binding.lstOfFilms.text = data.getTop3Films()
    }
}
