package RelojSin

open class Reloj {
    var horas: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value > 24){
                var resto = value%24
                field = value + resto
            }else field = value
        }
    var minutos: Int= 0
        get() {
            return field
        }
        set(value) {
            if (value >= 60){
                var resto = value/60
                field = value%60
                horas +=resto
            }else field = value
        }
    var segundos: Int= 0
        get() {
            return field
        }
        set(value) {
            if (value >= 60){
                var resto = value/60
                field = value%60
                minutos +=resto
            }else field = value
        }
    fun setTime(hora: Int, minuto: Int, segundo: Int){
        horas = hora
        minutos = minuto
        segundos = segundo
    }
    fun display(){
        var hora = ""
        var minuto = ""
        var segundo = ""
        if(horas < 10){
            hora = "0" + horas.toString()
        }else hora = horas.toString()
        if(horas == 24){
            hora = "00"
            horas = 0
        }else hora = horas.toString()
        if(minutos < 10){
            minuto = "0" + minutos.toString()
        }else minuto = minutos.toString()
        if(segundos < 10){
            segundo = "0" + segundos.toString()
        }else segundo = segundos.toString()
        println("$hora:$minuto:$segundo")


    }
    fun tictac(){
        segundos ++
    }
}