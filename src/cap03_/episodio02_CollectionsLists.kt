package cap03_

fun main (args: Array<String>){
	var arrayzando = arrayListOf("joão", "maria", "israel")

	//adicionando um valor no array
	arrayzando.add("puuuuuuxo")

	println(arrayzando)


	//removendo..
		// pelo id
		//arrayzando.removeAt(2)

		//pelo próprio valor mesmo
		//arrayzando.remove("maria")


	//println("\n\n agora é atualmente: ")
	//println(arrayzando)

	println("tamanho da array é de..: "+arrayzando.size)
	println("está vazia? "+arrayzando.isEmpty())


	//comparando se existe um elemento dentro da array..retorna um true OU false
	println("contem este valor? "+arrayzando.contains("cássia"))

	println("=================")

	//fazendo uma navegação pelo FOR
	for (vaiPassando in arrayzando){
		println(vaiPassando)
	}



}//fun main (args: Array<String>){