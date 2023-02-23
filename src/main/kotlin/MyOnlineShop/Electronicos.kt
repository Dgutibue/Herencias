package MyOnlineShop

abstract class Electronicos: Producto {
    var manufactura: String
    constructor(regularPrice: Double, IVA: Int, numeroProducto: Int, manufactura: String):super(regularPrice, numeroProducto, IVA){
        this.manufactura = manufactura
    }
}