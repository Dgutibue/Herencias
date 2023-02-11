package Restaurante
open class Menu() {
    protected var cartaPrincipal = mapOf<String, Float>("Entrecot" to 15f, "Pez espada" to 12f, "Carrillada" to 10f, "Dorada" to 20f, "Otros" to 13f)
    protected open var cartaBebidas = mapOf<String, Float>("Refresco" to 1f, "Vino" to 1.5f, "Otros" to 2f)
    protected var cartaPostres = mapOf<String, Float>("Fruta" to 2f, "Helado" to 3f, "Otros" to 4f)
    protected val IVA: Float = 21f
        get() {
            return field
        }
    var descuento: Float = 15.0f
        get() {
            return field
        }
    var principal: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var bebida: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var postre: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(principal: String, bebida: Int, postre: Int) : this() {
        this.principal = principal
        this.bebida = bebida
        this.postre = postre

    }
    open fun importe():Float{
        var cantidad: Float? = null
        var sumaTotal = 0f
        when {
            principal in cartaPrincipal.keys -> {
                cantidad = cartaPrincipal[principal]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
        }
        when(bebida){
            1 -> {
                cantidad = cartaBebidas["Refresco"]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
            2-> {
                cantidad = cartaBebidas["Vino"]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
            else -> {
                cantidad = cartaBebidas["Otros"]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
        }
        when(postre){
            1 -> {
                cantidad = cartaPostres["Fruta"]
                if (cantidad != null) {
                    sumaTotal += cantidad
                }
            }
            2 -> {
                cantidad = cartaPostres["Helado"]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
            else -> {
                cantidad = cartaPostres["Otros"]
                if(cantidad != null){
                    sumaTotal += cantidad
                }
            }
        }
        sumaTotal *= IVA/100 + 1
        sumaTotal -= sumaTotal * (descuento/100)
        return sumaTotal
    }
    open fun mostrarCarta(){
        println("De comer")
        for((i,n) in cartaPrincipal){
            println("$i............$n€")
        }
        println("**************************")
        println("De beber")
        for((i,n) in cartaBebidas){
            println("$i............$n€")
        }
        println("**************************")
        println("Postres")
        for((i,n) in cartaPostres){
            println("$i............$n€")
        }
    }
    open fun mostrar () {
        val total = importe()
        var beber = ""
        var postres = ""
        when (bebida) {
            1 -> beber = "Refresco"

            2 -> beber = "Vino"

            3 -> beber = "Otros"
        }
        when (postre) {
            1 -> postres = "Fruta"

            2 -> postres = "Helado"

            3 -> postres = "Otros"
        }
        println("Su consumición es:")
        println()
        println("$principal................${cartaPrincipal[principal]}€\n" +
                "$beber....................${cartaBebidas[beber]}€\n" +
                "$postres...................${cartaPostres[postres]}€\n" +
                "IVA.....................$IVA%\n" +
                "Descuento...............$descuento%\n" +
                "Total...................$total€")
    }
}

/*
val IVA: Float = 1.21f
        get() {
            return field
        }
    var descuento: Float = 15.0f
        get() {
            return field
        }
    var principal: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            for ((i, n) in cartaPrincipal) {
                if (principal == i) {
                    println("El $i vale $n€")
                }
            }
        }
    var bebida: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value

            if (field == 1) {
                println("El refresco vale ${cartaBebidas["Refresco"]}")
            } else if (field == 2) {
                println("El vino vale ${cartaBebidas["Vino"]}")
            } else println("Bebida distinta vale ${cartaBebidas["Otros"]}")
        }
    var postre: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if (field == 1) {
                println("La pieza de fruta vale ${cartaPostres["Fruta"]}")
            } else if (field == 2) {
                println("El helado vale ${cartaPostres["Helado"]}")
            } else println("Otro prostre vale ${cartaPostres["Otros"]}")
        }
 */