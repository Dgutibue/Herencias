package MyOnlineShop

class Book: Producto {
    protected var publisher: String
    protected var yearPublished: Int
    constructor(regularPrice: Double, IVA: Int, publisher: String, yearPublished: Int):super(regularPrice, IVA){
        this.publisher = publisher
        this.yearPublished = yearPublished
    }
    override fun computeSalePrice():Double{
        val total = regularPrice * IVA * 0.5
        return total
    }
    override fun computeSpecialCustomerPrice(): Double{
        return computeSalePrice() - 2
    }
}