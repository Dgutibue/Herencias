package MyOnlineShop

class Camara: Electronicos {
    constructor(regularPrice: Double, manufactura: String): super(regularPrice, manufactura)
    override fun computeSalePrice():Double{
        var total = regularPrice * 0.7
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 205
    }
}