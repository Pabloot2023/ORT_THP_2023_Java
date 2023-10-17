package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

class Propiedad {
    private String domicilio;
    private double precio;
    private String tipo;

    public Propiedad(String domicilio, double precio, String tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipo = tipo;
    }

    private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDomicilio() {
        return domicilio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Domicilio: " + domicilio + ", Precio: " + precio;
    }
}
