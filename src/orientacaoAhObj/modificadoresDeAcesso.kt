package orientacaoAhObj

open class Animal{
	private		var nome	= "Maria"		//apenas vista, neste caso, pela classe animal
	protected	var ano		= 2014			//vista pelas classes "PAI e FILHAS"
	internal	val tipo	= "Mamífero"	//acesso e modificação apenas no mesmo módulo
	var quantPatas 			= 4				//acesso e modificação total
}//open class Animal{

class Cachorro
	:Animal(){

	fun descobrirIdade(){ println("idade é de..: "+(2017-ano))}
	fun latido (){ println("au au au!")}
}//class Cachorro



fun main (args: Array<String>){
	val marie = Cachorro()

	marie.descobrirIdade()
	println(marie.tipo)
}//fun main (args: Array<String>){