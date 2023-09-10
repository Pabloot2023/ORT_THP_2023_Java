/*Enunciado
33.	Realizá un programa que permita al usuario ingresar números
 hasta que se introduzca un 0. 
 La computadora debe mostrar el número máximo y el número mínimo. [EC]
*/

package trabajo_practico_1_act_3;

import java.util.Scanner;

public class Ejercicio_33 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int num_max = 0;
		int num_min = 100000;
		int num;
		
		
		
		 System.out.println("ingrese la nota  del examen:");
		 num = miTeclado.nextInt();
		
				while ( num != 0) {
					
					 
							 if (num > num_max) {
								 num_max = num;
							 }
							 
							 if (num < num_min) {
								 num_min = num;
							 }
							 
							 System.out.println("ingrese la nota  del examen:");
							 num = miTeclado.nextInt();
		
				 }
		System.out.println("\n" + "------------------------------------");		
		System.out.println("La nota mas alta fue: " + num_max);		
		
		System.out.println("\n" + "La nota mas baja fue: " + num_min);	
		System.out.println("------------------------------------");	
		
		miTeclado.close();
	}

}
