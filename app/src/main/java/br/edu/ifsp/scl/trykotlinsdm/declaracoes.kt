package br.edu.ifsp.scl.trykotlinsdm

// (var | val) var_name [: type] = value

fun main (args: Array<String>) {
    // Mutável - Variables var
    var frase: String = "Hello World"

    // Imprimir variável
    println(frase)

    // Imprimir com String Template
    println("${frase}")

    // Imprimir com chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    // Imprimir com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")
}