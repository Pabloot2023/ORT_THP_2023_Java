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
        Propiedad propiedadARecolocar = null;
        Barrio origenBarrio = null;
        boolean propiedadEncontrada = false;
        boolean barrioDestinoEncontrado = false;
        boolean agregadaPropiedad;

        // Encontrar la propiedad y su barrio de origen
        for (Barrio barrio : barrios) {
            for (Propiedad propiedad : barrio.Propiedades()) {
                if (!propiedadEncontrada && propiedad.obtenerDomicilio().equals(domicilio)) {
                    propiedadARecolocar = propiedad;
                    origenBarrio = barrio;
                    propiedadEncontrada = true;
                }
            }
            if (!barrioDestinoEncontrado && barrio.getNombre().equals(nuevoBarrio)) {
                barrioDestinoEncontrado = true;
            }
        }

        if (!propiedadEncontrada) {
            System.out.println("La propiedad a cambiar no fue encontrada.");
        } else if (!barrioDestinoEncontrado) {
            System.out.println("El barrio de destino no existe.");
        } else {
            // Intentar agregar la propiedad al nuevo barrio
            agregadaPropiedad = origenBarrio.agregarPropiedad(
                propiedadARecolocar.obtenerTipo(),
                propiedadARecolocar.obtenerDomicilio(),
                propiedadARecolocar.obtenerPrecio()
            );

            if (agregadaPropiedad) {
                // Remover la propiedad del barrio de origen
            	origenBarrio.Propiedades().remove(propiedadARecolocar);
                System.out.println("Propiedad reubicada con éxito.");
            } else {
                System.out.println("No se pudo agregar la propiedad al nuevo barrio.");
            }
        }
    }

    
    public boolean agregarPropiedad(Propiedad propiedad) {
        boolean pudoAgregar = false;

        for (Barrio barrio : barrios) {
            if (!pudoAgregar) {
                if (barrio.buscarPropiedad(null, propiedad.obtenerDomicilio(), propiedad.obtenerPrecio()) == null) {
                    // Aquí asumimos que tipoPropiedad se obtiene de la propiedad.
                    pudoAgregar = barrio.agregarPropiedad(propiedad.obtenerTipo(), propiedad.obtenerDomicilio(), propiedad.obtenerPrecio());
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
        Barrio barrioNuevo = buscarBarrioSinPrint(nombre);
        if (barrioNuevo == null) { // No lo encontró, entonces podemos crearlo
            this.barrios.add(new Barrio(nombre));
            pudo = true;
        }
    }
    
    
    public Barrio buscarBarrioSinPrint(String nombre) {
        Barrio barrioBuscado = null;
        int i = 0;
        boolean encontrado = false;

        // Si el nombre de búsqueda no está vacío
        if (nombre != null && !nombre.isEmpty()) {
            while (i < this.barrios.size() && !encontrado) {
                if (this.barrios.get(i).getNombre().equals(nombre)) {
                    barrioBuscado = this.barrios.get(i);
                    encontrado = true;
                } else {
                    i++;
                }
            }
        }     

        return barrioBuscado;
    }

    public Barrio buscarBarrio(String nombre) {
        Barrio barrioBuscado = null;
        int i = 0;
        boolean encontrado = false;

        // Si el nombre de búsqueda no está vacío
        if (nombre != null && !nombre.isEmpty()) {
            while (i < this.barrios.size() && !encontrado) {
                if (this.barrios.get(i).getNombre().equals(nombre)) {
                    barrioBuscado = this.barrios.get(i);
                    encontrado = true;
                } else {
                    i++;
                }
            }
        }

        if (nombre != null && !nombre.isEmpty()) {
            if (encontrado) {
                System.out.println("Barrio encontrado: " + barrioBuscado.getNombre());
            } else {
                System.out.println("Barrio no encontrado.");
            }
        }

        return barrioBuscado;
    }





    
}