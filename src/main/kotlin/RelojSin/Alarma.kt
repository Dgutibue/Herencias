package RelojSin

class Alarma {
    var reloj: Reloj = Reloj()
    var horaAlarma: Int = 0
    var minutoAlarma: Int = 0

    fun setTime(hora: Int, minuto: Int, segundo: Int){
        reloj.horas = hora
        reloj.minutos = minuto
        reloj.segundos = segundo
    }
    fun display(){
        reloj.display()
    }
    fun setAlarma(hora: Int, minuto: Int){
        horaAlarma = hora
        minutoAlarma = minuto

    }
    fun tictac(){
        reloj.tictac()
        display()
        comprobar(reloj)
    }
    fun comprobar(reloj: Reloj){
        if(reloj.horas == horaAlarma && reloj.minutos == minutoAlarma){
            println("Alarma sonando")
        }
    }
}