package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

import trabajo_practico_3_Ej_2.Empleado;

class Barrio {
    private String nombre;
    private ArrayList<Propiedad> propiedades;

    public Barrio(String nombre) {
        this.nombre = nombre;
        this.propiedades = new ArrayList<>();
    }
    
    public ArrayList<Propiedad> Propiedades() {
        return propiedades;
    }

    public boolean agregarPropiedad(Propiedad propiedad) {
        boolean pudo = false;
        Propiedad propiedadNueva = buscarPropiedad( propiedad.obtenerTipo(),propiedad.obtenerDomicilio(), propiedad.obtenerPrecio());
        if (propiedadNueva == null) { // No lo encontró, entonces podemos crearlo
            this.propiedades.add(propiedad);
            pudo = true;
        }
        return pudo;
    }
    
    public Propiedad buscarPropiedad(tipoPropiedad tipo,String domicilio, double precio) {
        Propiedad propiedadBuscada = null;
        int i = 0;
        while (i < this.propiedades.size() && propiedadBuscada == null) {
            if (this.propiedades.get(i).verificadorPropiedad(tipo, domicilio,precio)) {
                propiedadBuscada = this.propiedades.get(i);
            } else {
                i++;
            }
        }
        return propiedadBuscada;
    }

    public void mostrarPropiedades(String tipo) {
        System.out.println("Propiedades en el barrio " + nombre + " de tipo " + tipo + ":");
        for (Propiedad propiedad : propiedades) {
            if (propiedad.obtenerTipo().equals(tipo)) {
                System.out.println(propiedad.toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    

}