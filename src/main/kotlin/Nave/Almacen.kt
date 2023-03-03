package Nave

class Almacen {
    var estanterias: MutableMap<String,MutableList<Bebida>> = mutableMapOf()
    fun precioTotal(): Double{
        var suma = 0.0
        for(i in estanterias.values){
            for(n in i){
                suma += n.precio
            }
        }
        return suma
    }

    fun precioMarca(marca: Bebida): Double{
        var suma = 0.0
        for(i in estanterias.values)
            for(n in i){
                if(marca.marca == n.marca){
                    suma += n.precio
                }
            }
        return suma
    }
    fun precioEstanteria(){
        var total = 0.0
        for((c,v) in estanterias){
            for(c2 in estanterias.keys){
                for(n in v){
                    if(c == c2){
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
    fun agregarAmenor(bebida: Bebida){
        var pequenia = 1
        for(i in estanterias.values){
            if(i.size < pequenia){
                pequenia = i.size
            }
        }
        for((c, v) in estanterias){
            if(v.size == pequenia){
                estanterias[c]?.add(bebida)
            }
        }
    }
    fun agregarMismaMarca(bebida: Bebida){
        var suma = 0
        var total = 0
        for((c,v) in estanterias){
            for(c2 in estanterias.keys){
                for(n in v){
                    if(c == c2 && n.marca == bebida.marca){
                        suma ++
                        if(suma > total){
                            total = suma
                        }
                    }
                }
            }
            if(suma == total){
                estanterias[c]?.add(bebida)
            }
            suma = 0
        }

    }
    fun mostrarInformacion(bebida: Bebida){
        println(bebida.mostrar())
    }
    fun mostrarEstanterias(){
        for((c,v) in estanterias){
            println("Inventario en el estante $c: ")
            for(n in v){
                println("${n.marca}")
            }
        }
    }
}

