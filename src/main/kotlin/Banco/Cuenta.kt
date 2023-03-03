package Banco

class Cuenta {
    var saldo: Double = 0.0
    var numeroCuenta: Int = 2000

    companion object {
        var contador: Int = 0

    }

    constructor(saldo: Double){
        contador += 1
        numeroCuenta += contador
        this.saldo = saldo
    }
    fun consultarSaldo(): String{
        return "Su saldo es $saldo€"
    }
    fun recibirAbonos(cuentaDestino: Cuenta, cantidad: Double){
        if(saldo - cantidad < 0){
            println("Saldo insuficiente.")
        }else cuentaDestino.saldo += cantidad
    }

    fun retirarDinero(cantidad: Double){
        if(saldo - cantidad < 0){
            println("Saldo insuficiente")
        }else saldo -= cantidad
    }

    fun ingresar(cantidad: Double){
        saldo += cantidad
    }
}