package cap03_intermediario

fun main() {
	var mapping = hashMapOf("chave01" to 1, "chave02" to 2, "chave03" to 3)

	//adicionar apenas um valor
	mapping.put("chave04", 4)

	//remover
	mapping.remove("chave02")

	//mostrando os valores, por FOR
	for (chavando in mapping.keys){
		println("$chavando:${mapping.get(chavando)}")
	}//for (chavando in mapping.keys){

}//fun main (args:Array<String>){
