package br.edu.ifsp.scl.trykotlinsdm

// Função simples
/*fun multiplo(a: Int = 10, b: Int): Boolean {
    val c: Int = a % b
    if (c == 0) {
        return true
    }
    return false
}*/

// Single-Expression Function -> Função de apenas "uma linha"
fun multiplo(a: Int = 10, b: Int) = a % b == 0

// if-else como ternário
fun multiple(a: Int = 10, b: Int) = if (a % b == 0) true else false

// Função estendida
fun Int.multiploo(b: Int): Boolean {
    return multiplo(this, b)
}

// Função estendida infixada
infix fun Int.multiplooo(b: Int): Boolean {
    return multiplo(this, b)
}

fun main() {
    println(multiplo(10, 2))
    println(12.multiploo(6))
    println(10 multiplooo 3)

    println(multiplo(b = 2))
}