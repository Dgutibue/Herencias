package Nave

class Almacen {
    var estanterias: MutableMap<String, MutableList<Bebida>> = mutableMapOf()
    fun precioTotal(): Double {
        var suma = 0.0
        for (i in estanterias.values) {
            for (n in i) {
                suma += n.precio
            }
        }
        return suma
    }

    fun precioMarca(marca: Bebida): Double {
        var suma = 0.0
        for (i in estanterias.values)
            for (n in i) {
                if (marca.marca == n.marca) {
                    suma += n.precio
                }
            }
        return suma
    }

    fun precioEstanteria() {
        var total = 0.0
        for ((c, v) in estanterias) {
            for (c2 in estanterias.keys) {
                for (n in v) {
                    if (c == c2) {
                        total += n.precio
                    }
                }
            }
            println("El precio total de la estanteria $c es $total€")
            total = 0.0
        }
    }

    fun agregarBebida(estanteria: String, bebida: Bebida) {
        estanterias[estanteria]?.add(bebida)
    }

    fun agregarAmenor(bebida: Bebida) {
        var pequenia = mutableListOf<Int>()
        for (i in estanterias.values) {
            pequenia.add(i.size)
            /*if (i.size < pequenia) {
                pequenia = i.size
            }

             */
        }
        for ((c, v) in estanterias) {
            if (v.size == pequenia.min()) {
                estanterias[c]?.add(bebida)
                break
            }
        }
    }

    fun agregarMismaMarca(bebida: Bebida) {
        var suma = 0
        var total = 0
        for ((c, v) in estanterias) {
            for (n in v) {
                if (n.marca == bebida.marca) {
                    suma++
                    if (suma > total) {
                        total = suma
                    }
                }
            }
            if (suma == total && suma > 0) {
                estanterias[c]?.add(bebida)
            }
            suma = 0
        }
    }
        fun eliminarBebida(id: Int){
            for((c, v) in estanterias){
               // for(n in v){
                for(n in (0..v.size -1)){
                    //if(n.getId() == id){
                    if (v[n].getId()==id){
                        //estanterias: MutableMap<String, MutableList<Bebida>> = mutableMapOf()
                        estanterias[c]?.removeAt(n)
                       // estanterias[c].remove(n)

                    }
                }
            }
        }

        fun eliminarMarca(marca: String){
            for ((c,v) in estanterias){
                v.removeIf { it.marca == marca }
            }
        }

        fun borrarEstanteria(Estanteria: String) {
            val listaBebidas = mutableListOf<Bebida>()
            for ((c, v) in estanterias) {
                if (c == Estanteria) {
                    for (n in v) {
                        listaBebidas.add(n)
                    }
                }
            }
            estanterias.remove(Estanteria)
            for(i in listaBebidas){
                agregarAmenor(i)
            }
        }
            fun mostrarInformacion(bebida: Bebida) {
                println(bebida.mostrar())
            }


            fun mostrarEstanterias() {
                for ((c, v) in estanterias) {
                    println("Inventario en el estante $c: ")
                    for (n in v) {
                        println("${n.marca}")
                    }
                }
            }

}
/*
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
 */