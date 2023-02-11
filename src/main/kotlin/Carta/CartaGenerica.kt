package Carta

open class CartaGenerica() {
    open var palo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do {
                    println("Este campo no puede estar vacio")
                    field = readln()
                }while(field == "")
            }
        }
    open var numero: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0){
                do {
                    println("Este campo no puede ser 0")
                    field = readln().toInt()
                }while(field == 0)
            }
        }
    constructor(palo:String, numero: Int):this(){
        this.palo = palo
        this.numero = numero
    }

    open fun mostrarCarta(){
        println("La carta es el número $numero de $palo")
    }

}