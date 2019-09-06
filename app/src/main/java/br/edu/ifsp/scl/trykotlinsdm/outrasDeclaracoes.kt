package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // String explícito
    var nome: String = "Gustavo"

    // String implícito
    var sobrenome = "Silva"

    // Inicialização tardia
    var nomeMeio: String    // Quando não se inicializa a variável, o tipo deve ser explícito
    nomeMeio = "Lopes Pereira da"

    // Float
    var altura: Float = 1.74f

    // Inteiro
    var idade: Int = 29

    // Casting (tudo em Kotlin é objeto)
    var peso: Double = 70.toDouble()

    // Imprimindo as variáveis
    println("Nome ${nome} $nomeMeio $sobrenome \nAltura: $altura \nIdade $idade \nPeso: $peso")
}