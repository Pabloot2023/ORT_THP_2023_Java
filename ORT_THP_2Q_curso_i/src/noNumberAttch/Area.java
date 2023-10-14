package noNumberAttch;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private int id;
    private List<Oficina> oficinas = new ArrayList<>();

    public Area(int id) {
        this.id = id;
    }

    public boolean agregarOficina(int numero) {
        Oficina oficina = new Oficina(numero);
        return oficinas.add(oficina);
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni) {
        // Implementa la lógica para agregar un empleado a esta área
        return false;
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
}