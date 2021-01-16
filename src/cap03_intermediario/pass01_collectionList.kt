package cap03_intermediario

fun main() {
	val arrayzando = arrayListOf("joão", "maria", "israel")

	//adicionando um valor no array
	arrayzando.add("puuuuuuxo")
	println(arrayzando)


	//removendo..
	//pelo id==>
	//arrayzando.removeAt(2)

	//pelo próprio valor mesmo==>
	//arrayzando.remove("maria")


	//println("\n\n agora é atualmente: ")
	//println(arrayzando)


	//verificar o tamanho do array... com o .size
	//println("tamanho da array é de..: "+arrayzando.size)

	//verificar se está vazia (true OR false)...com o .isEmpty
	println("está vazia? "+arrayzando.isEmpty())


	/*
	   var arrayzando = arrayListOf("joão", "maria", "israel")
	   comparando se existe um elemento dentro da array, exatamente naquele valor (retorna um true OU false)

	   neste caso:
		  println("contem este valor? "+arrayzando.contains("cássia"))


	   irá retornar FALSE pois não existe no vetor, este nome.
	 */

	println("===========================================")

	//fazer navegação, usando FOR...
	for (vaiPassando in arrayzando){   println(vaiPassando)   }

}//fun main (args: Array<String>){
