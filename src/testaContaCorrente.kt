public fun testaContaCorrente() {
    val contaCorrente = ContaCorrente("Rangel", 123456)
    val contaPoupanca = ContaPoupanca("Luciana", 234567)


    contaPoupanca.depositar(120.00)
    contaCorrente.depositar(120.00)

    contaCorrente.sacar(120.0)
    contaPoupanca.sacar(120.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
}