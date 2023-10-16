package trabajo_practico_2_Ej_14;

class Promedio {
    private Contador contador;
    private Acumulador acumulador;

    public Promedio() {
        contador = new Contador();
        acumulador = new Acumulador();
    }

    public void incrementar(double cantidad) {
        contador.incrementar();
        acumulador.incrementar(cantidad);
    }

    public double obtenerValor() {
        if (contador.obtenerValor() == 0) {
            return 0.0; // requerimiento sobre el tratamiento del cero (0)
        } else {
            return acumulador.obtenerValor() / contador.obtenerValor();
        }
    }
}