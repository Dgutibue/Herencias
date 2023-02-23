package MyOnlineShop

class Camara: Electronicos {
    constructor(regularPrice: Double, IVA: Int, numeroProducto: Int, manufactura: String): super(regularPrice, IVA, numeroProducto, manufactura)
    override fun computeSalePrice():Double{
        var total = regularPrice * IVA * 0.7
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 205
    }
}