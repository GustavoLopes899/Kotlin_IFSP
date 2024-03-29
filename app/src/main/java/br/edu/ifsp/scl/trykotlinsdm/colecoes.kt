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

    val listaInteiros_IntRange: List<Int> = (1..10).toList()

    // Percorrer com for usando IntRange
    println("Lista com For")
    for (i in 0..9) {
        println(listanInteiros[i])
    }
    // listaInteiros.add(11) -> Erro - Lista imutável
    // listaInteiros = listof() -> Erro - referÊncia é imutável

    val listaInteiros_IntRangeStep: List<Int> = (1..10 step 2).toList()     // Salta de dois em dois

    println("Lista com IntRange")
    for (i in 0..listaInteiros_IntRangeStep.size - 1) {
        println(i)
    }

    // forEach - lambda
    println("Lista usando forEach")
    listaInteiros_IntRangeStep.forEach{ x: Int -> println(x) }

    var aLista: ArrayList<String> = ArrayList()

    // Lista mutável
    val listaCursos: MutableList<String> = mutableListOf("Análise e Desenvolvimento de Sistemas",
            "Sistema para Dispositivos Móveis")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.forEach { println(it) }         // Argumento padrão do forEach -> it

    // Set e MutableSet
    val setCursos: MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.forEach {println(it) }

    // Map e MutableMap
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Eu", "Gustavo"), Pair("Irmão", "Guilherme"))
    familiaMap.put("Mãe", "Martina")
    familiaMap.put("Pet", "Lola")
    familiaMap.forEach {println(it) }
}