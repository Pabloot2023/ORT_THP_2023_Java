package trabajo_practico_3_Ej_2;

public class Empleado {

	private String nombre;
	private String apellido;
	
	public Empleado(String nuevoNombre, String nuevoApellido) {
		this.setApellido(nuevoApellido);
		this.setNombre(nuevoNombre);
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
	
	public boolean mismoNombreCompleto(String apellidoComp,String nombreComp) {
		return this.apellido.equals(apellidoComp) && this.nombre.equals(nombreComp);
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}