package Pratica01

fun saudar(nome: String?) {
    if (nome != null) {
        println("Olá, $nome!")
    }
}

fun main() {
    saudar("Maria")
    saudar(null)
    saudar("João")
}
