package br.edu.ifsp.scl.trykotlinsdm

fun main() {
    var nome: String
    //nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Lopes"

    // println(sobrenome.capitalize())          // Erro de compiliação
    // println(sobrenome.length)                // Erro de compiliação

    // println(sobrenome!!.capitalize())        // Força rodar o código, mesmo correndo risco de NullPointerException
    // println(sobrenome!!.length)              // Força rodar o código, mesmo correndo risco de NullPointerException

    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    // Possíveis solução: Try - Catch, if (sobrenome) != null
}