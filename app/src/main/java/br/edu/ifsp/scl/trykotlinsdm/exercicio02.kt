package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Eu", "Gustavo"),
            Pair("Irmão", "Guilherme"), Pair("Mãe", "Martina"), Pair("Pet", "Lola"))

    familiaMap.forEach{f -> println("${f.key} - ${f.value}")}
}