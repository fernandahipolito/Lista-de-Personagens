package com.example.personagensdisney.listofcharacters.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.personagensdisney.databinding.ItemOfListCharactersBinding
import com.example.personagensdisney.listofcharacters.domain.entity.Data
import com.example.personagensdisney.listofcharacters.presentation.list.viewholder.CharacterViewHolder

internal class CharacterListAdapter() :
    RecyclerView.Adapter<CharacterViewHolder>() {

    private val data: MutableList<Data> = mutableListOf()

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
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun updateAdapter(newListOfData: List<Data>) {
        data.clear()
        data.addAll(newListOfData)
        notifyDataSetChanged()
    }
}
