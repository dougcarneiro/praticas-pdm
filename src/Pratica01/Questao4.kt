package Pratica01

fun maiorValor(matriz: Array<Array<Int>>): Int {
    var maior = matriz[0][0]
    for (linha in matriz) {
        for (valor in linha) {
            if (valor > maior) maior = valor
        }
    }
    return maior
}

fun main() {
    val matriz = arrayOf(
        arrayOf(3, 7, 2),
        arrayOf(8, 1, 5),
        arrayOf(4, 9, 6)
    )
    println("Maior valor: ${maiorValor(matriz)}")
}
