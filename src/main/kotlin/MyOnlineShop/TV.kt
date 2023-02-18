package MyOnlineShop

class TV: Electronicos {
    var tamanio: Int
    constructor(regularPrice: Double, manaufactura: String, tamanio: Int): super(regularPrice, manaufactura){
        this.tamanio = tamanio
    }
    override fun computeSalePrice():Double{
        val total = regularPrice * 0.8
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 100.0
    }
}