package RentCar

abstract class Vehiculo() {
    var matricula: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            var asegurar = true
            do{
                for(i in field.slice(0..3)){
                    if(i !in '0'..'9'){
                        println("Las primeras 4 posiciones son dígitos")
                        field = readln().uppercase()
                        asegurar = false
                        break
                    }else asegurar = true
                    for(n in field.slice(4..6)){
                        if(n !in 'A'..'Z'){
                            println("Las últimas 4 posiciones son letras")
                            field = readln().uppercase()
                            asegurar = false
                            break
                        }else asegurar = true
                    }
                }
            }while(asegurar == false)
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
    constructor(matricula: String, duracion: Int):this(){
        this.matricula = matricula
        this.duracion = duracion
    }
    abstract fun alquiler(): Double

    abstract fun recibo(): String
}