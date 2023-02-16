package RentCar

abstract class Vehiculo {
    var matricula: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == "")
                do{
                    println("Ingrese matrícula válida")
                    field = readln()
                }while(field == "")
        }
    var duracion: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0)
                do{
                    println("La duración no puede ser menor a 0 o 0")
                    field = readln().toInt()
                }while(field <= 0)
        }
    constructor(matricula: String, duracion: Int){
        this.matricula = matricula
        this.duracion = duracion
    }
    abstract fun alquiler(): Double

    abstract fun recibo()
}