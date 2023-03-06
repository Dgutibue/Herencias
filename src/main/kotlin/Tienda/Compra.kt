package Tienda

import kotlin.math.roundToInt

class Compra {
    val listaCompra: MutableList<Producto> = mutableListOf()
    fun comprar(producto: Producto){
        listaCompra.add(producto)
    }
    fun calcularPrecio(): Double{
        var suma = 0.0
        for(i in listaCompra){
            suma += i.precio
        }
        return suma
    }
}