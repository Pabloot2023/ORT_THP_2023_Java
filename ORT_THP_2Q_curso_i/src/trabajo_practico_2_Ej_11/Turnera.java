package trabajo_practico_2_Ej_11;

public class Turnera {
    private int ultimoNumeroOtorgado;

    public Turnera() {
        this.ultimoNumeroOtorgado = 0;
    }

    // Método para otorgar el próximo número
    public void otorgarProximoNumero() {
        ultimoNumeroOtorgado++;
    }

    // Método para obtener el último número otorgado
    public int obtenerUltimoNumeroOtorgado() {
        return ultimoNumeroOtorgado;
    }

    // Método para resetear el contador
    public void resetearContador() {
        this.ultimoNumeroOtorgado = 0;
    }

    // Método para resetear el contador con un valor específico
    public void resetearContador(int nuevoValor) {
        if (nuevoValor >= 0) {
            this.ultimoNumeroOtorgado = nuevoValor;
        }
    }
    }