package Nave

abstract class Bebida(cantidadLitros: Double, precio: Double, marca: String)  {
    var cantidadLitros: Double = 0.0
    var precio: Double = 0.0
    var marca: String = ""
    protected var identificador: Int = 0

    constructor(otraBebida: Bebida): this(otraBebida.cantidadLitros, otraBebida.precio, otraBebida.marca){

    }
    companion object{
        var contador: Int = 0
    }
    init {
        contador += 1
         identificador = contador
    }
   fun  getId():Int{
        return identificador
    }
    abstract fun calcular(producto: Bebida, cantidad: Int): Double
    abstract fun mostrar(): String

}