package Pratica01

fun verificarNumero(numero: Int): String {
    return if (numero > 0) "positivo" else if (numero < 0) "negativo" else "zero"
}

fun main() {
    println(verificarNumero(10))
    println(verificarNumero(-5))
    println(verificarNumero(0))
}
