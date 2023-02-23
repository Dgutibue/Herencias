package MyOnlineShop

class Book: Producto {
    var publisher: String
    var yearPublished: Int
    constructor(regularPrice: Double, IVA: Int, numeroProducto: Int, publisher: String, yearPublished: Int):super(regularPrice, IVA, numeroProducto){
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