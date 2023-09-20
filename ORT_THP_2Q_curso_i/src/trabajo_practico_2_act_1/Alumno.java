package trabajo_practico_2_act_1;

public class Alumno {

	// definimos atributos
	
	
	private String nombre;
	private String dni;
	private String email;
	private int notraPrimerParcial;
	private int notraSegundoParcial;	
	
	// generar getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; // sino this.nombre = nombreNuevo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNotraPrimerParcial() {
		return notraPrimerParcial;
	}
	public void setNotraPrimerParcial(int notraPrimerParcial) {
		this.notraPrimerParcial = notraPrimerParcial;
	}
	public int getNotraSegundoParcial() {
		return notraSegundoParcial;
	}
	public void setNotraSegundoParcial(int notraSegundoParcial) {
		this.notraSegundoParcial = notraSegundoParcial;
	}
	

	
	
	
}
