package Nave

class AguaMineral(cantidadLitros: Double, precio: Double, marca: String, manantialOrigen: String): Bebida(cantidadLitros, precio, marca) {
    var manantialOrigen: String
    init {
        this.cantidadLitros = cantidadLitros
        this.precio = precio
        this.marca = marca
        this.manantialOrigen = manantialOrigen
    }

    constructor(otraAguaMineral: AguaMineral): this(otraAguaMineral.cantidadLitros, otraAguaMineral.precio, otraAguaMineral.marca, otraAguaMineral.manantialOrigen){
    }

    override fun calcular(producto: Bebida, cantidad: Int): Double {
        val resultado = producto.precio * cantidad
        return resultado
    }

    override fun mostrar(): String{
        return "Información del producto\nIdentificación: $identificador\nCapacidad: $cantidadLitros\nPrecio: $precio\nMarca: $marca\nManantial: $manantialOrigen"
    }
}