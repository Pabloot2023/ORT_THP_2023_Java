package trabajo_practico_3_Ej_2;

import java.util.ArrayList;

public class Area {
    private String nombre;
    private ArrayList<Oficina> oficinas;

    public Area(String suNombre) {
        this.nombre = suNombre;
        this.oficinas = new ArrayList<Oficina>();
    }

    public boolean agregarOficina(int nuevaOficina) {
        boolean pudo = false;
        Oficina oficinaNueva = buscarOficina(nuevaOficina);
        if (oficinaNueva == null) {
            this.oficinas.add(new Oficina(nuevaOficina));
            pudo = true;
        }
        return pudo;
    }

    private Oficina buscarOficina(int oficinaBuscada) {
        Oficina oficinaEncontrada = null;
        int i = 0;
        while (i < this.oficinas.size() && oficinaEncontrada == null) {
            Oficina oficina = this.oficinas.get(i);
            if (oficina.obtenerNumero() == oficinaBuscada) {
                oficinaEncontrada = oficina;
            }
            i++;
        }
        return oficinaEncontrada;
    }

    public boolean agregarEmpleado(int oficina, String nombre, String apellido) {
        boolean empleadoAgregado = false;
        for (Oficina oficinaActual : this.oficinas) {
            if (oficinaActual.obtenerNumero() == oficina) {
                empleadoAgregado = oficinaActual.agregarEmpleado(nombre, apellido);
            }
        }
        return empleadoAgregado;
    }

    private void recorrerOficinas() {
        for (Oficina oficina : this.oficinas) {
            oficina.mostrarDatos();
        }
    }

    public void mostrarDatos() {
        System.out.println("Área " + this.nombre);
        this.recorrerOficinas();
    }
    
    public String obtenerNombre() {
		return this.nombre;
	}
    

	private String getNombre() {
		return nombre;
	}

    
    
}
