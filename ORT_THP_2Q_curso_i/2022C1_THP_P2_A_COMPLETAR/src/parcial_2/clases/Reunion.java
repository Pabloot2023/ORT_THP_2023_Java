package parcial_2.clases;

import java.util.ArrayList;

public class Reunion {

	private String motivo;
	private ArrayList<Amigo> amigos;
	private ArrayList<PropuestaReunion> propuestasExistentes;

	 public Reunion(String tema) {
		 this.motivo = tema;
		 this.amigos = new ArrayList<Amigo>();
		 this.propuestasExistentes = new ArrayList<PropuestaReunion>();
	 }

	public ResultadoOperacion anotarAmigo(String nombre, String domicilio) {
		Amigo amigo = buscarAmigo(nombre);
		ResultadoOperacion res = ResultadoOperacion.AMIGO_YA_EXISTENTE;
		if (amigo == null) {
			amigos.add(new Amigo(nombre, domicilio));
			res = ResultadoOperacion.OPERACION_OK;
		}
		return res;
	}

	private ResultadoOperacion bajarDePropuesta(Amigo amigo, DiaSemana diaSemana, MomentoDia momento) {
	    ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
	    PropuestaReunion propuesta = buscarPropuesta(diaSemana, momento);
	    if (propuesta != null) {
	        res = propuesta.borrarAmigo(amigo);
	        if (res == ResultadoOperacion.OPERACION_OK) {
	            if (propuesta.sinAnotados()) {
	                // Si la propuesta queda sin amigos, eliminarla de la colección de propuestas existentes
	                propuestasExistentes.remove(propuesta);
	            }
	        }
	    }
	    return res;
	}

	public ResultadoOperacion bajarDePropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = bajarDePropuesta(amigo, diaSemana, momento);
		}
		return res;
	}
	
	private Amigo buscarAmigo(String nombre) {
		Amigo amigo = null;
		int pos = 0;
		while (pos < amigos.size() && !amigos.get(pos).mismoNombre(nombre)) {
			pos++;
		}
		if (pos < amigos.size())
			amigo = amigos.get(pos);
		return amigo;
	}

	private PropuestaReunion buscarPropuesta(DiaSemana diaSemana, MomentoDia momento) {
	    PropuestaReunion propuestaEncontrada = null;
	    int i = 0;
	    
	    while (i < propuestasExistentes.size() && propuestaEncontrada == null) {
	        PropuestaReunion propuestaActual = propuestasExistentes.get(i);
	        if (propuestaActual.mismaPropuesta(diaSemana, momento)) {
	            propuestaEncontrada = propuestaActual;
	        }
	        i++;
	    }
	    
	    return propuestaEncontrada;
	}

	public ResultadoOperacion cambiarDePropuesta(String nombre, DiaSemana diaOriginal, MomentoDia momentoOriginal, DiaSemana diaNuevo, MomentoDia momentoNuevo) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = unirAPropuesta(diaNuevo, momentoNuevo, amigo);
			if (res.equals(ResultadoOperacion.OPERACION_OK))
				res = bajarDePropuesta(amigo, diaOriginal, momentoOriginal);
		}
		return res;
	}

	public ResultadoOperacion crearPropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			PropuestaReunion propuesta = buscarPropuesta(diaSemana, momento);
			if (propuesta == null) {
				propuesta = new PropuestaReunion(diaSemana, momento);
				propuestasExistentes.add(propuesta);
			}
			res = propuesta.anotarAmigo(amigo);
		}
		return res;
	}

	public void listar() {
		listarAmigos();
		listarPropuestas(); 
		listarAmigosFaltantes();
		// TODO - Desarrollar listarAmigosFaltantes();
		/*
		 * Debe mostrar los nombres de aquellos amigos que no se han adherido a ninguna
		 * de las propuestas existentes (ni propia ni ajena).
		 */
		System.out.println();
	}

	private void listarAmigos() {
		System.out.println("Amigos registrados para " + motivo);
		for (Amigo amigo : amigos) {
			System.out.println(amigo.getNombre());
		}		
	}

	private void listarPropuestas() {
		System.out.println("Propuestas registradas para " + motivo);
		for (PropuestaReunion propuesta : propuestasExistentes) {
			propuesta.listar();
		}		
	}

	private ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, Amigo amigo) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		PropuestaReunion fechaReunion = buscarPropuesta(diaSemana, momento);
		if (fechaReunion != null) {
			res = fechaReunion.anotarAmigo(amigo);
		}
		return res;
	}

	public ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, String nombre) {
        ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
        Amigo amigo = buscarAmigo(nombre);
        if (amigo != null) {
            res = unirAPropuesta(diaSemana, momento, amigo);
        }
        return res;
    }
	
	private void setMotivo(String tema) {
        this.motivo = tema;
    }
	
	public void listarAmigosFaltantes() {
	    System.out.println("Amigos que no se han adherido a ninguna propuesta:");
	    for (Amigo amigo : amigos) {
	        boolean seAdhirio = false;
	        for (PropuestaReunion propuesta : propuestasExistentes) {
	            if (propuesta.estaAnotado(amigo)) {
	                seAdhirio = true;
	                break;
	            }
	        }
	        if (!seAdhirio) {
	            System.out.println(amigo.getNombre());
	        }
	    }
	}


}