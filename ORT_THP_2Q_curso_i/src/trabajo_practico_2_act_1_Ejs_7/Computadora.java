package trabajo_practico_2_act_1_Ejs_7;

public class Computadora {
    private String marca;
    private String tipo;
    private String procesador;
    private boolean lectoraDVD;
    private boolean encendida;

    public Computadora(String marca, String tipo, String procesador, boolean lectoraDVD) {
        this.marca = marca;
        this.tipo = tipo;
        this.procesador = procesador;
        this.lectoraDVD = lectoraDVD;
        this.encendida = false;
    }

    public Computadora(String marca, TipoComputadora tipo) {
        this.marca = marca;
        this.tipo = tipo.toString();  // Convierte el tipo en un String
        this.encendida = false;
    }


	public String getMarca() {
        return marca;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println(" ");
            System.out.println("La computadora " + marca + " se ha encendido.");
        } else {
            System.out.println(" ");
            System.out.println("La computadora " + marca + " ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println(" ");
            System.out.println("La computadora " + marca + " se ha apagado.");
        } else {
            System.out.println(" ");
            System.out.println("La computadora " + marca + " ya está apagada.");
        }
    }

    public void reiniciar() {
        if (encendida) {
            System.out.println(" ");
            System.out.println("La computadora " + marca + " se está reiniciando.");
            apagar();
            encender();
        } else {
            System.out.println(" ");
            System.out.println("No se puede reiniciar. La computadora " + marca + " está apagada.");
        }
    }
}
