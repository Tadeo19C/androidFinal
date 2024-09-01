package com.example.bv.Entities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bv.databinding.NoseBinding

class PerroAdapter(private var usuarios : ArrayList<Perro>) : RecyclerView.Adapter<PerroAdapter.ViewHolderPerro>() {



    inner class ViewHolderPerro(val binding : NoseBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(datosPerro: Perro) {

            binding.apply {

                fragmentName.text = datosPerro.nombre
                fragmentRaza.text = datosPerro.raza
                fragmentEdad.text = datosPerro.edad
                fragmentSexo.text = datosPerro.sexo



            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPerro {

        val binding = NoseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderPerro(binding)

    }
//
//    override fun onBindViewHolder(holder: ViewHolderUsuario, position: Int) {
//        TODO("Not yet implemented")
//    }

    override fun onBindViewHolder(holder: ViewHolderPerro, position: Int) {

        holder.bind(usuarios[position])

    }

    override fun getItemCount(): Int {

        return usuarios.size

    }

    fun updateUsuarios(nuevosUsuarios : ArrayList<Perro>) {

        usuarios = nuevosUsuarios
        this.notifyDataSetChanged()

    }

}