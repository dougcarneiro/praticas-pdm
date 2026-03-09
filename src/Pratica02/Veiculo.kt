package Pratica02

open class Veiculo(
    val marca: String,
    val modelo: String
) {
    open fun exibirInfo() {
        println("Marca: $marca")
        println("Modelo: $modelo")
    }
}

class Carro(
    marca: String,
    modelo: String,
    val quantidadePortas: Int
) : Veiculo(marca, modelo) {

    override fun exibirInfo() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Quantidade de portas: $quantidadePortas")
    }
}

fun exibirDados(veiculo: Veiculo) {
    veiculo.exibirInfo()
}

fun main() {
    val veiculo = Veiculo("Honda", "CG 160")
    val carro = Carro("Toyota", "Corolla", 4)
    veiculo.exibirInfo()
    carro.exibirInfo()
    exibirDados(veiculo)
    exibirDados(carro)
}