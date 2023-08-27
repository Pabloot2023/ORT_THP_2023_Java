/*Enunciado
29.	Realizá un programa que permita validar la nota de un examen. 
Se espera que la nota que el usuario ingrese sea un número 
comprendido entre 0 y 10. La misma debe ser ingresada tantas veces 
como sea necesario hasta que quede comprendida dentro del rango indicado. [EC]
*/

package trabajo_practico_1_act_3;

import java.util.Scanner;

public class Ejercicio_29 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		int i;
		int nota;
		
		System.out.println("Ingrese la nota del examen:");
		nota = miTeclado.nextInt();
		
		 for ( i = 0; nota < 0 || nota > 10; i++) {
			 System.out.println("\n" + "-----------------ERROR-------------------");
			 System.out.println("Solamente es valida del 1 al 10");
			 System.out.println("Reingrese la nota  del examen:");
			 nota = miTeclado.nextInt();
		 }
		 	System.out.println("\n" + "-----------------EXITO!!-------------------");
			System.out.println("\n" + "             Nota almacenada");
			System.out.println("\n" + "------------PROGRAMA FINALIZADO------------");
	}

}
