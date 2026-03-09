package Pratica02

data class Livro(var titulo: String, var autor: String, var anoPublicao: Int) {
    constructor(titulo: String, autor: String) : this(titulo, autor, 2026)

    init {
        if (anoPublicao > 2026) {
            throw Exception("Ano de publicação inválido.")
        }
    }
}

fun main() {
    val livro1 = Livro("teste", "autor teste", 2026)
    println(livro1)
}
