package RentCar

class Bus(): vehiculoTransporte() {
    constructor(matricula: String, duracion: Int, numeroPlazas: Int):this()

    override fun alquiler(): Double {
        val total = ((duracion * 50) + (numeroPlazas * 1.5)) + (numeroPlazas * 2)
        return total
    }

    override fun recibo(): String {
        println("---------")
        println(this.javaClass)
        println("---------")
        return super.recibo()
    }
}
