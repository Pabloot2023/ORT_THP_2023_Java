package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

class Propiedad {
    private String domicilio;
    private double precio;
    private tipoPropiedad tipo;

    public Propiedad(String domicilio, double precio, tipoPropiedad tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipo = tipo;
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

    private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setTipo(tipoPropiedad tipo) {
		this.tipo = tipo;
	}	

    @Override
    public String toString() {
        return "Domicilio: " + domicilio + ", Precio: " + precio;
    }
}
