package Carta

class PruebaCarta: CartaGenerica() {
    var generica = CartaGenerica("sin palo", 4)
    val spain = CartaSpain("Oros", 12)
    val francesa = CartaFrancesa("Picas", 12)


    override fun mostrarCarta(): String{
        return super.mostrarCarta() + ""
    }

}


/*
package Restaurante

import Carta.CartaFrancesa
import Carta.CartaGenerica
import Carta.CartaSpain

fun main(args: Array<String>){
    val carta = CartaSpain()
    val Francesa = CartaFrancesa()
    val generica = CartaGenerica()
    generica.palo = "palo"
    generica.numero = 5
    carta.numero = 12
    carta.palo = "Oros"
    Francesa.numero = 1
    Francesa.palo = "Trebol"
    carta.mostrarCarta()
    Francesa.mostrarCarta()
    generica.mostrarCarta()
}
 */