package com.example.repositoriosgithub.model


/*
*Estrutura dos atributos da mesma hierarquia do json do github
*
* Items contem o name que é o nome do repositorio
* a description do repositorio e o owner que é o usuario
*
*o owner tem o login que é o nome do usuario e o url do avatar
*/

data class GitModel (val item: Items)
data class Items(val name: String, val owner: Owner, val description: String)
data class Owner(val login: String,val avatar_ur: String )