package Nave

class BebidaAzucarada(cantidadLitros: Double, precio: Double, marca: String, porcentajeAzucar: Double, promocion: Boolean): Bebida(cantidadLitros, precio, marca) {
    var porcentajeAzucar: Double = 0.0
    var promocion: Boolean

    init {
        this.cantidadLitros = cantidadLitros
        this.precio = precio
        this.marca = marca
        this.porcentajeAzucar = porcentajeAzucar
        this.promocion = promocion
    }

    constructor(otraBebidaAzucarada: BebidaAzucarada): this(otraBebidaAzucarada.cantidadLitros, otraBebidaAzucarada.precio, otraBebidaAzucarada.marca, otraBebidaAzucarada.porcentajeAzucar, otraBebidaAzucarada.promocion){

    }
    override fun calcular(producto: Bebida, cantidad: Int): Double {
        val resultado = producto.precio * cantidad
        return resultado
    }
    override fun mostrar(): String{
        var promo = ""
        if(promocion == true) promo = "Si" else promo = "No"
        return "Información del producto\nIdentificación: $identificador\nCapacidad: $cantidadLitros\nPrecio: $precio\nMarca: $marca\nPorecentaje de azúcar: $porcentajeAzucar\nPromoción: $promo"
    }
}