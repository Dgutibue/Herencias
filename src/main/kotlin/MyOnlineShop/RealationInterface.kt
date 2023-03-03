package MyOnlineShop

interface RealationInterface {
    abstract fun isGreater(otroProducto:Any):Boolean
    abstract fun isLess(otroProducto:Any):Boolean
    abstract fun isEqual(otroProducto:Any):Boolean
}