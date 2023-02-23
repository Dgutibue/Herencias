package MyOnlineShop

class TV: Electronicos {
    var tamanio: Int
    constructor(regularPrice: Double, IVA: Int, numeroProducto: Int, manaufactura: String, tamanio: Int): super(regularPrice, IVA, numeroProducto, manaufactura){
        this.tamanio = tamanio
    }
    override fun computeSalePrice():Double{
        val total = regularPrice * IVA * 0.8
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 100.0
    }
}