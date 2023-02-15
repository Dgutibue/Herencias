package Carta

class CartaSpain(): CartaGenerica() {
    override var palo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if (field !in ("Oros, Espadas, Copas, Bastos")) {
                do {
                    println("Palo inválido, ingrese uno valido")
                    field = readln()
                } while (field == "")
            }
        }
    override var numero: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if (field !in 1..12) {
                do {
                    println("Número de carta incorrecto, ingrese de nuevo")
                    field = readln().toInt()
                } while (field !in 1..12)
            }

        }
    constructor(palo:String, numero: Int):this(){
        this.palo = palo
        this.numero = numero
    }


    override fun mostrarCarta(): String {
        var numero = ""
        when (this.numero){
            10 -> numero = "Sota"
            11 -> numero = "Caballo"
            12 -> numero = "Rey"
            else -> numero = this.numero.toString()
        }
        return "La carta es el número $numero de $palo"
    }
}