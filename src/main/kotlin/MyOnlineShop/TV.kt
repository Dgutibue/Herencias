package MyOnlineShop

class TV: Electronicos {
    protected var tamanio: Int
    constructor(regularPrice: Double, IVA: Int, manaufactura: String, tamanio: Int): super(regularPrice, IVA, manaufactura){
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