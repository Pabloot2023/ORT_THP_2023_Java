package trabajo_practico_2_act_1_Ejs_12;

public class Calculadora {
    
    public int sumar(int nroA, int nroB) {
        return nroA + nroB;
    }

    
    public int restar(int nroA, int nroB) {
        return nroA - nroB;
    }

    
    public int multiplicar(int nroA, int nroB) {
        return nroA * nroB;
    }

    
    public int dividir(int nroA, int nroB) {
        if (nroB == 0) {
            return 0;
        }
        return nroA / nroB;
    }
}