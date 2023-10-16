package trabajo_practico_2_Ej_14;

class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public int obtenerValor() {
        return valor;
    }
}