package MyOnlineShop

abstract class Producto {
    var regularPrice:Double
    constructor(regularInitialPrice:Double){
        regularPrice=regularInitialPrice
    }
    abstract fun computeSalePrice():Double
    abstract fun computeSpecialCustomerPrice(): Double
}

/*
fun main(args: Array<String>){
    var pedido: Array<Producto> = arrayOf(TV(1000.0, "Samsung", 30), TV(2000.0, "Sony", 50), MP3Player(250.0, "Apple", "Blue"), Book(34.0, "Sun press", 1992), Book(15.0, "Korean press", 1985))
    for(producto in pedido){
        println("${producto.javaClass} precio de regular: ${producto.regularPrice}, precio de venta: ${producto.computeSalePrice()}, precio especial:  ${producto.computeSpecialCustomerPrice()}")
    }
}
 */