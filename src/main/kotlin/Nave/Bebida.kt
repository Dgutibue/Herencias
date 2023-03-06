package Nave

abstract class Bebida(cantidadLitros: Double, precio: Double, marca: String)  {
    var cantidadLitros: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            while(field <= 0.0){
                println("Este parámetro no puede ser 0 o menor que 0")
                field = readln().toDouble()
            }
        }
    var precio: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            while(field <= 0.0){
                println("Este parámetro no puede ser 0 o menor que 0")
                field = readln().toDouble()
            }
        }
    var marca: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            while(field ==""){
                println("Este parámetro no puede estar vacio")
                field = readln()
            }
        }
    protected var identificador: Int = 0

    constructor(otraBebida: Bebida): this(otraBebida.cantidadLitros, otraBebida.precio, otraBebida.marca){
            this.identificador = otraBebida.identificador
            contador --
    }
    companion object{
        private var contador: Int = 0
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