package cap03_

fun main (args: Array<String>){
	var setando = hashSetOf(1,2,4,4,60,60,70)

	//adicionando
	setando.add(510)

	//removendo
	setando.remove(60)

	for (mostrando in setando){print(""+mostrando+",")}

}//fun main (args: Array<String>){