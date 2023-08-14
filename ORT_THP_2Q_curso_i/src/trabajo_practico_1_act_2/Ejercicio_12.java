package trabajo_practico_1_act_2;

/*Enunciado
 * Realizó un programa que permita ingresar dos números enteros e indique cuál de ellos es el mayor. [EC] 
 */

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese un numero entero");
		num1 = miTeclado.nextInt();
		
		System.out.println("Ingrese otro numero entero");
		num2 = miTeclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El mayor es " + num1 );
		} else {
			System.out.println("El mayor es " + num2 );
		}
		
		  miTeclado.close();
		

	}

}
