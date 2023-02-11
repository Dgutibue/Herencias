package Restaurante

class MenuInfantil: Menu() {
    override var cartaBebidas = mapOf<String, Float>("Refresco" to 1f, "Zumo" to 1.5f, "Otros" to 2f)
    var regalo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            val contenido = "muñeca, soldado"
            if(field !in contenido){
                var respuesta = ""
                do{
                    println("Solo puede eligir entre la mañuca o el soldado")
                    respuesta = readln()
                    field = respuesta
                }while (field !in contenido)
            }
        }
    override fun importe():Float{
        val total = 12f * 1.21f
        return total
    }
    override fun mostrarCarta(){
        super.mostrarCarta()
        println("Hay un regalo a elegir con este menu")
    }
    override fun mostrar(){
        super.mostrar()
    }
}

/*
package Restaurante

fun main(args: Array<String>){
    println("¿Cuántos comensales van a ser? (Máximo 12)")
    var comensales = 0
    var normal = Menu()
    var infantil = MenuInfantil()
    var turno = 0
    var total = 0f
    do{
        comensales = readln().toInt()
        if(comensales > 12){
            println("Error no se puede superar el aforo")
        }
    }while(comensales > 12)
    println("Menu normal")
    println("${normal.mostrarCarta()}")
    println()
    println("Menu infantil")
    println()
    println("${infantil.mostrarCarta()}")

     do{
        println("¿Qué tipo de menu va a tomar?\n1.Normal\n2.Infantil")
        var menu = readln().toInt()
        if(menu == 1){
            println("¿Qué plato va a tomar?")
            var plato = readln()
            normal.principal = plato
            println("¿Qué bebida va a tomar?")
            var bebida = readln().toInt()
            normal.bebida = bebida
            println("¿Que postre va a tomar?")
            var postre = readln().toInt()
            normal.postre = postre
        }else {
            println("¿Qué plato va a tomar?")
            var plato = readln()
            infantil.principal = plato
            println("¿Qué bebida va a tomar?")
            var bebida = readln().toInt()
            infantil.bebida = bebida
            println("¿Que postre va a tomar?")
            var postre = readln().toInt()
            infantil.postre = postre
            println("¿Qué regalo desea? (muñeca/soldado)")
            var regalo = readln()
            infantil.regalo = regalo
            if(total > 140f){
                println("No tienes tanto dinero en la tarjeta")
                break
            }
        }
         total = normal.importe() + infantil.importe()
         turno ++
     }while(turno < comensales)
     println("$total€")
}
 */