/*Enunciado
27.	Realizá un programa que permita ingresar 5 edades. 
Calcular y mostrar el promedio de todas las edades ingresadas 
y cuántas edades fueron valores impares mayores que 18. [EC]
*/

package trabajo_practico_1_act_3_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_27_FixedTo_1FOR {
	
	

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int edad_num = 0;
		double edad_acum = 0;
		double promedio = 0;
		int mayor_18 = 0;
		int i;
		int edad_mas_alta = 0;
		int posicion = 0;
		
		 for ( i = 0; i < 5; i++) {
		        System.out.print("Ingrese una edad ");
		        edad_num = miTeclado.nextInt();
		        
		        if (edad_num > 18 && edad_num % 2 != 0) {
		        	mayor_18++;
		        } 
		        edad_acum += edad_num;
		        if (edad_num > edad_mas_alta) {
		        	edad_mas_alta = edad_num;
		        	posicion = i+1;
		        } 
		 } 
		 
		 promedio = edad_acum / 5;
		 System.out.println("--------------------------------------");
		 System.out.println("El valor promedio de Edad es: " + promedio);
		 System.out.println("\n" + "La cantidad de edades impares y mayores a 18 es: " + mayor_18);
		 System.out.println("\n" + "La edad mas alta ingresada fue: " + edad_mas_alta);
		 System.out.println("\n" + "en la posicion: "  + posicion);
		 System.out.println("--------------------------------------");
		

	}

}
