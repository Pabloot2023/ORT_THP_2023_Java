package trabajo_practico_2_Ej_10;

public class Robot {
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + ". ¿En qué puedo ayudarte?");
    }

    public void saludar(Persona persona) {
        System.out.println("Hola " + persona.getNombre() + "!, mi nombre es " + this.nombre + ". ¿En qué puedo ayudarte?");
    }

}