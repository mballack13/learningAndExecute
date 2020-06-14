package cap01_controleDeFluxo

fun main(args: Array<String>) {
//apenas de um tipo, neste exemplo, de string
    var arrayTipando01 = arrayOf("SP", "RJ")

//apenas de bem misturado
    var arrayTipando02 = arrayOf(1, "Porto Alegre", 4)

//declaração já definida e única, como neste exemplo, de inteiros
    var inteiros =  intArrayOf(30, 56, 995, 3)

//mostrando na tela apenas uma posição
    //println(arrayTipando01[1])

/*
mostrando a posição, juntamente com o conteudo do array..para poder
fazer o procedimento, utilizar a função    withIndex()

não podendo ser array mesclado e sim do mesmo tipo & também
do mesmo tamanho
*/
for ((index, inteirando) in inteiros.withIndex())
{ println("posição: $index --- valor: $inteirando")}

println("\n\n")

    var arrayEstadosBR = arrayOf("RS", "PR", "SC")
    var arrayCapitaisEst = arrayOf("Porto Alegre", "Curitiba", "Florianópolis")
    var capitaisEstados = arrayCapitaisEst + arrayEstadosBR


    for (estadando in capitaisEstados){
        println("capital: $estadando")
    }//for ((index,inteiro) in arrayTipando02.withIndex()){


}//fun main(args: Array<String>) {