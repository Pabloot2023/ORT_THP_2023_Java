package parcial_2.clases;

import java.util.ArrayList;

public class PropuestaReunion {

	private DiaSemana diaSemana;
	private MomentoDia momentoDia;
	private ArrayList<Amigo> anotados;

	public PropuestaReunion(DiaSemana diaSemana, MomentoDia momentoDia) {
		this.diaSemana = diaSemana;
        this.momentoDia = momentoDia;
        this.anotados = new ArrayList<Amigo>();
	}

	public ResultadoOperacion anotarAmigo(Amigo amigoAAnotar) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_YA_EXISTENTE;
		if (!estaAnotado(amigoAAnotar)) {
			anotados.add(amigoAAnotar);
			res = ResultadoOperacion.OPERACION_OK;
		}
		return res;
	}

	public ResultadoOperacion borrarAmigo(Amigo amigoABorrar) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		if (estaAnotado(amigoABorrar)) {
			anotados.remove(amigoABorrar);
			res = ResultadoOperacion.OPERACION_OK;
		}
		return res;
	}

	private boolean estaAnotado(Amigo amigoABuscar) {
		int pos = 0;
		while (pos < anotados.size() && !anotados.get(pos).equals(amigoABuscar)) {
			pos++;
		}
		return pos < anotados.size();
	}

	public void listar() {
		System.out.println("Hay " + anotados.size() + " amigos anotados para el " + diaSemana + " (" + momentoDia + ")");
		for (Amigo amigo : anotados) {
			System.out.println(amigo.getNombre());
		}
	}

	public boolean mismaPropuesta(DiaSemana dia, MomentoDia momento) {
		return this.diaSemana.equals(dia) && this.momentoDia.equals(momento);
	}

	public boolean sinAnotados() {
		return anotados.isEmpty();
	}

	
	 private void setDiaSemana(DiaSemana diaSemana) {
		 this.diaSemana = diaSemana;
	 }

	 private void setMomentoDia(MomentoDia momentoDia) {
		 this.momentoDia = momentoDia;
	 }
	
}