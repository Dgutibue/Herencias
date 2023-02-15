package Figuras

class Cuadrado: Poligonos() {
    override var numeroLados: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field != 4){
                do{
                    println("El cuadrado tiene que tener 4 lados")
                    field = readln().toInt()
                }while(field != 4)
            }
        }
    override var longitud: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0f){
                do{
                    println("La longitud no pueden ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0f)
            }
        }
    override fun calculaPermitro(): Double{
        val perimetro = numeroLados*longitud
        return perimetro
    }
    override fun calculaArea(): Double{
        var area = longitud*longitud
        return area
    }
}