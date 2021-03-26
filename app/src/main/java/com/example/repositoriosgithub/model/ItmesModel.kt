package com.example.repositoriosgithub.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/*
*Estrutura dos atributos da mesma hierarquia do json do github
*
* Items contem o name que é o nome do repositorio
* a description do repositorio e o owner que é o usuario
*
*o owner tem o login que é o nome do usuario e o url do avatar
*/

@Parcelize //permitir passar items atravez de fragments
data class ItemsModel(val name:String,val owner:Owner,val description:String): Parcelable
@Parcelize
data class Owner(val login:String,val avatar_url:String): Parcelable