package RentCar

class Alquiler(): Alquilable {
    var nombre: String = ""
    var cantidad: Int = 0
    var pedidos: MutableMap<String, Vehiculo> = mutableMapOf()
    init {
        this.nombre = "Alquileres Paquito"
        println("------------------")
        println(nombre)
        println("------------------")
        println()
        println("Indique la cantidad que desea alquilar")
        this.cantidad = readln().toInt()
        var contador = 0
        do{
            println(nombre)
            println("----------")
            println("Menu")
            println("----------")
            println("Indique el tipo de vehículo\n1.Coche\n2.Bus\n3.Camión \n4.Furgoneta")
            var eleccion = readln().toInt()
            when (eleccion){
                1 -> {
                    println("Indique el coche que desea alquilar")
                    val tipo = readln()
                    val coche = Coche()
                    println("Ingrese la matrícula")
                    coche.matricula = readln().uppercase()
                    println("Ingrese la duración")
                    coche.duracion = readln().toInt()
                    println("Indique el número de plazas")
                    coche.numeroPlazas = readln().toInt()
                    pedidos[tipo] = coche
                    println(importe(coche))
                }
                2 -> {
                    println("Indique el autbus que desea alquilar")
                    val tipo = readln()
                    val Bus = Bus()
                    println("Ingrese la matrícula")
                    Bus.matricula = readln().uppercase()
                    println("Ingrese la duración")
                    Bus.duracion = readln().toInt()
                    println("Indique el número de plazas")
                    Bus.numeroPlazas = readln().toInt()
                    pedidos[tipo] = Bus
                    println(importe(Bus))
                }
                3 -> {
                    println("Indique el camión que desea alquilar")
                    val tipo = readln()
                    val camion = Camion()
                    println("Ingrese la matrícula")
                    camion.matricula = readln().uppercase()
                    println("Ingrese la duración")
                    camion.duracion = readln().toInt()
                    println("Indique la tara permitida")
                    camion.tara = readln().toDouble()
                    pedidos[tipo] = camion
                    println(importe(camion))
                }
                4 -> {
                    println("Indique el furgoneta que desea alquilar")
                    val tipo = readln()
                    val furgoneta = Furgoneta()
                    println("Ingrese la matrícula")
                    furgoneta.matricula = readln().uppercase()
                    println("Ingrese la duración")
                    furgoneta.duracion = readln().toInt()
                    println("Indique la tara permitida")
                    furgoneta.tara = readln().toDouble()
                    pedidos[tipo] = furgoneta
                    println(importe(furgoneta))
                }
            }
            contador ++
        }while(contador < cantidad)
        println("*****************")
        println("Total alquiler: ${importeTotal()}€")
    }


    fun importe(pos: Vehiculo): String{
        return pos.recibo()
    }


    override fun importeTotal(): Double{
        var total = 0.0
        println("------------------")
        println(this.nombre)
        println("------------------")
        println()
        println("Vehículos a alquilar:")
        for((clave, valor) in pedidos){
            println(clave)
            total += valor.alquiler()
        }
        return total
    }
}


/*
fun main(args: Array<String>){
    val alquiler = Alquiler()
}
 */