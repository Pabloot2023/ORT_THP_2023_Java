/*Enunciado
 	Realizó un programa que permita ingresar dos números enteros e 
 	indique cuál de ellos es el mayor. [EC] 
*/

package trabajo_practico_1_act_2_FixedTo_FOR;

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
		
		
		if (num1 == num2) {
			System.out.println("Ambos numeros son iguales");
		}
		else { 
				if (num1 >= num2) {
					System.out.println("El primer valor es mayor al segundo");
					} else {
						System.out.println("El segundo valor es mayor");
						}
		
		  miTeclado.close();
		

	}
	}
}
