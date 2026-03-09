package Pratica02

interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(
    val largura: Double,
    val altura: Double
) : FormaGeometrica {

    override fun calcularArea(): Double {
        return largura * altura
    }
}

class Circulo(
    val raio: Double
) : FormaGeometrica {

    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

fun main() {
    val formas: List<FormaGeometrica> = listOf(
        Retangulo(5.0, 3.0),
        Circulo(2.0),
        Retangulo(4.0, 6.0),
        Circulo(3.5)
    )

    for ((indice, forma) in formas.withIndex()) {
        println("Forma ${indice + 1}: área = ${forma.calcularArea()}")
    }
}