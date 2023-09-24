/*Enunciado
	Realizá un programa que permita que el usuario ingrese su nombre.
	El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
*/

package trabajo_practico_1_act_1_FixedTo_3DoWHILE;

import java.util.Scanner;

public class Ejercicio_1_FixedTo_DoWHILE {
	
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		String x = "X";
		int y = 1;
		
		do {
		System.out.println("Bienvenidos a THP!!!!!!" + "\n");
		System.out.println("Aprenderemos a programar muchas cosas!!!!!" + "\n");
		
		
		
		System.out.println("Por favor, ingrese su nombre:" + "\n");
		x =miTeclado.nextLine();
		
		System.out.println( "\n" + "Bienvenido " + x + "!");
		} while (y == 1);
		
		
		miTeclado.close();
	}

}
