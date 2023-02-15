package restaurante

class MenuInfantil(Primero : String, Segundo : Int, Tercero : Int, Cuarto : String):Menu(Primero,Segundo,Tercero) {
    var regalo:String = ""
        get() = field
        set(value) {
            if (value !in arrayOf("muñeca", "soldado")) {
                println("error")
                regalo = readln()
            }else field = value
        }

    init {
        regalo = Cuarto
        super.equivalentesBebida[2]="Zumo"

    }

    constructor():
            this("", 0, 0, "muñeca")

    override fun importe(): Float {
        return (12).toFloat()
    }

    override fun mostrar(): String {
        return "${super.mostrar()} y $regalo de regalo"
    }
}