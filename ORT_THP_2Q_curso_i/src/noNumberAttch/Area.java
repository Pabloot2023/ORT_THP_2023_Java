package noNumberAttch;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private int id;
    private List<Oficina> oficinas = new ArrayList<>();

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



    public void listarOficinas() {
        for (Oficina oficina : oficinas) {
            System.out.println(oficina.toString());
        }
    }

    public boolean existeEmpleado(int dni) {
        for (Oficina oficina : oficinas) {
            if (oficina.existeEmpleado(dni)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Área: " + id;
    }

	public void listarEmpleados() {
		
		
	}

	public Oficina buscarOficina(int numeroOficina) {
		
		return null;
	}
}
