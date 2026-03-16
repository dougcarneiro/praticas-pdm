package Pratica01

fun faixaEtaria(idade: Int): String {
    return when {
        idade < 12 -> "criança"
        idade < 18 -> "adolescente"
        idade < 60 -> "adulto"
        else -> "idoso"
    }
}

fun main() {
    println(faixaEtaria(5))
    println(faixaEtaria(15))
    println(faixaEtaria(30))
    println(faixaEtaria(70))
}
