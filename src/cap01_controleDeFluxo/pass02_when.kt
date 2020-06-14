package cap01_controleDeFluxo

fun main(args: Array<String>) {
    var opcao: Int = 2

    when (opcao)
    {
        1 -> println("conta corrente")
        2 -> println("cartao de credito")
        3 -> println("internet banking")
        else -> {
            println("nenhuma opção encontrada")
            println("fale com um dos nossos atendentes")
        }
    }//when (opcao)

    println("\n\n")

//neste tipo de situação, deverá ocorrer um WHEN com um ELSE
// no final..assim como no exemplo do ifELSE
    var opcaoSelecionada = when (opcao)
    {
        1 -> println("Banco Inter")
        2 -> println("Jequiti")
        3 -> println("Baú da Felicidade")
        else -> {
            println("olha o gás!!")
            "afinal, nenhuma opção foi encontrada"
        }
    }//var opcaoSelecionada = when (opcao)

    //println("as opções selecionadas foram: $opcao \n $opcaoSelecionada")
    println("as opções selecionadas foram: "+opcao+" e também: "+opcaoSelecionada)
}//fun main() {