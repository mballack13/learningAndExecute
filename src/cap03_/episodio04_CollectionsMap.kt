package cap03_

fun main (args: Array<String>){
var mapiando = hashMapOf("chave01" to 1, "chave02" to 2, "israel" to 3)

	//add valor
	mapiando.put("mballack", 9)

	//removendo valor..só poderá ser pelo valor certo que foi add & ñ dá pra usar/passar um numero inteiro
	mapiando.remove("chave01")


	for (chave in mapiando.keys){
		println("$chave: ${mapiando.get(chave)}")
	}//for

}//fun main (args: Array<String>){