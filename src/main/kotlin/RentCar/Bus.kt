package RentCar

class Bus: vehiculoTransporte {
    constructor(matricula: String, duracion: Int, numeroPlazas: Int):super(matricula, duracion, numeroPlazas)

    override fun alquiler(): Double {
        val total = ((duracion * 50) + (numeroPlazas * 1.5)) + (numeroPlazas * 2)
        return total
    }

    override fun recibo() {
        println("---------")
        println(this.javaClass)
        println("---------")
        super.recibo()
    }
}
