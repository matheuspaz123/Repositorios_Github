package com.example.repositoriosgithub

//estrutura dos atributos da mesma hierarquia do json do github
data class GitModel (val item: Items)
data class Items(val name: String, val owner: Owner, val description: String)
data class Owner(val login: String,val avatar_ur: String )