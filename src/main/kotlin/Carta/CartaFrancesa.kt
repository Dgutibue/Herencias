package Carta

class CartaFrancesa(): CartaGenerica() {
    override var palo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if (field !in ("Picas, Corazones, Rombos, Trebol")) {
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
            if (field !in 1..13) {
                do {
                    println("Número de carta incorrecto, ingrese de nuevo")
                    field = readln().toInt()
                } while (field !in 1..13)
            }

        }
    constructor(palo:String, numero: Int):this(){
        this.palo = palo
        this.numero = numero
    }

    override fun mostrarCarta(): String {
        var numero = ""
        when (this.numero){
            1 -> numero = "As"
            11 -> numero = "Sota"
            12 -> numero = "Caballo"
            13 -> numero = "Rey"
            else -> numero = this.numero.toString()
        }
        return "La carta es el número $numero de $palo"
    }
}