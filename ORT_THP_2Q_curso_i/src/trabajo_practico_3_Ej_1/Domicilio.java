package trabajo_practico_3_Ej_1;

public class Domicilio {
	private String calle ;
	private int numero ;
	private String ciudad;
	
	// Constructor por defecto
    public Domicilio() {
        this.calle = " ";
        this.numero = 0;
        this.ciudad = " ";
    }
	
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

	// Método para establecer  la calle
	public void setCalle(String calle) {
		this.calle = calle;
	}
	// Método para establecer el numero 
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Método para establecer la ciudad
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}		
	
	// Método para obtener la calle
	public String getCalle() {
		return calle;
	}
	// Método para obtener el numero 
	public int getNumero() {
		return numero;
	}
	// Método para obtener  la ciudad
	public String getCiudad() {
		return ciudad;
	}
	
	
}