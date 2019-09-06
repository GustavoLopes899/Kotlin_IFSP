package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // List (Imutável) / MutableList (mutável)
    var familia: List<String> = listOf("Guilherme", "Gustavo", "Martina", "Odair", "Paula")


    // familia.add("Lola") -> Erro por que a lista é imutável

    // Percorrer com for
    for (integrante in familia) {
        println(integrante)
    }

    // Lista de inteiros
    val listanInteiros: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Percorrer com for usando IntRange
    for (i in 0..9) {
        println(listanInteiros[i])
    }
    // listaInteiros.add(11) -> Erro - Lista imutável
    // listaInteiros = listof() -> Erro - referÊncia é imutável

    //
}