abstract class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

    abstract fun sacar(valor: Double)

    fun depositar(valor: Double) {
        this.saldo += valor
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }


}