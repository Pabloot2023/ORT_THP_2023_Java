package noNumberAttch;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private int numero;
    private List<Empleado> empleados = new ArrayList<>();
    private Area area;

    public Oficina(int numero) { 
        this.numero = numero;
    }
    
    public Oficina(Area area, int numero) {
        this.area = area;
        this.numero = numero;
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni) {
        Empleado empleado = new Empleado(nombre, apellido, dni);
        return empleados.add(empleado);
    }

    public void listarEmpleados() {
        System.out.println("Oficina " + getNumero() + ":");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }


    public boolean existeEmpleado(int dni) {
        for (Empleado empleado : empleados) {
            if (empleado.getDni() == dni) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Oficina: " + numero;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }

    public int obtenerNumero() {
        return numero;
    }

    public int getNumero() {
        return numero;
    }
}
