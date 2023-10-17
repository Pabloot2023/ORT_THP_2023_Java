package trabajo_practico_3_Ej_3;

import java.util.ArrayList;

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

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public void mostrarPropiedades(String tipo) {
        System.out.println("Propiedades en el barrio " + nombre + " de tipo " + tipo + ":");
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getTipo().equals(tipo)) {
                System.out.println(propiedad.toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

}