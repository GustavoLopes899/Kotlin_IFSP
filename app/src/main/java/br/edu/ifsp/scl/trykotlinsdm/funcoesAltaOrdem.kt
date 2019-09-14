package br.edu.ifsp.scl.trykotlinsdm

fun processaTexto(str1: String, str2: String, processa: (String, String) -> String) = processa(str1, str2)

// Função Concatena
fun concatena(a: String, b: String): String {
    return "${a}${b}"
}

// Função Inverte
fun inverte(a: String, b: String) = "${b.reversed() + a.reversed()}"

fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    val listaStrings: MutableList<String> = mutableListOf()
    /*for (s in this) {
        listaStrings.add(funcao(s))
    }*/
    this.forEach {listaStrings.add(funcao(it))}
    return listaStrings.toList()
}

fun primeiraLetra(str: String): String = str.first().toString()

fun <P> List<P>.paraCada (funcao: (P) -> P): List<P> {
    val retornoList: MutableList<P> = mutableListOf()
    this.forEach { retornoList.add(funcao(it))}
    return retornoList
}

fun incrementa(i: Int) = i + 1

fun dobra(f: Float) = 2 * f

fun main() {
    println(processaTexto("Olá, ", "Mundo", ::concatena))
    println(processaTexto("Olá, ", "Mundo", ::inverte))
    println(processaTexto("Olá, ", "Mundo") {a, b -> inverte(a, b)})
    println(processaTexto("Olá, ", "Mundo") {a, b -> "${b.reversed() + a.reversed()}"})

    val listaNomes: List<String> = listOf("Gustavo", "Unesp", "São Carlos", "Tamara", "Amor", "Você", "Ovo")
    val listaPrimeiraLetra: List<String> = listaNomes.paraCadaString(::primeiraLetra)
    listaPrimeiraLetra.forEach{print(it)}

    val listaInteiros: List<Int> = (0..3).toList()
    val listaIncrementados: List<Int> = listaInteiros.paraCada(::incrementa)
    listaIncrementados.forEach {println(it)}

    val listaFloats: List<Float> = listOf(1f, 2f, 3f)
    val listaDobrados: List<Float> = listaFloats.paraCada {x -> dobra(x)}
    val listaDobrados2: List<Float> = listaFloats.paraCada {2 * it}
    listaDobrados.forEach {println(it)}
}