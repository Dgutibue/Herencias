package Nave
fun main(args: Array<String>) {
    val almacen = Almacen()
    val bebida1 = AguaMineral(1.5, 2.0, "Lanjaron", "Sierra de Lanjarón")
    val bebida2 = AguaMineral(2.0, 1.5, "Font Bella", "Del grifo")
    val bebida3 = BebidaAzucarada(2.0, 3.2, "Fanta", 10.3, true)
    val bebida4 = BebidaAzucarada(bebida3)
    val bebida5 = BebidaAzucarada(bebida3)
    val bebida6 = AguaMineral(0.75, 1.00, "Lanjaron", "Sierra de Lanjarón")
    var lista: MutableList<Bebida> = mutableListOf()
    var lista2: MutableList<Bebida> = mutableListOf()
    lista.add(bebida1)
    lista.add(bebida2)
    almacen.estanterias["A"] = lista
    almacen.estanterias["B"] = lista2
    almacen.mostrarInformacion(bebida1)
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.mostrarInformacion(bebida2)
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.mostrarInformacion(bebida3)
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.agregarAmenor(bebida3)
    almacen.mostrarEstanterias()
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.agregarMismaMarca(bebida4)
    almacen.mostrarInformacion(bebida4)
    almacen.agregarMismaMarca(bebida5)
    almacen.mostrarInformacion(bebida5)
    almacen.agregarMismaMarca(bebida6)
    almacen.mostrarInformacion(bebida6)
    almacen.mostrarEstanterias()
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.precioEstanteria()
    almacen.eliminarBebida(5)
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    almacen.mostrarEstanterias()
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    println("El precio de la marca ${bebida1.marca} es ${almacen.precioMarca(bebida1)}€ por unidad")
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^")
    println("El precio total del almacen es: ${almacen.precioTotal()}€")
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