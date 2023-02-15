package Empresa

class Programador:Empleado2 {
    constructor(nombre: String, apellido: String, DNI: String, fecha_contrato: String, sueldo_base: Float, num_hora: Int,base_horas_extras: Float) :super(nombre,apellido,DNI,fecha_contrato, sueldo_base, num_hora, base_horas_extras){
        this.base_horas_extras = base_horas_extras
        this.fecha_contrato = fecha_contrato
        this.sueldo_base = sueldo_base
        this.num_hora = num_hora
    }
    fun pedirVacaciones(): String{
        return "Hay que llegar a la siguiente entrega como sea , hasta entonces nadie puede coger vacaciones"
    }
    fun pedirAumento():String{
        return "El jef ede departamento está de vacaciones inténtelo de nuevo cuando vuelva"
    }
    fun imprimirNomina(){
        println("-------------------")
        println("NÓMINA")
        println("-------------------")
        println("DNI: $DNI\nNombre: $apellidos, $nombre\nSueldo total: ${calcular_sueldo()}€")
    }
}