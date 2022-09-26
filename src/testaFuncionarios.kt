fun testaFuncionarios() {
    val rangel = Diretor(
        "Rangel",
        "038.207.111-55",
        3500.00,
        1234,
        10.00

    )

    val marcus = Gerente(
        "Marcus",
        "038.207.111-55",
        3500.00,
        1234,

        )

    val leo = Analista(
        "maria",
        "123.456.789-10",
        1000.0
    )


    println("nome: ${rangel.nome}")
    println("cpf: ${rangel.cpf}")
    println("salario: ${rangel.salario}")
    println("bonificacao: ${rangel.bonificacao}")


    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.resgistra(marcus)
    calculadoraBonificacao.resgistra(rangel)
    calculadoraBonificacao.resgistra(leo)

    println("Total de bonificacoes: ${calculadoraBonificacao.total}")
}