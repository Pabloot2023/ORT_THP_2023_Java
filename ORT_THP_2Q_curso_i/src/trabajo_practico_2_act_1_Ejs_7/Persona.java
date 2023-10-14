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
    	System.out.println(" ");
        System.out.println(nombre + " está descansando.");
    }

    public void asignarComputadora(Computadora computadora) {
        this.computadora = computadora;
        System.out.println(nombre + " ha recibido una computadora de marca " + computadora.getMarca() + ".");
    }

}