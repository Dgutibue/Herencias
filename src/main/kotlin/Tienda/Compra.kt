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

/*
fun main(args: Array<String>) {
    val manzana = Perecedero("", 1.2, 2)
    val pera = Perecedero("pera", -1.0, 3)
    val pollo = Perecedero("pollo", 10.3, 5)
    val pasta = NoPerecedero("colgate", 5.4, "Higiene")
    val libro = NoPerecedero("Terminator", 15.3, "Ocio")
    val compra = Compra()
    compra.comprar(manzana)
    compra.comprar(pera)
    compra.comprar(pollo)
    compra.comprar(pasta)
    compra.comprar(libro)
    println("-------\nFACTURA\n-------\n${manzana.nombre}........${manzana.calcular(1)}€\n${pera.nombre}........${pera.calcular(1)}€\n${pollo.nombre}........${pollo.calcular(1)}€\n${pasta.nombre}........${pasta.calcular(1)}€\n${libro.nombre}........${libro.calcular(1)}€\nTotal........${compra.calcularPrecio()}€")
}
 */