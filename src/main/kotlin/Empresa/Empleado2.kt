package Empresa

open class Empleado2: Persona2 {
    var fecha_contrato: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do{
                    println("Debe de haber una fecha de inicio")
                    field = readln()
                }while(field == "")
            }
        }
    var sueldo_base: Float = 0f
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0f){
                do{
                    println("El sueldo no puede ser 0")
                    field = readln().toFloat()
                }while(field == 0f)
            }
        }
    var base_horas_extras: Float = 0f
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0f){
                do{
                    println("La base de las horas no puede ser 0")
                    field = readln().toFloat()
                }while(field == 0f)
            }
        }
    var num_hora: Int = 0
    //constructor(nombre: String, apellidos: String, DNI: String):this(){
    constructor(nombre: String, apellido: String, DNI: String, fecha_contrato: String, sueldo_base: Float, num_hora: Int, base_horas_extras: Float) :super(nombre,apellido,DNI){
        this.base_horas_extras = base_horas_extras
        this.fecha_contrato = fecha_contrato
        this.sueldo_base = sueldo_base
        this.num_hora = num_hora
    }

    open fun calcular_sueldo(): Float{
        var sueldo_total = sueldo_base + (base_horas_extras * num_hora)
        return sueldo_total
    }

    override fun mostrar_info(): String{
        return "Nombre: $nombre\nApellidos: $apellidos\nDNI: $DNI\nFecha de inicio: $fecha_contrato\nSueldo base: $sueldo_base€\nNúmeros de horas mes: $num_hora\nTotal a cobrar: ${calcular_sueldo()}€"
    }

}