package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

class Inmobiliaria {
    private ArrayList<Barrio> barrios;

    public Inmobiliaria() {
        barrios = new ArrayList<>();
    }

    public void mostrarPropiedades() {
        System.out.println("Propiedades en la inmobiliaria:");
        for (Barrio barrio : barrios) {
            for (Propiedad propiedad : barrio.Propiedades()) { // Utilizamos el método getPropiedades
                System.out.println("Barrio: " + barrio.getNombre() + ", " + propiedad.toString());
            }
        }
    }

    public void mostrarBarrioMaxProp() {
        ArrayList<Barrio> maxPropBarrios = obtenerMaxPropBarrios();
        if (!maxPropBarrios.isEmpty()) {
            System.out.println("Barrio(s) con la mayor cantidad de propiedades:");
            for (Barrio barrio : maxPropBarrios) {
                System.out.println(barrio.getNombre());
            }
        } else {
            System.out.println("No hay barrios con propiedades.");
        }
    }

    public ArrayList<Barrio> obtenerMaxPropBarrios() {
        ArrayList<Barrio> maxPropBarrios = new ArrayList<>();
        int maxPropCount = 0;

        for (Barrio barrio : barrios) {
            if (barrio.Propiedades().size() > maxPropCount) {
                maxPropBarrios.clear();
                maxPropBarrios.add(barrio);
                maxPropCount = barrio.Propiedades().size();
            } else if (barrio.Propiedades().size() == maxPropCount) {
                maxPropBarrios.add(barrio);
            }
        }

        return maxPropBarrios;
    }

    public void cambiarPropiedadDeBarrio(String domicilio, String nuevoBarrio) {
        for (Barrio barrio : barrios) {
            for (Propiedad propiedad : barrio.Propiedades()) {
                if (propiedad.getDomicilio().equals(domicilio)) {
                    Barrio destino = obtenerBarrio(nuevoBarrio);
                    if (destino != null) {
                        destino.agregarPropiedad(propiedad);
                        barrio.Propiedades().remove(propiedad);
                    }
                }
            }
        }
    }

    public void borrarPropiedad(String domicilio) {
        for (Barrio barrio : barrios) {
            for (Propiedad propiedad : barrio.Propiedades()) {
                if (propiedad.getDomicilio().equals(domicilio)) {
                    barrio.Propiedades().remove(propiedad);
                    break;
                }
            }
        }
    }

    public void agregarBarrio(String nombre) {
        barrios.add(new Barrio(nombre));
    }

    public Barrio obtenerBarrio(String nombre) {
        for (Barrio barrio : barrios) {
            if (barrio.getNombre().equals(nombre)) {
                return barrio;
            }
        }
        return null;
    }
}
