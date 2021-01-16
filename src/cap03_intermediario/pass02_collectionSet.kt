package cap03_intermediario

fun main() {
	var setValores01 = hashSetOf(3,2,5,8,8,60,1,60)

	//adicionar elemento
	setValores01.add(7)

	//remover elemento
	setValores01.remove(60)

	//mostrar elementos
	for (mostraItem in setValores01)
	{println(""+mostraItem)}
}//fun main (args: Array<String>){
