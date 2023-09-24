/*Enunciado
    Realizá un programa que permita al usuario 
    ingresar dos números enteros.
    La computadora debe indicar si el mayor es divisible por el menor.
    (Un número entero a es divisible por un número entero b cuando el resto de la división entre a y b es 0)
*/

package trabajo_practico_1_act_2_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_18_FixedTo_FOR {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);

        int num1;
        int num2;
        int mayor;
        int menor;
        int y =1;
		int i =0 ;
		
		for (i=0;y == 1;i++) {
        
        System.out.print("Ingrese el primer numero: ");
        num1 = miTeclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = miTeclado.nextInt();

        mayor = Math.max(num1, num2);
        menor = Math.min(num1, num2);

        if (mayor % menor == 0) {
            System.out.println("\n +" + "El mayor " +  "(" + mayor + ")" + " es divisible por el menor " +  "(" + menor + ")" );
        } else {
            System.out.println("\n +" + "El mayor " +  "(" + mayor + ")" + " no es divisible por el menor " +  "(" + menor + ")" );
        }

        miTeclado.close();

	}
	}
}
