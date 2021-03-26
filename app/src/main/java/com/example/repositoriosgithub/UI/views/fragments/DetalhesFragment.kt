package com.example.repositoriosgithub.UI.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.repositoriosgithub.R
import kotlinx.android.synthetic.main.fragment_detalhes.view.*
import java.lang.String.format


class DetalhesFragment : Fragment() {


    private val args by navArgs<DetalhesFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detalhes, container, false)

        bind(view) //bind dos dados recebidos pelo navigation


        // Inflate the layout for this fragment
        return view
    }

    //fazendo o bind dos dados
    private fun bind(view: View){
        val repositorio = args.repositorio
        view.detalhes_tv_repositorio.text = repositorio.name
        view.detalhes_tv_user_name.text = repositorio.owner.login
        view.detalhes_iv_avatar.load( repositorio.owner.avatar_url)
        view.detalhes_tv_descricao.text = format("Descrição: %s" ,repositorio.description)
    }


}