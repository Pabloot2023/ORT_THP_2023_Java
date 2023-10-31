package parcial_2;

import parcial_2.clases.DiaSemana;
import parcial_2.clases.MomentoDia;
import parcial_2.clases.ResultadoOperacion;
import parcial_2.clases.Reunion;

public class Test {

	private static Reunion asadito = null;
	
	public static void main(String[] args) {
		asadito = new Reunion("El Asadito");
		for (int i=1; i <= 5; i++)
		agregarAmigo("Amigo " + i, "Domicilio " + i);
		agregarPropuesta("Amigo 1", DiaSemana.SABADO, MomentoDia.NOCHE);
		agregarPropuesta("Amigo 2", DiaSemana.DOMINGO, MomentoDia.MEDIODIA);
		agregarPropuesta("Amigo 3", DiaSemana.SABADO, MomentoDia.NOCHE);
		unirAPropuesta("Amigo 3", DiaSemana.DOMINGO, MomentoDia.MEDIODIA);
		unirAPropuesta("Colado", DiaSemana.SABADO, MomentoDia.NOCHE);
		bajarDePropuesta("Amigo 3", DiaSemana.SABADO, MomentoDia.MEDIODIA);
		bajarDePropuesta("Amigo 3", DiaSemana.DOMINGO, MomentoDia.MEDIODIA);
		cambiarDePropuesta("Amigo 2", DiaSemana.DOMINGO, MomentoDia.MEDIODIA, DiaSemana.SABADO, MomentoDia.NOCHE);
		asadito.listar();
	}
	
	private static void cambiarDePropuesta(String nombre, DiaSemana diaOriginal, MomentoDia momentoOriginal, DiaSemana diaNuevo, MomentoDia momentoNuevo) {
		 ResultadoOperacion res = asadito.cambiarDePropuesta(nombre, diaOriginal, momentoOriginal, diaNuevo, momentoNuevo);
		 System.out.println(nombre + " se pasa del " + diaOriginal + " (" + momentoOriginal + ") al " + diaNuevo + " (" + momentoNuevo + ")");
		 if (!res.equals(ResultadoOperacion.OPERACION_OK))
			 System.out.println(res);
	}

	private static void bajarDePropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		 ResultadoOperacion res = asadito.bajarDePropuesta(nombre, diaSemana, momento);
		 System.out.println(nombre + " se borra del " + diaSemana + " (" + momento + ")");
		 if (!res.equals(ResultadoOperacion.OPERACION_OK))
			 System.out.println(res);
	}

	private static void unirAPropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		 ResultadoOperacion res = asadito.unirAPropuesta(diaSemana, momento, nombre);
		 System.out.println(nombre + " se quiere agregar al " + diaSemana + " (" + momento + ")");
		 if (!res.equals(ResultadoOperacion.OPERACION_OK))
			 System.out.println(res);
	}

	private static void agregarPropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		 ResultadoOperacion res = asadito.crearPropuesta(nombre, diaSemana, momento);
		 System.out.println("Agregando propuesta " + diaSemana  + " (" + momento + "). Propuesta por " + nombre);
		 if (!res.equals(ResultadoOperacion.OPERACION_OK))
			 System.out.println(res);
	}

	private static void agregarAmigo(String nombre, String domicilio) {
		 ResultadoOperacion res = asadito.anotarAmigo(nombre, domicilio);
		 System.out.println("Agregando a " + nombre + " que vive en " + domicilio);
		 if (!res.equals(ResultadoOperacion.OPERACION_OK))
			 System.out.println(res);
	}

}
