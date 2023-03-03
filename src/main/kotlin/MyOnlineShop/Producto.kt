package MyOnlineShop

abstract class Producto: RealationInterface {
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

    override fun isGreater(otroProducto:Any):Boolean{
        otroProducto as Producto
        if ( otroProducto.regularPrice < this.regularPrice)
            return true
        else
            return false
    }

    override fun isEqual(otroProducto: Any): Boolean {
        otroProducto as Producto
        if (otroProducto.regularPrice == this.regularPrice)
            return true
        else
            return false
    }

    override fun isLess(otroProducto: Any): Boolean {
        otroProducto as Producto
        return otroProducto.regularPrice > this.regularPrice
    }
}

/*

fun main(args: Array<String>){
    val Bravia = TV(1000.0, 21,"Samsung", 30)
    val music =  MP3Player(250.0, 4,  "Apple", "Blue")

    if(Bravia.isGreater(music)) println("La tele es más cara") else println("El mp3 es más caro")
    if(Bravia.isEqual(music)) println("Tienen el mismo precio") else println("No tienen el mismo precio")
    if(Bravia.isLess(music)) println("La tele es más barato") else println("El mp3 es más barato")
}

fun main(args: Array<String>) {
    var pedido: Array<Producto> = arrayOf(
        TV(1000.0, 21,"Samsung", 30),
        TV(2000.0, 21,"Sony", 50),
        MP3Player(250.0, 4,  "Apple", "Blue"),
        Book(34.0, 10, "Sun press", 1992),
        Book(15.0, 10, "Korean press", 1985)
    )
    for (producto in pedido) {
        println("${producto.javaClass} precio de regular: ${producto.regularPrice}, precio de venta: ${producto.computeSalePrice()}, precio especial:  ${producto.computeSpecialCustomerPrice()}, con numero de producto ${producto.numeroProducto} con un IVA de ${producto.IVA}")
    }
}

fun main(args: Array<String>){
    var pedido: Array<Producto> = arrayOf(TV(1000.0, "Samsung", 30), TV(2000.0, "Sony", 50), MP3Player(250.0, "Apple", "Blue"), Book(34.0, "Sun press", 1992), Book(15.0, "Korean press", 1985))
    for(producto in pedido){
        println("${producto.javaClass} precio de regular: ${producto.regularPrice}, precio de venta: ${producto.computeSalePrice()}, precio especial:  ${producto.computeSpecialCustomerPrice()}")
    }
}
 */