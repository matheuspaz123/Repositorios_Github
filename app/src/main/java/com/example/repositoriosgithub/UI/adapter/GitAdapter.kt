package com.example.repositoriosgithub.UI.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.repositoriosgithub.R
import com.example.repositoriosgithub.UI.views.fragments.HomeFragmentDirections
import com.example.repositoriosgithub.model.ItemsModel
import kotlinx.android.synthetic.main.item_repositorio.view.*
import java.util.*
import kotlin.collections.ArrayList

//Classe com o adapter e o viewholder do recyclerview

class GitAdapter() : RecyclerView.Adapter<GitAdapter.GitViewHolder>(), Filterable {
    private var listaGit = ArrayList<ItemsModel>()
    private var listaGitBackUp = ArrayList<ItemsModel>()

    class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //variaveis para fazer o binding
        val userNameTv = itemView.recycler_tv_usuario
        val repositorio = itemView.recycler_tv_repositorio


        //função para o bind
        fun bind(data: ItemsModel, itemView: View) {
            userNameTv.text = data.owner.login
            repositorio.text = data.name

            setListener(data, itemView)
        }

        //configurando o listener de cada view para abris os detalhas do repositorio
        private fun setListener(data: ItemsModel, itemView: View) {

            //enviando o repositorio para o fragmento detalhes
            val detalhesFragArgs = HomeFragmentDirections.actionHomeFragmentToDetalhesFragment(data)
            itemView.setOnClickListener {
                itemView.findNavController().navigate(detalhesFragArgs)
            }

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
        holder.bind(listaGit[position], holder.itemView)//fazendo o bind dos itens nas views
    }

    //passando a lista para a variavel glogal
    fun setData(lista: ArrayList<ItemsModel>) {
        this.listaGit = lista
        listaGitBackUp =
            if (lista.size > listaGitBackUp.size) lista else listaGitBackUp //garante que a o backUp da lista fique original
        notifyDataSetChanged()
    }


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString() //recebe o carecter do menu de pesquisa
                val resultList = ArrayList<ItemsModel>() //recebe os itens se conterem os caracteres

                //faz a filtragem dos nomes dos repositorios que contem os caracteres digitados
                if (charSearch.isNotEmpty()) {
                    for (row in listaGitBackUp) {
                        if (row.name.toLowerCase(Locale.ROOT)
                                .contains(charSearch.toLowerCase(Locale.ROOT))
                        ) {
                            resultList.add(row)
                        }
                    }
                }


                val filterResults = FilterResults()
                filterResults.values = resultList
                return filterResults
            }

            //manda o vetor novo para o vetor global do adapter
            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                val lista = results?.values as ArrayList<ItemsModel>
                setData(lista)
            }

        }
    }

}