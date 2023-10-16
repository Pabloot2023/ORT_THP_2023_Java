package trabajo_practico_2_Ej_7;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Computadora computadora;
    private boolean descansando;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.descansando = false; // Inicialmente, la persona no está descansando
    }

    public String getNombre() {
        return nombre;
    }

    public void trabajar() {
        if (computadora != null) {
            System.out.println(" ");
            System.out.println(nombre + " está trabajando en su computadora.");
        } else {
            System.out.println(" ");
            System.out.println("No se ha asignado una computadora a " + nombre + ". No puede trabajar.");
        }
    }

    public void descansar() {
        if (!descansando) {
            descansando = true;
            System.out.println(" ");
            System.out.println(nombre + " está descansando.");
        } else {
            System.out.println(" ");
            System.out.println(nombre + " ya está descansando.");
        }
    }

    public void despertar() {
        descansando = false;
    }

    public void asignarComputadora(Computadora computadora) {
        this.computadora = computadora;
        System.out.println(" ");
        System.out.println(nombre + " ha recibido una computadora de marca " + computadora.getMarca() + ".");
    }

    public boolean isDescansando() {
        return descansando;
    }
}
