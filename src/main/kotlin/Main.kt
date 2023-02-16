import RentCar.Bus
import RentCar.Coche

fun main(args: Array<String>){
    val fiatPanda = Coche("2741FMC", 3, 4)
    fiatPanda.alquiler()
    fiatPanda.recibo()
    val autobus = Bus("5674MOP", 5, 45)
    autobus.alquiler()
    autobus.recibo()
}