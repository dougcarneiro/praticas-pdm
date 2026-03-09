package Pratica02

data class ContaBancaria(var numero: String, var titular: String, var saldo: Double) {
    companion object {
        var counter = 0;
    }

    init {
        counter++
    }

    constructor(numero: String, titular: String) : this(numero, titular, 0.0)

    fun depositar(valor: Double) {
        when {
            valor <= 0 -> throw Exception("Valor inválido.")
            else -> saldo += valor
        }
    }

    fun sacar(valor: Double) {
        when {
            valor <= 0 -> throw Exception("Valor inválido.")
            valor > saldo -> throw Exception("Saldo insuficiente.")
            else -> saldo -= valor
        }
    }

    fun contasCriadas(): Int {
        return counter
    }
}

fun main() {
    val conta1 = ContaBancaria("123", "conta1")
    val conta2 = ContaBancaria("123", "conta2", 1000.0)
    println("Total de contas criadas: ${ContaBancaria.counter}")
    println("Saldo de conta1: ${conta1.saldo}")
    conta1.depositar(100.0)
    println("Saldo de conta1 após deposito: ${conta1.saldo}")
    conta1.sacar(50.0)
    println("Saldo de conta1 após saque: ${conta1.saldo}")
    println("Saldo de conta2: ${conta2.saldo}")
}