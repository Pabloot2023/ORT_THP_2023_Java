package Review;

import java.util.ArrayList;

public class Compania {
	
	private String nombre;
	private ArrayList<Area> areas;
	
	public Compania(String nombre) {
		this.nombre = nombre;
		this.areas = new ArrayList<Area>();
	}
	

	public boolean agregarArea(String nombre) {
		boolean sePudo = false;
		Area areaNueva = buscarArea(nombre);
		if(areaNueva == null) {
			this.areas.add(new Area (nombre));
			sePudo = true;
		}
	
		return sePudo;
	} 
	
	private Area buscarArea(String areaABuscar) {
		Area areaEncontrada = null;
		int i = 0;
		while (i < areas.size() && areaEncontrada == null ) {
			if(areas.get(i).getNombre().equals(areaABuscar)) {
				areaEncontrada = areas.get(i);
			}else {
				i++;
			}
		}
		return areaEncontrada;
	}
	
	public boolean agregarOficina(String nomArea, int numOf ) {
		boolean sePudo = false;
		Area areaEncontrada = this.buscarArea(nomArea);
		if(areaEncontrada != null) {
			areaEncontrada.agregarOficina(numOf);
			sePudo = true;
		}
		return sePudo;
	}
	
	public boolean agregarEmpleado (String nomArea, int numOf, String nomEmp, String apEmp) {
		boolean sePudo = false;
		Area areaNueva = buscarArea(nomArea);
		
		 if (areaNueva != null) {
		        sePudo = areaNueva.agregarEmpleado(numOf, nomEmp, apEmp);
		    }
		return sePudo;
	}
	
	private void listarAreas() {
		for (Area areaActual: this.areas ) {
			System.out.println(areaActual);
		}
	}
	
	public void listarEmpleados() {
		System.out.println("Compania " + this.nombre);
		this.listarAreas();
	}
	
}