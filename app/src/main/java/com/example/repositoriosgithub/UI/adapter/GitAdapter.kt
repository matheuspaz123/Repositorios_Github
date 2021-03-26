package com.example.repositoriosgithub.UI.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.repositoriosgithub.R
import com.example.repositoriosgithub.model.ItemsModel
import kotlinx.android.synthetic.main.item_repositorio.view.*

//Classe com o adapter e o viewholder do recyclerview

class GitAdapter() : RecyclerView.Adapter<GitAdapter.GitViewHolder>() {
    private var listaGit = ArrayList<ItemsModel>()

    class GitViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        //variaveis para fazer o binding
        val userNameTv = itemView.recycler_tv_usuario
        val repositorio = itemView.recycler_tv_repositorio


        //função para o bind
        fun bind(data: ItemsModel){
            userNameTv.text = data.owner.login
            repositorio.text = data.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
        return GitViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_repositorio,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listaGit.size
    }

    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
        holder.bind(listaGit[position])
    }

    //passando a lista para a variavel glogal
    fun setData(lista: List<ItemsModel>){
        this.listaGit.addAll(lista)
    }

}