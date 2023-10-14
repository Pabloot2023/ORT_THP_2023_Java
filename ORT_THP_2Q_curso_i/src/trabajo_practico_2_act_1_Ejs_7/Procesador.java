package trabajo_practico_2_act_1_Ejs_7;

public class Procesador {
    private String marca;
    private String modelo;
    private int temperaturaActual;
    private int temperaturaCritica;
    private boolean notificarTemperaturaCritica;

    public Procesador(String marca, String modelo, int temperaturaCritica) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperaturaActual = 0;
        this.temperaturaCritica = temperaturaCritica;
        this.notificarTemperaturaCritica = false;
    }

    public void aumentarTemperatura(int incremento) {
        // Pendiente agregar logica  para aumentar la temperatura y verificar si es crítica
    }

    public void notificarTemperaturaCritica() {
        notificarTemperaturaCritica = true;
        // Pendiente agregar logica  para notificar temperatura crítica
    }
}