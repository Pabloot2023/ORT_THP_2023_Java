/*Enunciado
34.	Realiza un programa que permita ingresar la estatura 
(en metros con decimales) de cada jugador de un equipo de baloncesto.
 La carga Analizará al ingresar cero. 
 Calcular y mostrar la estatura promedio del equipo.
*/

package trabajo_practico_1_act_3_FixedTo_3DoWHILE;

import java.util.Scanner;

public class Ejercicio_34_FixedTo_3DoWHILE {

	public static void main(String[] args) {
Scanner miTeclado = new Scanner(System.in);
		
		int num_max = 0;
		int num_min = 100000;
		double altura;
		double acumulador_altura = 0;
		int contador_altura = 0;
		double promedio_altura = 0;
		int y = 1;
		
		do {
		
		
		
		 System.out.println("Ingrese la estatura del jugador (en metros con dos decimales)");
		 altura = miTeclado.nextInt();
		 acumulador_altura =+ altura;
		 contador_altura ++;
		
				while ( altura != 0) {
					
							 System.out.println("Ingrese la estatura del jugador (en metros con dos decimales)");
							 altura = miTeclado.nextInt();
							 
									 if (altura != 0) {
										 acumulador_altura = acumulador_altura + altura;
											contador_altura ++;
									 }
		
				 		}
				
		promedio_altura =  acumulador_altura / contador_altura;
				
		System.out.println("\n" + "------------------------------------");		
		System.out.println("El promedio de altura es: " + promedio_altura);		
		System.out.println("------------------------------------");	
		} while (y == 1);
		miTeclado.close();

	}

}
