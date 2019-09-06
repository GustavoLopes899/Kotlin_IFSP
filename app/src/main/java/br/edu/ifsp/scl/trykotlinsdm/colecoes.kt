package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // List (Imutável) / MutableList (mutável)
    var familia: List<String> = listOf("Guilherme", "Gustavo", "Martina", "Odair", "Paula")


    // familia.add("Lola") -> Erro por que a lista é imutável

    // Percorrer com for
    for (integrante in familia) {
        println(integrante)
    }
}