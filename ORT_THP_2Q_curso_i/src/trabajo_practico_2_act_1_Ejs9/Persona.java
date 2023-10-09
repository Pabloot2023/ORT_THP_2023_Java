package trabajo_practico_2_act_1_Ejs9;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona(int dni, String nombre, String apellido, Domicilio domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", DNI: " + dni + ", Domicilio: " + domicilio;
    }
}
