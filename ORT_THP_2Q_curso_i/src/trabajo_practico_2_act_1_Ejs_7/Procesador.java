package trabajo_practico_2_act_1_Ejs_7;

public class Procesador {
    private String marca;
    private String modelo;
    private int temperatura;

    public Procesador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = 0;
    }

    public void validarTemperatura() {
        if (temperatura >= 90) {
            System.out.println("Temperatura crítica alcanzada. Notificando al usuario.");
        } else {
            System.out.println("Temperatura actual: " + temperatura + "°C");
        }
    }
}
