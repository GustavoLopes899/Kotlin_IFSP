package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    val listaCursos: MutableList<String> = mutableListOf("Análise e Desenvolvimento de Sistemas",
            "Sistemas para Dispositivos Móveis", "Técnico em Informática para Internet")

    val listaSistemas: MutableList<String> = mutableListOf()
    for (curso in listaCursos) {
        if (curso.contains("Sistemas", true)) {
            listaSistemas.add(curso)
        }
    }
    println("Lista filtrada pela palavara 'Sistemas', ignorando capitalização:")
    for (i in 0 until listaSistemas.size) {
        println("$i - ${listaSistemas[i]}")
    }

    // Usando Lambda Filter
    val listaSistemasFilter: List<String> = listaCursos.filter { x -> x.contains("Sistemas", true) }
    println("Lista filtrada pela palavara 'Sistemas', ignorando capitalização, usando Lambda Filter:")
    for (i in listaSistemasFilter.indices) {
        println("$i - ${listaSistemasFilter[i]}")
    }
}