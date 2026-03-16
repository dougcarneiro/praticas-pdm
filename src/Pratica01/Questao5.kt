package Pratica01

fun encontrarPosicoes(valor: Int, matriz: Array<Array<Int>>) {
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            if (matriz[i][j] == valor) {
                println("Posição: [$i][$j]")
            }
        }
    }
}

fun main() {
    val matriz = arrayOf(
        arrayOf(3, 7, 2),
        arrayOf(8, 1, 7),
        arrayOf(4, 9, 7)
    )

    val maior = maiorValor(matriz)
    println("Maior valor: $maior")
    println("Posições do maior valor:")
    encontrarPosicoes(maior, matriz)
}
