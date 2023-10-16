package trabajo_practico_2_act_1_Ejs_14;

class Acumulador {
    private double valor;

    public Acumulador() {
        this.valor = 0.0;
    }

    public void incrementar(double cantidad) {
        valor += cantidad;
    }

    public double obtenerValor() {
        return valor;
    }
}