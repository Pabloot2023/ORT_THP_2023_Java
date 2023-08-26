/*Enunciado
	26.	Realizá un programa que permita al usuario ingresar un número natural n. 
	La computadora debe mostrar los primeros n múltiplos de 3 excepto 
	aquellos que sean a la vez múltiplos de 5.
*/

package trabajo_practico_1_act_3_FixedTo_4UML;

import java.util.Scanner;

public class Ejercicio_26_FixedTo_UML {

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        int n;
        int contador = 0;
        int i;

        System.out.print("Ingrese un numero natural: ");
        n = miTeclado.nextInt();

        System.out.println("\n" + "Los primeros " + n + " multiplos del numero 3 que no son multiplos de 5 son:");
        for ( i = 1; contador < n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
                contador++;
            }
        }

        miTeclado.close();
    }
}
