package Review;

public class Empleado {
	private String nombre;
	private String apellido;


	public Empleado(String nom, String apell) {
		this.nombre = nom;
		this.apellido = apell;

	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", apellido=" + apellido  + "]";
	}

}