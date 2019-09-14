package br.edu.ifsp.scl.trykotlinsdm

fun multiplica(vararg numeros: Double): Double {
    if (numeros.size == 0) {
        return 0.0
    }
    var resultado: Double = 1.0
    numeros.forEach{ resultado *= it}
    return resultado
}

fun multiplica2(vararg numeros: Double) =
        if (numeros.size == 0)
            0.0
        else {
            var resultado: Double = 1.0
            numeros.forEach { resultado *= it }
            resultado
        }

fun main() {
    val listaPar: List<Double> = listOf(1.2, 3.5, 4.0, 20.3)
    println(multiplica(*listaPar.toDoubleArray()))
}