class Diretor(nome: String, cpf: String, salario: Double, val senha: Int, val plr: Double) :
    Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override val bonificacao: Double
        get() {
            return salario * 0.3 + plr
        }
}