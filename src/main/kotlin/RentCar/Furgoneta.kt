package RentCar

class Furgoneta: vehiculoCarga {
    constructor(matricula: String, duracion: Int, tara: Double):super(matricula, duracion, tara)

    override fun alquiler(): Double {
        val total = (duracion * 50) + (20 * tara)
        return total
    }

    override fun recibo() {
        println("---------")
        println(this.javaClass)
        println("---------")
        super.recibo()
    }
}