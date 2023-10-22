package Review;

import java.util.ArrayList;

public class Oficina {
	private int numero;
	private ArrayList <Empleado> empleados;
	
	public Oficina(int num){
		this.numero = num;
		this.empleados = new ArrayList <Empleado>();
	}
	
	private Empleado buscarEmpleado(String nomBuscar, String apBuscar) {
		Empleado empleadoEncontrado = null;
		int i = 0;
		while (i < empleados.size() && empleadoEncontrado == null ) {
			if(empleados.get(i).getApellido().equals(apBuscar) && empleados.get(i).getNombre().equals(nomBuscar)) {
				empleadoEncontrado = empleados.get(i);
			}else {
				i++;
			}
		}
		return empleadoEncontrado;
	}
	
	public boolean agregarEmpleado(String nom, String apell) {
		boolean sePudo = false;
		Empleado empleadoNuevo = buscarEmpleado(nom, apell);
		if(empleadoNuevo == null) {
			empleados.add(new Empleado(nom, apell));
			sePudo = true;
		}
		
		return sePudo;
	}
	
	public void mostrarEmpleados () {
		System.out.println("Oficina" + this.numero);
		this.recorrerEmpleados();
	}
	
	private void recorrerEmpleados() {
		for(Empleado empleadoActual: this.empleados) {
			System.out.println(empleadoActual.toString());
		}
		
	}

	public int getNumero() {
		return numero;
	}
	
}
