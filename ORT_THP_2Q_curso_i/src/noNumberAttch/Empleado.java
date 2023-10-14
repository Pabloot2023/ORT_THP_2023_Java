package noNumberAttch;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;

    public Empleado(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int obtenerDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", DNI: " + dni;
    }


	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private int getDni() {
		return dni;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

}
