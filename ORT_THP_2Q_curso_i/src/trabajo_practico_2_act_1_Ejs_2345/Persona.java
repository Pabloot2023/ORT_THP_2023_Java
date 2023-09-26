package trabajo_practico_2_act_1_Ejs_2345;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.apellido = "";
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para establecer el apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para obtener el nombre completo
    public String obtenerNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}