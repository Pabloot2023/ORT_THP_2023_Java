/*Enunciado	Realizó un programa que permita validar la nota de un examen
 *  de la misma manera que el ejercicio 29 pero con las siguientes 
 *  nuevas directivas:
•	Las notas 1 y 3 no usan nunca.
•	La nota 0 se reserva para los ausentes
En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10. [EC]
*/
 
package trabajo_practico_1_act_3;
 
import java.util.Scanner;
 
public class Ejercicio_32 {
 
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		int i;
		int nota;
 
		System.out.println("Ingrese la nota del examen:");
		nota = miTeclado.nextInt();
 
		// < 1 || nota > 3
 
		 while ( nota <= 0 || nota == 1 || nota == 3 || nota > 10 ) {
			 System.out.println("\n" + "-----------------ERROR-------------------");
			 System.out.println("Solamente son validas 2 y del 4 al 10");
			 System.out.println("AVISO!! no se pueden usar 0,1,3");
			 System.out.println("Reingrese la nota  del examen:");
			 nota = miTeclado.nextInt();
 
 
		 }
 
 
		 	System.out.println("\n" + "-----------------EXITO!!-------------------");
			System.out.println("\n" + "             Nota almacenada");
			System.out.println("\n" + "------------PROGRAMA FINALIZADO------------");
			miTeclado.close();
	}
 
}
