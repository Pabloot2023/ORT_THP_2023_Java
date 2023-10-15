package noNumberAttch;

import java.util.ArrayList;
import java.util.List;

public class Compania {
    private String nombre;
    private List<Area> areas = new ArrayList<>();

    public Compania(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarArea(int numero) {
        Area area = new Area(numero);
        return areas.add(area);
    }

    public boolean agregarOficina(int numeroArea, int numeroOficina) {
        Area area = buscarArea(numeroArea);
        if (area != null) {
            return area.agregarOficina(numeroOficina);
        }
        return false;
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni, int numeroArea) {
        Area area = buscarArea(numeroArea);
        if (area != null) {
            return area.agregarEmpleado(nombre, apellido, dni);
        }
        return false;
    }

    

    private Area buscarArea(int numeroArea) {
        for (Area area : areas) {
            if (area.obtenerNumero() == numeroArea) {
                return area;
            }
        }
        return null; // Área no encontrada
    }

    private Oficina buscarOficina(int numeroOficina) {
        for (Area area : areas) {
            Oficina oficina = area.buscarOficina(numeroOficina);
            if (oficina != null) {
                return oficina;
            }
        }
        return null; // Oficina no encontrada
    }

    public void listarAreas() {
        for (Area area : areas) {
            System.out.println(area.toString());
        }
    }

    public void listarEmpleados() {
        System.out.println("Empleados en " + this.toString() + ":");
        for (Area area : areas) {
            area.listarEmpleados();
        }
    }



    public boolean existeEmpleado(int dni) {
        for (Area area : areas) {
            if (area.existeEmpleado(dni)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Compania: " + nombre;
    }
}
