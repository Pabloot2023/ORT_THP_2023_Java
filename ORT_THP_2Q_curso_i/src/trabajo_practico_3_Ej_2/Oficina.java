package trabajo_practico_3_Ej_2;

import java.util.ArrayList;

public class Oficina {
    private int numero;
    private ArrayList<Empleado> empleados = new ArrayList<>();
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

    public ArrayList<Empleado> listarEmpleados() {
        System.out.println("Oficina " + getNumero() + ":");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
        return empleados; // Retorna la lista de empleados
    }

    public boolean existeEmpleado(int dni) {
        for (Empleado empleado : empleados) {
            if (empleado.getDni() == dni) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    private void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    private Area getArea() {
        return area;
    }

    private void setArea(Area area) {
        this.area = area;
    }

    private void setNumero(int numero) {
        this.numero = numero;
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
    
    @Override
    public String toString() {
        return "Oficina: " + numero;
    }

}
