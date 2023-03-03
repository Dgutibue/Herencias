package Banco

class Persona {
    var DNI: String = ""
    protected var cuentas = mutableListOf<Cuenta>()
        get() {
            return field
        }
        set(value) {
            if(cuentas.size > 3){
                println("No se puede tener más de 3 cuentas.")
            }
        }

    fun aniadirCuenta(nuevaCuenta: Cuenta){
        cuentas.add(nuevaCuenta)
    }

    fun moroso(){
        for(i in cuentas){
            if(i.saldo < 0){
                println("Tienes en la cuenta con número ${i.numeroCuenta} un saldo negativo de ${i.saldo}")
            }
        }
    }
    fun mostrar(){
        println("Cliente con DNI: $DNI")
        for(i in cuentas){
            println("Número de cuenta: ${i.numeroCuenta} saldo: ${i.saldo} ")
        }
    }
}