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

    public boolean agregarOficina(int numero) {
        // Implementa la lógica para agregar una oficina a un área existente
        return false;
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni) {
        // Implementa la lógica para agregar un empleado a una oficina existente
        return false;
    }

    public void listarAreas() {
        for (Area area : areas) {
            System.out.println(area.toString());
        }
    }

    public void listarEmpleados() {
        for (Area area : areas) {
            area.listarOficinas();
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
