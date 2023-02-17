package RentCar

class Furgoneta(): vehiculoCarga() {
    constructor(matricula: String, duracion: Int, tara: Double):this()

    override fun alquiler(): Double {
        val total = ((duracion * 50) + (20 * tara))
        return total
    }

    override fun recibo(): String {
        println("---------")
        println(this.javaClass)
        println("---------")
        return super.recibo()
    }
}