package trabajo_practico_2_act_1_Ejs_14;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Promedio promedio = new Promedio();
        double nota;
        boolean finalizar = false;

        System.out.println("Ingrese las notas del primer parcial una a una (entre 0 y 10), ingrese -1 para finalizar:");

        while (!finalizar) {
            nota = obtenerNotaDesdeElUsuario(); 

            if (nota == -1) {
                finalizar = true;
            } else if (nota >= 0 && nota <= 10) {
                promedio.incrementar(nota);
            } else {
                System.out.println("La nota debe estar en el rango de 0 a 10.");
            }
        }

        double resultado = promedio.obtenerValor();
        System.out.println("El promedio de las notas del primer parcial es: " + resultado);
    }

    private static double obtenerNotaDesdeElUsuario() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
