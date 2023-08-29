/*Enunciado
27.	Realizá un programa que permita ingresar 5 edades. 
Calcular y mostrar el promedio de todas las edades ingresadas 
y cuántas edades fueron valores impares mayores que 18. [EC]
*/

package trabajo_practico_1_act_3;

import java.util.Scanner;

public class Ejercicio_27 {
	
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int edad_num = 0;
		double edad_acum = 0;
		double promedio = 0;
		int mayor_18 = 0;
		int i;
		
		 for ( i = 0; i < 5; i++) {
		        System.out.print("Ingrese una edad ");
		        edad_num = miTeclado.nextInt();
		        
		        if (edad_num > 18 && edad_num % 2 != 0) {
		        	mayor_18++;
		        } 
		        edad_acum += edad_num;
		        
		 	  } 
		 
		 promedio = edad_acum / 5;
		 System.out.println("--------------------------------------");
		 System.out.print("El valor promedio de Edad es: " + promedio);
		 System.out.print("\n" + "La cantidad de edades impares y mayores a 18 es: " + mayor_18);
		 System.out.println("\n" + "--------------------------------------");
	}

}
