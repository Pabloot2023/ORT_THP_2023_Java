package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

class Propiedad {
    private String domicilio;
    private double precio;
    private tipoPropiedad tipo;
    
    public Propiedad(tipoPropiedad tipo,String domicilio, double precio) {	
    	this.tipo = tipo;
        this.domicilio = domicilio;
        this.precio = precio;
    }
    
    public String obtenerDomicilio() {
        return domicilio;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public tipoPropiedad obtenerTipo() {
        return tipo;
    }
    
    
    private String getDomicilio() {
		return domicilio;
	}

	private double getPrecio() {
		return precio;
	}

	private tipoPropiedad getTipo() {
		return tipo;
	}

	
    private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setTipo(tipoPropiedad tipo) {
		this.tipo = tipo;
	}	

	public boolean verificadorPropiedad(tipoPropiedad propiedadComp,String domicilioComp,double precioComp) {
		return this.tipo.equals(propiedadComp) && this.domicilio.equals(domicilioComp) && this.precio == precioComp;
	}
	
    @Override
    public String toString() {
        return "Domicilio: " + domicilio + ", Precio: " + precio;
    }
}
