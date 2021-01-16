package cap02_oop

class Livro (val titulo: String, val autor:String, val ano:Int){
	override fun toString(): String {
		return "Livro{titulo=$titulo}"
	}
}//class Livro (...)

data class DataLivro(val titulo: String, val autor:String, val ano:Int)
{}//data class Livro (...)


fun main() {
	//criar objeto
	val obj_livro01 = Livro("Introdução à Programação", "Einstein", 2017)
	val obj_livro02 = Livro("Introdução à Programação", "Einstein", 2017)

	val obj_dataLivro01 = DataLivro("Introdução à Programação", "Einstein", 2017)
	val obj_dataLivro02 = DataLivro("Introdução à Programação", "Einstein", 2017)

	/*
	se colocar:
		val obj_dataLivro01 = DataLivro("Introdução à Programação", "Einstein", 2017)
		val obj_dataLivro02 = DataLivro("Introdução à Programação", "Einstein", 2017)
	irá aparecer como resultado TRUE, pois o DATA CLASS trabalha com o conteúdo.....caso colocar, como exemplo,
	o autor com outro nome, irá dar o resultado FALSE pois não são iguais

	DataClasse compara valor de cada atributo.

	* */


	//apenas mostrar
	println(""+obj_livro01)
	println(""+obj_dataLivro01)

	println("\n\n")

	//mostrar e comparar
	println("Livro Igual?...." + obj_livro01.equals(obj_livro02)) //usando classe normal
	println("DataLivro Igual?...." + obj_dataLivro01.equals(obj_dataLivro02)) //usando dataClasse
}//fun main (args:Array<String>){
