package cap02_oop

//only interfaces
interface Dirigivel     {fun acelerar (velocidade: Long)}
interface Potenciavel   {fun potenciaMinima (pontMinima: Double)}


//only class
open class Veiculo (open var marca:String, open var modelo:String, open var cor:String, open var ano:Int) {

    class Carro(override var marca: String, override var modelo: String,
                override var cor: String, override var ano: Int,
                var capacidadeLugares: Int)
        : Veiculo(marca, modelo, cor, ano),
            Dirigivel {

        //metodo que apenas funciona na classe Carro
        fun abrirPorta  ()  {println("abrindo a porta; modelo..: $modelo")}

        //aqui está sobre-escrevendo a interface que criei
        override fun acelerar   (velocidade: Long)  {println("acelerando o modelo $modelo à $velocidade por hora")}
    }//class Carro


    class Barco(override var marca: String, override var modelo: String,
                override var cor: String, override var ano: Int,
                var comprimento: Float)
        : Veiculo(marca, modelo, cor, ano),
            Dirigivel, Potenciavel {

        //metodo que apenas funciona na classe Barco
        fun informarTipoCasco       (tipoCasco:String)      {println("o material deste Barco, é do tipo $tipoCasco")}

        //aqui está sobre-escrevendo a interface que criei
        override fun potenciaMinima (pontMinima: Double)    {println("este $modelo tem como potencia: $pontMinima HP")}
        override fun acelerar       (velocidade: Long)      {println("acelerando o modelo $modelo à $velocidade por hora")}
    }//class Carro (var cor: String, var ano: Int, var modelo: String){
}//open class Veiculo (open var marca:String, open var modelo:String, open var cor:String, open var ano:Int){

/*================================================================*/
/*================================================================*/


fun main(args: Array<String>){
    /* mais informações sobre o barco, veridicamente:
    https://www.eboat.com.br/barcos.aspx?id=589#:~:text=Lancha%20Phantom%20620%20%2D%20Ficha%20T%C3%A9cnica&text=A%20perfei%C3%A7%C3%A3o%20est%C3%A1%20nos%20grandes,meia%20nau%20e%20su%C3%ADte%20vip.
     */

    //criação de objetos
    //desta maneira, só vai utilizar UMA INTERFACE
    /*
	var obj_veiculo01:Dirigivel = Carro ("Ford", "Mustang", "amarelo", 2010, 5)
		obj_veiculo01.acelerar(159)
		obj_veiculo01.abrirPorta()
		println("é um carro, da cor: ${obj_veiculo01.marca}, modelo ${obj_veiculo01.modelo} na cor ${obj_veiculo01.cor}; ano: ${obj_veiculo01.ano}")


	var obj_veiculo02:Dirigivel = Barco ("Schaefer Yachts", "Phantom 620", "vermelho", 2020, 18.9F)
		obj_veiculo02.acelerar(1547)
		println("é um barco, da cor: ${obj_veiculo02.marca}, modelo ${obj_veiculo02.modelo} na cor ${obj_veiculo02.cor}; ano: ${obj_veiculo02.ano}")

	*/


    //para se ter acesso, neste caso, tanto às interfaces (Dirigivel & Potenciavel ao mesmo tempo)
    var veiculo03 = Veiculo.Barco ("UAI Náutica", "Amazon 145 Mar SR", "rosa choque", 1989, 14.74F)
        veiculo03.acelerar(25)
        veiculo03.potenciaMinima(154.6)
        veiculo03.informarTipoCasco("Alumínio")
}