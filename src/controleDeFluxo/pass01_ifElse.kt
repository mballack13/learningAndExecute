package controleDeFluxo

fun main(args: Array<String>) {
    var user_idade: Int = 22
    var menorIdade: Int = 17

    //modo01 {maneira clássica}

    if (user_idade < menorIdade) {
        println("você tem a idade de "+user_idade+". Sendo assim, não pode beber e tirar CNH ")
    }//if (idade < menorIdade) {

    else if (user_idade == menorIdade)
    {println("tens "+user_idade+" anos.... Quase lá, ainda não dá! ")}

    else{println("tens "+user_idade+" anos.... PODE TUDO! ")}

/*===========================================================================================*/

    //usando uma linha
    // var mostrando: String = if (user_idade > menorIdade) "dono do próprio nariz" else "chama o resposável"


    //usando N linhas
    var mostrando: String =
            if (user_idade > menorIdade){
                println("sua idade é de "+user_idade)
                "é maior de idade"}

            else {"é menor de idade"}

    println(mostrando);

}//fun main() {





