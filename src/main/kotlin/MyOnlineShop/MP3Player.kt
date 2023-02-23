package MyOnlineShop

class MP3Player: Electronicos {
    var color: String
    constructor(regularPrice: Double, IVA: Int, numeroProducto: Int, manufactura: String, color: String): super(regularPrice, IVA, numeroProducto, manufactura){
        this.color = color
    }
    override fun computeSalePrice():Double{
        val total = regularPrice * IVA * 0.9
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 15
    }
}