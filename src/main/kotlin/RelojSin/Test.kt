package RelojSin

class Test {
    val reloj1 = Reloj()
    init {
        reloj1.horas = 23
        reloj1.minutos = 59
        reloj1.segundos = 59
    for(i in 1..100){
        reloj1.tictac()
        reloj1.display()
    }
    }
}

/*
fun main(args: Array<String>){
    val reloj = Alarma()



    reloj.setAlarma(0,0)
    reloj.setTime(23,58,23)

    for(i in 1..1060){
        reloj.tictac()
    }
}
 */