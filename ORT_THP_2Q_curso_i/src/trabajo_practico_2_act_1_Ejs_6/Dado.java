package trabajo_practico_2_act_1_Ejs_6;

class Dado {
    private int valor;

    public Dado() {       
    }

    public void tirarDado() {
        // Generar un valor aleatorio entre 1 y 6 (ambos inclusive)
        valor = (int) (Math.random() * 6) + 1;
    }

    public int getValor() {
        return valor;
    }
}