fun testeCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Balance is positive")
        saldo == 0.0 -> println("Balance is neutral")
        else -> println("Balance is negative")
    }
}