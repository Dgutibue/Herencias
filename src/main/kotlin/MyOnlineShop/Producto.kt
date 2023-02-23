package MyOnlineShop

abstract class Producto {
    var regularPrice:Double
    var IVA: Int
        get() {
            return field
        }
        set(value) {

            field = value

            do{
                if(field !in tramosIVA){
                    println("Escriba un IVA válido")
                    field = readln().toInt()
                }
            }while (field !in tramosIVA)


        }
    var numeroProducto: Int
        get() {
            return field
        }
        set(value) {

            field = value
            do{
                if(field <= 0){
                    println("Debe de al menos un producto")
                    field = readln().toInt()
                }
            }while (field <= 0)
        }

    companion object {
        val tramosIVA: IntArray = intArrayOf(0,4, 10, 21)
        var contador: Int = 1

    }
    constructor(regularInitialPrice:Double, IVA: Int){
        regularPrice=regularInitialPrice
        this.IVA = IVA
        this.numeroProducto =  contador
        contador += 1
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