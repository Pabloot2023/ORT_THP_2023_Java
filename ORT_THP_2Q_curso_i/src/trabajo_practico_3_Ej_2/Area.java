package trabajo_practico_3_Ej_2;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private int id;
    private List<Oficina> oficinas = new ArrayList<>();
    private Compania compania;

    public Area(Compania compania, int id) {
        this.compania = compania;
        this.id = id;
    }
    
    public Area(int id) {
        this.id = id;
    }

    public int obtenerNumero() {
        return id;
    }

    public boolean agregarOficina(int numero) {
        Oficina oficina = new Oficina(numero);
        return oficinas.add(oficina);
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni) {
    	boolean empleadoAgregado = false;
        Empleado empleado = new Empleado(nombre, apellido, dni);
        for (Oficina oficina : oficinas) {
            if (oficina.agregarEmpleado(empleado)) {
                return empleadoAgregado = true; // Empleado agregado con éxito en al menos una oficina
            }
        }
        return empleadoAgregado = false; // No se pudo agregar el empleado en ninguna oficina
    }

    public List<Oficina> listarOficinas() {
        return oficinas;
    }

    public boolean existeEmpleado(int dni) {
        for (Oficina oficina : oficinas) {
            if (oficina.existeEmpleado(dni)) {
                return true;
            }
        }
        return false;
    }

    private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private List<Oficina> getOficinas() {
		return oficinas;
	}

	private void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	private Compania getCompania() {
		return compania;
	}

	private void setCompania(Compania compania) {
		this.compania = compania;
	}

    public void listarEmpleados() {
        System.out.println("Área " + obtenerNumero() + ":");
        for (Oficina oficina : oficinas) {
            oficina.listarEmpleados();
        }
    }

	public Oficina buscarOficina(int numeroOficina) {		
		return null;
	}
	
	public int getNumero() {
	    return id;
	}
	
	@Override
    public String toString() {
        return "Área: " + id;
    }

}