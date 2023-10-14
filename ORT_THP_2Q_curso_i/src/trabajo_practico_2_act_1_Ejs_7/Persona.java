package trabajo_practico_2_act_1_Ejs_7;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Computadora computadora;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void trabajar() {
        // Pendiente agregar logica para trabajar
    }

    public void descansar() {
        // Pendiente agregar logica para descansar
    }

    public void asignarComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}