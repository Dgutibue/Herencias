package restaurante

fun main() {
    var cuenta = 0.0
    var contar = 0
    var contarN = 0
    var contarI =  0
    var menu=Menu()
    do{
        println("que menú quiere ? (1 = normal, 2 = infantil) :")
        val respuesta = readln().toInt()
        when (respuesta){
            1-> {menu = Menu()
                println("introduzca principal : \nEntrecot, Pez Espada, Carrillada, Dorada, Otros")
                menu.principal = readln()
                println("introduzca bebida : \nRefresco = 1\nVino = 2\notros")
                menu.bebida = readln().toInt()
                println("introduzca postre : \nFruta = 1\nHelado = 2\nOtros")
                menu.postre = readln().toInt()
                cuenta += menu.importe()
                contar += 1
                contarN += 1}

            2-> {menu = MenuInfantil()
                println("introduzca principal : \nEntrecot, Pez Espada, Carrillada, Dorada, Otros")
                menu.principal = readln()
                println("introduzca bebida : \nRefresco = 1\nZumo = 2\notros")
                menu.bebida = readln().toInt()
                println("introduzca postre : \nFruta = 1\nHelado = 2\nOtros")
                menu.postre = readln().toInt()
                println("introduzca regalo : \nmuñeca, soldado")
                menu.regalo = readln().toString()
                cuenta += menu.importe()
                contar +=1
                contarI += 1}
            else-> println("error")
        }

        print (menu.mostrar())

        println("quieres introducir otro menú (1 si, cualquier otra cosa no)?\n")
        val continuar = readln()
    }while (continuar =="1" && contar <12 && cuenta < 140)
    println("menús normales pedidos = $contarN\nmenús infantiles pedidos = $contarI\nimporte total = $cuenta\nimporte medio por comensal = ${cuenta/contar}")
}