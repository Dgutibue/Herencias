package RentCar

class Alquiler: Alquilable {
    val nombre: String = "Alquileres Paquito"
    
    override fun importeTotal(): Double{
        return 1.0
    }
}