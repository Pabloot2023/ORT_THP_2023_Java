

package trabajo_practico_2_act_1_Ejs_6;

import java.util.Random;

public class Dado {
    private int valor;

    public Dado() {
        // Inicializar el dado con un valor aleatorio entre 1 y 6
        lanzar();
    }

    public void lanzar() {
        // Generar un valor aleatorio entre 1 y 6 (ambos inclusive)
        Random rand = new Random();
        valor = rand.nextInt(6) + 1;
    }

    public int getValor() {
        return valor;
    }
}
