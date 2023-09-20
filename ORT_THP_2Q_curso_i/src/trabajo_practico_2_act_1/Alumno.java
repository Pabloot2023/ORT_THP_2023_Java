package trabajo_practico_2_act_1;

public class Alumno {

	// definimos atributos
	
	
	private String nombre;
	private String dni;
	private String email;
	private int notaPrimerParcial;
	private int notaSegundoParcial;	
	
	// metodo constructor por defecto SIEMPRE PUBLICO
	// crea imagen por defecto en memoria e inicializa atributos con sus valores por defecto, null o 0 segun corresponda
	public Alumno() {
		
	}
	
	// cosntructor parametrizado sirve para crear el objeto  con valores  en algunos atributos
	public Alumno(String nuevoNombre ,String nuevoDni ,String nuevoEail) {
		this.setNombre(nuevoNombre);
		this.setDni(nuevoDni);
		this.setEmail(nuevoEail);
	}
	
	
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
	public int getNotaPrimerParcial() {
		return notaPrimerParcial;
	}
	public void setNotaPrimerParcial(int notraPrimerParcial) {
		this.notaPrimerParcial = notraPrimerParcial;
	}
	public int getNotaSegundoParcial() {
		return notaSegundoParcial;
	}
	public void setNotaSegundoParcial(int notraSegundoParcial) {
		this.notaSegundoParcial = notraSegundoParcial;
	}
	

	public double calcularPromedio(){
		return (double) (this.notaPrimerParcial+this.notaSegundoParcial)/2;	
	}
	
	
}
