
import cap02_oop.DataLivro
import cap03_intermediario.Bussola
import cap03_intermediario.Direcao


fun main() {
	val obj_bussula = Bussola()
	var obj_livrando = DataLivro("fantastico mundo de bob", "puxoLokoLoko", 1987)

	//mostrar o valor
	//print(""+obj_bussula.direcionamento)

	//mudar o valor...
	obj_bussula.direcionamento = Direcao.SUL

	//mostrar o valorFinal
	print(""+obj_bussula.direcionamento)
	print("\n\n "+obj_livrando)
}//fun main (args:Array<String>){