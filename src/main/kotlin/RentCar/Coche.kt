package RentCar

class Coche(): vehiculoTransporte() {
    constructor(matricula: String, duracion: Int, numeroPlazas: Int):this()

    override fun alquiler(): Double {
        val total = (duracion * 50) + (numeroPlazas * 1.5)
        return total
    }

    override fun recibo(): String {
        println("---------")
        println(this.javaClass)
        println("---------")
        return super.recibo()
    }
}