package RentCar

abstract class vehiculoTransporte(): Vehiculo() {
    var numeroPlazas: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0){
                do{
                    println("Las plazas no pueden ser negativas o igual a 0")
                    field = readln().toInt()
                }while (field <=0)
            }
        }
    constructor(matricula: String, duracion: Int, numeroPlazas: Int):this(){
        this.numeroPlazas = numeroPlazas
    }

    override fun alquiler(): Double {
        TODO("Not yet implemented")
    }

    override fun recibo(): String {
        return "Matrícula: $matricula\nDuración: $duracion días\nPlazas: $numeroPlazas\nimporte: ${alquiler()}€"
    }
}