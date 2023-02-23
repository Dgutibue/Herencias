package MyOnlineShop

fun main(args: Array<String>) {
    var pedido: Array<Producto> = arrayOf(
        TV(1000.0, 21,"Samsung", 30),
        TV(2000.0, 21,"Sony", 50),
        MP3Player(250.0, 21,  "Apple", "Blue"),
        Book(34.0, 21, "Sun press", 1992),
        Book(15.0, 21, "Korean press", 1985)
    )
    for (producto in pedido) {
        println("${producto.javaClass} precio de regular: ${producto.regularPrice}, precio de venta: ${producto.computeSalePrice()}, precio especial:  ${producto.computeSpecialCustomerPrice()}, con numero de producto ${producto.numeroProducto}")
    }
}
