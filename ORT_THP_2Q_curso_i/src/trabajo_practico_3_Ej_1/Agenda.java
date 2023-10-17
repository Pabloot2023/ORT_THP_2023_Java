package trabajo_practico_3_Ej_1;

import java.util.ArrayList;

import trabajo_practico_3_Ej_2.Area;

public class Agenda {
    private ArrayList<Persona> personas = new ArrayList<>();

    public Agenda() {
    }

    private Persona buscarPersona(int dni) {
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                return persona;
            }
        }
        return null;
    }

    public boolean agregarPersona(int dni, String nombre, String apellido, String domicilio) {
		if (buscarPersona(dni) == null) {
            Persona nuevaPersona = new Persona(dni, nombre, apellido, domicilio);
            personas.add(nuevaPersona);
            return true;
        }
        return false;
    }

    public Persona removerPersona(int dni) {
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            personas.remove(persona);
            return persona;
        }
        return null;
    }

    public boolean modificarDomicilio(int dni, String domicilio) {
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            persona.setDomicilio(domicilio);
            return true;
        }
        return false;
    }

    public void listarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public Persona devolverUltimo() {
        if (!personas.isEmpty()) {
            return personas.get(personas.size() - 1);
        }
        return null;
    }

    public void eliminarTodosElementosAMano() {
        while (!personas.isEmpty()) {
            personas.remove(0);
        }
    }

	

}
