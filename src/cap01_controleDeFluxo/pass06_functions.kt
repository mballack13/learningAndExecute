package cap01_controleDeFluxo

import java.util.*

fun main (args: Array<String>) {
    /*
    queHorasSao()
    olaMundo()
    */


    somando(50,60)

}//fun main (args: Array<String>)

fun olaMundo        () {println("olá mundão")}
fun queHorasSao     () {return println(Date());}
fun somando(user_var01:Int, user_var02:Int) {
    var resultFinal = user_var01 + user_var02;
    return println("resultado é: $resultFinal")
}