package orientacaoAhObj

class Livro (val titulo: String, val autor:String, val ano: Int)

data class DataLivro (val titulo: String, val autor:String, val ano: Int)





fun main (args: Array<String>){
	val livrando	= Livro ("AndroidPro Livro", "Fillipe Cordeiro", 2017)
	val livrando2	= Livro ("AndroidPro Livro", "Fillipe Cordeiro", 2017)

	val userDataL	= DataLivro("AndroidPro Livro", "Fillipe Cordeiro", 2017)
	val userDataL2	= DataLivro("AndroidPro Livro", "Fillipe Cordeiro", 2017)

	//printando na tela, fazendo comparações...
	println("o livro é igual? "+livrando.equals(livrando2))
	println("o data livro é igual? "+userDataL.equals(userDataL2))

}//fun main (args: Array<String>){