package RentCar

abstract class vehiculoCarga: Vehiculo {
    var tara: Double = 0.0
    constructor(matricula: String, duracion: Int, tara: Double):super(matricula, duracion){
        this.tara = tara
    }

    override fun alquiler(): Double {
        TODO("Not yet implemented")
    }

    override fun recibo() {
        println("Matrícula: $matricula\nDuración: $duracion\nTara: $tara\nimporte: ${alquiler()}")
    }
}