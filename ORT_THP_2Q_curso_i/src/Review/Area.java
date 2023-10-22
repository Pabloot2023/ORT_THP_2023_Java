package Review;

import java.util.ArrayList;

public class Area {
	
	private String nombre;
	private ArrayList<Oficina> oficinas;
	
	public Area (String nombre) {
		this.nombre = nombre;
		this.oficinas = new ArrayList<Oficina>();
	}
	
	public boolean agregarOficina(int nuevaOficina) {
		boolean sePudo = false;
		Oficina oficinaNueva = buscarOficina(nuevaOficina);
		if(oficinaNueva == null) {
			oficinas.add(new Oficina(nuevaOficina));
			sePudo = true;
		}
		return sePudo;
	}
	
	private Oficina buscarOficina(int oficinaBuscar) {
		Oficina oficinaEncontrada = null;
		int i = 0;
		while (oficinaEncontrada == null && i < oficinas.size()) {
			if (oficinas.get(i).getNumero() == oficinaBuscar) {
				oficinaEncontrada = oficinas.get(i);
			} else {
				i++;
			}
		}

		return oficinaEncontrada;
	}
	
	public boolean agregarEmpleado(int ofi, String nom, String apell) {
	    boolean sePudo = false;
	    Oficina oficinaEncontrada = buscarOficina(ofi);

	    if (oficinaEncontrada != null) {
	        sePudo = oficinaEncontrada.agregarEmpleado(nom, apell);
	    }

	    return sePudo;
	}
	
	private void listarOficinas() {
		for (Oficina oficinaActual: this.oficinas) {
			System.out.println(oficinaActual);
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Area" + this.nombre);
		this.listarOficinas();
	}

	public String getNombre() {
		return nombre;
	}

}