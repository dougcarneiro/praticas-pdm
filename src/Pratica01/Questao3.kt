package Pratica01

fun contarOcorrencias(valor: Any, lista: List<Any>): Int {
    var count = 0
    for (item in lista) {
        if (item == valor) count++
    }
    return count
}

fun main() {
    val lista = listOf(1, "hello", 1, true, "hello", 1, 2.5)
    println(contarOcorrencias(1, lista))
    println(contarOcorrencias("hello", lista))
    println(contarOcorrencias(true, lista))
}
