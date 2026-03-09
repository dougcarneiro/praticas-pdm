package Pratica02

abstract class Funcionario(
    val nome: String,
    val salarioBase: Double
) {
    abstract fun calcularSalarioTotal(): Double

    open fun exibirDados() {
        println("Nome: $nome")
        println("Salário base: R$ $salarioBase")
        println("Salário total: R$ ${calcularSalarioTotal()}")
    }
}

class Gerente(
    nome: String,
    salarioBase: Double,
    val bonus: Double
) : Funcionario(nome, salarioBase) {

    override fun calcularSalarioTotal(): Double {
        return salarioBase + bonus
    }

    override fun exibirDados() {
        println("Nome: $nome")
        println("Salário base: R$ $salarioBase")
        println("Bônus: R$ $bonus")
        println("Salário total: R$ ${calcularSalarioTotal()}")
    }
}

fun main() {
    val gerente = Gerente("Carlos", 5000.0, 1500.0)

    gerente.exibirDados()
}