package cap03_

fun main (args: Array<String>){
	try {
		print("digite um número..: ")
		val numero: Int = readLine()!!.toInt()
		val divisao: Int = 100 / numero
		println("o resultado é $divisao")
	}

	catch (e: Exception) {print("erro foi este aqui:  ${e.message}")}

	finally {println("programa finalizado")}

}//fun main (args: Array<String>){