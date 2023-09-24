/*Enunciado
	Realizá un programa que permita ingresar un número entero n.
	 Debe mostrar los primeros 10 múltiplos de n (desde 1 x n).
*/

package trabajo_practico_1_act_3_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_23_FixedTo_1FOR {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		int n;
		int multiplo;
		int i;
		int a =1;
		int b =0 ;
		
		for (b=0;a == 1;b++) {
		
		System.out.println("Ingrese un numero entero: ");
         n = miTeclado.nextInt();
         
         System.out.println("\n" + "Los primeros 10 multiplos del numero " + n + " son:");
         for (i = 1; i <= 10; i++) {
             multiplo = n * i;
             System.out.println("--> " + multiplo);
             
         miTeclado.close();    
         }

	}
	}
}
