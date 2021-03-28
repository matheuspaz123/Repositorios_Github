# Aplicativo Repositorios do Github



## Descrição

Um aplicativo para fazer buscas dos repositorios publicos que estão na plataforma do github e exibir detalhes sobre o mesmo em uma lista. A lista contem o nome do repositorio como tambem o login(nome de usuario) do repositorio. Cada item da lista ao ser selecionado exibe as informações adicionais dos repositorios, táis como avatar do no, nome do repositorio, nome do dono do repositorio e a descrição do mesmo.



## Status do projeto

Projeto do aplicativo concluido 



## Tópicos


<!--ts-->
   
   * [Aplicativo Repositorios do Github](#aplicativo-repositorios-do-github)
   * [Descrição](#descricao)
   * [Status do projeto](#status-do-projeto)
   * [Tópicos](#topicos)
   * [Pré-Requisitos e instalação](#pre-requisitos-e-instalacao)
      * [No android](#no-android)
      * [Com o Android Studio](#com-o-android-studio)
   * [Tecnologias utilizadas](#tecnologias-utilizadas)
      * [BackEnd](#backend)
      * [FrontEnd](#frontend) 
   * [Autor](#autor)
   * [License](#license)
<!--te-->





## Pré-Requisitos e instalação

#### 1. No android

Para uso na plataforma android é necessario que o Sistema Operacional seja Lolipop ou superior. Para a instalação do aplicativo, você terá que habilitar a instalação de fontes desconhecidas e em seguida instalar o aplicativo que esta contido no link a seguir encurtador.com.br/lAU02.



#### 2. Com o Android Studio

Com o Android studio é recomendado a versão mais recente ou 4.0 superior. Para clonar o projeto na IDE do android studio basta seguir os passos abaixo:



Na tela de bem vindo do android studio clique em Get from version control

![1](https://user-images.githubusercontent.com/65925406/112752907-aed05300-8fab-11eb-85fe-3476bd389fe5.png)





Em seguida cole o link: https://github.com/matheuspaz123/Repositorios_Github.git em URL
E clique em clone

![2](https://user-images.githubusercontent.com/65925406/112753013-4cc41d80-8fac-11eb-81ba-4d2815004f25.png)





















## Tecnologias utilizadas




#### BackEnd

1. Chamadas assíncronas com CallBack
2. Retrofit2 para comunicação com a API do github
3. Conversor Gson que passa o objeto json para objeto kotlin
4. Filterable para filtar a lista
5. ViewModel e LifeCycle


#### FrontEnd

1. Navigation compose
2. SafeArgs para transferencias entre fragments sincronas com Parsalize
3. RecyclerView
4. Coil para ixibir as imagens dos usuarios























## Autor
![autor](https://user-images.githubusercontent.com/65925406/112754021-9f9fd400-8fb0-11eb-8ac1-c60916fe8758.png)


## License

The MIT License (MIT)

Copyright (c) <2021> <Matheus Rodrigues Paz da Silva

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

