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