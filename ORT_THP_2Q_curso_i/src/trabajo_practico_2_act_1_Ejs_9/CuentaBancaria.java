package trabajo_practico_2_act_1_Ejs_9;

import java.util.Random;

public class CuentaBancaria {
	
    private String cbu;
    private TipoDeCuenta tipo;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(TipoDeCuenta tipo, Persona titular) {
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = 0;
        this.cbu = generarCBU();
    }

    private String generarCBU() {
    	int tipoOrdinal;
    	int dni;
    	int ultimoDigitoDNI;
    	
        Random random = new Random();
        tipoOrdinal = tipo.ordinal() + 10; // Añade 10 al ordinal del tipo
        dni = titular.getDni();
        ultimoDigitoDNI = dni % 10;

        return String.format("%02d-%08d-%d", tipoOrdinal, dni, ultimoDigitoDNI);
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean extraer(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CBU: " + cbu + "\nTipo de Cuenta: " + tipo + "\nSaldo: $" + saldo + "\nTitular: " + titular;
    }
}
