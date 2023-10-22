package trabajo_practico_3_Ej_2;

import java.util.ArrayList;

public class Oficina {

	private int numero;
	private ArrayList<Empleado> empleados;
	
	public Oficina(int suNumero) {
		this.numero = suNumero;
		this.empleados = new ArrayList<Empleado>();
	}
	
	public boolean agregarEmpleado(String nombre, String apellido) {
		boolean pudo = false;
		Empleado empleadoNuevo = buscarEmpleado(nombre,apellido);
		if (empleadoNuevo==null) {	// no lo encontr�. Entonces podemos crearlo
			this.empleados.add(new Empleado(nombre,apellido));
			pudo = true;
		}
		return pudo;
	}
	
	private Empleado buscarEmpleado(String nombreBuscado, String apellidoBuscado) {
		Empleado empleadoBuscado = null;
		int i=0;
		while (i<this.empleados.size() && empleadoBuscado==null) {
/*	si la expresi�n es verdadera significa que lo encontramos*/			
			if (this.empleados.get(i).verificadorNombreApellido(apellidoBuscado, nombreBuscado)) {
				empleadoBuscado = this.empleados.get(i);
			} else {
				i++;
			}
		}
		return empleadoBuscado;
	}
	
/*	muestra TODOS los datos de la Oficina: su nombre y sus empleados*/	
	public void mostrarDatos() {
		System.out.println("Oficina "+this.numero);
		this.recorrerEmpleados();
	}
	
	private void recorrerEmpleados() {
		for (Empleado unEmpleado : this.empleados) {
			System.out.println(unEmpleado);
		}		
	}
	
	public int obtenerNumero() {
		return this.numero;
	}


	private int getNumero() {
		return numero;
	}

	
	
	
}
