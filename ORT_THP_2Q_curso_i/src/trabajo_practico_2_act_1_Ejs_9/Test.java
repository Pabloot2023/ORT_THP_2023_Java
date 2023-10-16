package trabajo_practico_2_act_1_Ejs_9;

public class Test {

    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio("Yatay", 240, "Almagro");
        Persona fulano = new Persona(12345678, "Fulano", "Gómez", domicilio);
        Persona mengana = new Persona(9123456, "Mengana", "Torres", domicilio);

        CuentaBancaria cajaDeAhorro = new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO, fulano);
        CuentaBancaria cuentaCorriente = new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, mengana);

        System.out.println("Cuenta de Fulano:\n" + cajaDeAhorro + "\n");
        System.out.println("Cuenta de Mengana:\n" + cuentaCorriente);
    }
}
