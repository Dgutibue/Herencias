package MyOnlineShop

abstract class Electronicos: Producto {
    protected var manufactura: String
    constructor(regularPrice: Double, IVA: Int, manufactura: String):super(regularPrice, IVA){
        this.manufactura = manufactura
    }
}