package Tienda

class NoPerecedero(nombre: String, precio: Double, tipo: String): Producto(nombre, precio) {
    var tipo: String
    init {
        this.tipo = tipo
    }

    override fun calcular(cant_prod: Int): Double {
        val resultado = cant_prod * precio
        return  resultado
    }
}