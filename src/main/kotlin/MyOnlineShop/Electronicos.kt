package MyOnlineShop

abstract class Electronicos: Producto {
    var manufactura: String
    constructor(regularPrice: Double, manufactura: String):super(regularPrice){
        this.manufactura = manufactura
    }
}