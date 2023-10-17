package trabajo_practico_3_Ej_1;

import java.util.ArrayList;

class Persona {
    private final int dni;
    private String nombre;
    private String apellido;
    private String domicilio;

    public Persona(int dni, String nombre, String apellido, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Domicilio: " + domicilio;
    }
}