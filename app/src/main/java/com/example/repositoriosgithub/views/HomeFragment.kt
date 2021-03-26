package com.example.repositoriosgithub.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.repositoriosgithub.adapter.GitAdapter
import com.example.repositoriosgithub.R
import com.example.repositoriosgithub.model.Items
import com.example.repositoriosgithub.model.Owner
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private var mAdapter = GitAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)



        gerarRecycler()

        val homeRecycler = view.home_recycler
        homeRecycler.adapter = mAdapter
        homeRecycler.layoutManager = LinearLayoutManager(context)

        return view
    }

    //configura o recycler
    fun iniciarRecyclerView(view: View) {

    }

    // passa a lista para o adapter
    fun gerarRecycler() {
        val list = ArrayList<Items>()
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )
        list.add(
            Items(
                "nome",
                Owner(
                    "login",
                    "Url avatar"
                ),
                "descrição"
            )
        )

        mAdapter.setData(list)
        mAdapter.notifyDataSetChanged()

    }


}