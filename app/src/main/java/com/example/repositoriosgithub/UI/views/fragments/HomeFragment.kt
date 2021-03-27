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
    private fun iniciandoListeners(view: View){
        view.home_barra_busca.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                mAdapter.filter.filter(newText)
                return false
            }

        })
    }


    private fun criarRecyclerView(view: View){
        val homeRecycler = view.home_recycler

        homeRecycler.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
        }

    }



    // passa a lista para o adapter
    private fun gerarRecycler() {

        mGitViewModel = ViewModelProvider(this).get(GitViewModel::class.java)
        mGitViewModel.getMutableList().observe(viewLifecycleOwner, Observer<List<ItemsModel>> {
            if (it != null){
                mAdapter.setData(it as ArrayList<ItemsModel>)
                mAdapter.notifyDataSetChanged()
            }else{
                Toast.makeText(context, "Erro ao comunicar com a Api", Toast.LENGTH_SHORT).show()
            }
        })
        mGitViewModel.getRepositorio()


        //mAdapter.setData()
        //mAdapter.notifyDataSetChanged()

    }

}