package Tienda

class Perecedero(nombre: String, precio: Double, diasParaCaducar: Int): Producto(nombre, precio) {
    var diasParaCaducar: Int
    init {
        this.diasParaCaducar = diasParaCaducar
    }

    override fun calcular(cant_prod: Int): Double {
        when(diasParaCaducar){
            1 -> {precio = precio-(precio*1/4)}
            2 -> {precio = precio-(precio*1/3)}
            3 -> {precio = precio-(precio*1/2)}
        }
        val resultado = cant_prod * precio
        return  resultado
    }
}