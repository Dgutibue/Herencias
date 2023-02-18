package MyOnlineShop

class MP3Player: Electronicos {
    var color: String
    constructor(regularPrice: Double, manufactura: String, color: String): super(regularPrice, manufactura){
        this.color = color
    }
    override fun computeSalePrice():Double{
        val total = regularPrice * 0.9
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 15
    }
}