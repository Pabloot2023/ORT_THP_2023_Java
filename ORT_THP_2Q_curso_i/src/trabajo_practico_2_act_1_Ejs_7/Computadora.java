package trabajo_practico_2_act_1_Ejs_7;

public class Computadora {
    private String marca;
    private String tipo;
    private Procesador procesador;
    private boolean lectoraDVD;

    public Computadora(String marca, String tipo, Procesador procesador, boolean lectoraDVD) {
        this.marca = marca;
        this.tipo = tipo;
        this.procesador = procesador;
        this.lectoraDVD = lectoraDVD;
    }

    public void encender() {
        // Pendiente agregar logica  para encender la computadora
    }

    public void apagar() {
        // Pendiente agregar logica  para apagar la computadora
    }

    public void reiniciar() {
        // Pendiente agregar logica  para reiniciar la computadora
    }
}