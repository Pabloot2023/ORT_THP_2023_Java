package trabajo_practico_3_Ej_2;

import java.util.ArrayList;

public class Compania {
    private String nombre;
    private ArrayList<Area> areas;

    public Compania(String suNombre) {
        this.nombre = suNombre;
        this.areas = new ArrayList<Area>();
    }

    public boolean agregarArea(String nuevaArea) {
        boolean pudo = false;
        Area areaNueva = buscarArea(nuevaArea);
        if (areaNueva == null) {
            this.areas.add(new Area(nuevaArea));
            pudo = true;
        }
        return pudo;
    }

    public boolean agregarOficina(String suArea, int suNumero) {
        boolean oficinaAgregada = false;
        Area areaActual = buscarArea(suArea);
        if (areaActual != null) {
            oficinaAgregada = areaActual.agregarOficina(suNumero);
        }
        return oficinaAgregada;
    }

    public boolean agregarEmpleado(String suArea, int suNumero, String nombre, String apellido) {
        boolean empleadoAgregado = false;
        for (Area areaActual : this.areas) {
            if (areaActual.obtenerNombre().equals(suArea)) {
                empleadoAgregado = areaActual.agregarEmpleado(suNumero, nombre, apellido);
            }
        }
        return empleadoAgregado;
    }

    private Area buscarArea(String areaBuscada) {
        Area areaEncontrada = null;
        int i = 0;
        while (i < this.areas.size() && areaEncontrada == null) {
            Area area = this.areas.get(i);
            if (area.obtenerNombre().equals(areaBuscada)) {
                areaEncontrada = area;
            }
            i++;
        }
        return areaEncontrada;
    }

    private void recorrerAreas() {
        for (Area area : this.areas) {
            area.mostrarDatos();
        }
    }
}
