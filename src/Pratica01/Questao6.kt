package Pratica01

fun main() {
    val nomes = mutableListOf<String>()

    var entrada = readLine() ?: ""
    while (entrada != "fim") {
        nomes.add(entrada)
        entrada = readLine() ?: ""
    }

    val imprimirSeB = { nome: String -> if (nome.startsWith("B")) println(nome) }
    nomes.forEach(imprimirSeB)
}
