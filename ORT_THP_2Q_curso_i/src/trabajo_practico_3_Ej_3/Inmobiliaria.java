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
            for (Propiedad propiedad : barrio.Propiedades()) { 
                System.out.println("Barrio: " + barrio.getNombre() + ", " + propiedad.toString());
            }
        }
    }

    public void mostrarBarrioMaxProp() {
        ArrayList<Barrio> maxPropBarrios = obtenerBarrioMaxProp();
        if (!maxPropBarrios.isEmpty()) {
            System.out.println("Barrio(s) con la mayor cantidad de propiedades:");
            for (Barrio barrio : maxPropBarrios) {
                System.out.println(barrio.getNombre());
            }
        } else {
            System.out.println("No hay barrios con propiedades.");
        }
    }

    public ArrayList<Barrio> obtenerBarrioMaxProp() {
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
                if (propiedad.obtenerDomicilio().equals(domicilio)) {
                    Barrio destino = buscarBarrio(nuevoBarrio);
                    if (destino != null) {
                        destino.agregarPropiedad(propiedad);
                        barrio.Propiedades().remove(propiedad);
                    }
                }
            }
        }
    }
    
    
    public boolean agregarPropiedad(Propiedad propiedad) {
        boolean pudoAgregar = false;

        for (Barrio barrio : barrios) {
            if (!pudoAgregar) {
                if (barrio.buscarPropiedad(null,null, 0) == null) {
                    pudoAgregar = barrio.agregarPropiedad(propiedad);
                }
            }
        }

        return pudoAgregar;
    }
    
    public boolean buscarPropiedad(String domicilio, double precio, tipoPropiedad tipo) {
        boolean propiedadEncontrada = false;

        for (Barrio barrio : barrios) {
            if (!propiedadEncontrada && barrio.buscarPropiedad(tipo,domicilio,precio) != null) {
                propiedadEncontrada = true;
            }
        }

        return propiedadEncontrada;
    }
    
    
    public void borrarPropiedad(String domicilio) {
        for (Barrio barrio : barrios) {
            ArrayList<Propiedad> propiedadesABorrar = new ArrayList<>();
            for (Propiedad propiedad : barrio.Propiedades()) {
                if (propiedad.obtenerDomicilio().equals(domicilio)) {
                    propiedadesABorrar.add(propiedad);
                }
            }
            barrio.Propiedades().removeAll(propiedadesABorrar);
        }
    }

    public void agregarBarrio(String nombre) {
        boolean pudo = false;
        Barrio barrioNuevo = buscarBarrio(nombre);
        if (barrioNuevo == null) { // No lo encontró, entonces podemos crearlo
            this.barrios.add(new Barrio(nombre));
            pudo = true;
        }
    }

    public Barrio buscarBarrio(String nombre) {
        Barrio barrioBuscado = null;
        int i = 0;
        while (i < this.barrios.size() && barrioBuscado == null) {
            if (this.barrios.get(i).getNombre().equals(nombre)) {
                barrioBuscado = this.barrios.get(i);
            } else {
                i++;
            }
        }
        return barrioBuscado;
    }
    
}