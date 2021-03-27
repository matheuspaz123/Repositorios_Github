package com.example.repositoriosgithub.UI.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.repositoriosgithub.UI.adapter.GitAdapter
import com.example.repositoriosgithub.R
import com.example.repositoriosgithub.UI.viewmodel.GitViewModel
import com.example.repositoriosgithub.model.ItemsModel
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private var mAdapter = GitAdapter()
    private lateinit var mGitViewModel: GitViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)



        iniciandoListeners(view)

        gerarRecycler()

        criarRecyclerView(view)


        return view
    }


    //iniciar listeners
    private fun iniciandoListeners(view: View) {

        //listener para o item de busca
        view.home_barra_busca.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            // ao auterar o texto do item de busca ele manda para o adapter filtrar e gerar uma nova lista
            override fun onQueryTextChange(newText: String?): Boolean {
                mAdapter.filter.filter(newText)
                return false
            }

        })
    }

    //cria o recyclerview
    private fun criarRecyclerView(view: View) {
        val homeRecycler = view.home_recycler

        homeRecycler.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
        }

    }


    // pega e passa a lista obtida para o adapter
    private fun gerarRecycler() {

        mGitViewModel = ViewModelProvider(this).get(GitViewModel::class.java)
        mGitViewModel.getMutableList().observe(viewLifecycleOwner, Observer<List<ItemsModel>> {

            if (it != null) { //se o retrofit retornar a lista, ele manda para o adapter

                mAdapter.setData(it as ArrayList<ItemsModel>)
                mAdapter.notifyDataSetChanged()

            } else {  //se o retrofit não retornar nada apresenta a mensagem de erro
                Toast.makeText(context, "Erro ao se comunicar com o servidor", Toast.LENGTH_SHORT).show()
            }
        })
        mGitViewModel.getRepositorio()

    }

}