package parcial_2.clases;

public class Amigo {

	private String nombre;
	private String domicilio;

	public Amigo(String nombre, String domicilio) {
		this.setNombre(nombre);
		this.setDomicilio(domicilio);
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
