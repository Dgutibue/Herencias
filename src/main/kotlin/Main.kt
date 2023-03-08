package Tienda
fun main(args: Array<String>) {
    val manzana = Perecedero("", 1.2, 2)
    val pera = Perecedero("pera", -1.0, 3)
    val pollo = Perecedero("pollo", 10.3, 5)
    val pasta = NoPerecedero("colgate", 5.4, "Higiene")
    val pelicula = NoPerecedero("Terminator", 15.3, "Ocio")
    val compra = Compra()
    compra.comprar(manzana)
    compra.comprar(pera)
    compra.comprar(pollo)
    compra.comprar(pasta)
    compra.comprar(pelicula)
    println("-------\nFACTURA\n-------\n${manzana.nombre}........${manzana.calcular(1)}€\n${pera.nombre}........${pera.calcular(1)}€\n${pollo.nombre}........${pollo.calcular(1)}€\n${pasta.nombre}........${pasta.calcular(1)}€\n${pelicula.nombre}........${pelicula.calcular(1)}€\nTotal........${compra.calcularPrecio()}€")
}

/*
val Bravia = TV(1000.0, 21,"Samsung", 30)
    val music =  MP3Player(250.0, 4,  "Apple", "Blue")

    if(Bravia.isGreater(music)) println("La tele es más cara") else println("El mp3 es más caro")
    if(Bravia.isEqual(music)) println("Tienen el mismo precio") else println("No tienen el mismo precio")
    if(Bravia.isLess(music)) println("La tele es más barato") else println("El mp3 es más barato")


val cliente1 = Persona()
    var cuenta1 = Cuenta(21000000, 2500.43)
    var cuenta2 = Cuenta(21000000, 500.43)
    var cuenta3 = Cuenta(21000000, 1500.43)
    cliente1.DNI = "75769348D"
    cliente1.aniadirCuenta(cuenta1)
    cliente1.aniadirCuenta(cuenta2)
    cliente1.aniadirCuenta(cuenta3)
    cliente1.mostrar()
 */