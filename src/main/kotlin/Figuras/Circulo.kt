package Figuras
import kotlin.math.*
class Circulo: Figura(), Printable {
    var radio: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("El radio no puedes ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    fun obtenerDiametro(): Double{
        val diametro = radio * 2
        return diametro
    }
    override fun calculaPermitro(): Double{
        val perimetro = PI*obtenerDiametro()
        return perimetro
    }
    override fun calculaArea(): Double{
        var area = PI * sqrt(radio)
        return area
    }
    override fun printScreen(){
        println(radio)
    }
}