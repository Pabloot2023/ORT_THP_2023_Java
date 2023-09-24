/*Enunciado
	Realizá un programa que permita que el usuario ingrese su nombre.
	El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
*/

package trabajo_practico_1_act_1_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_1_FixedTo_FOR {
	
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		String x = "X";
		int y =1;
		int i =0 ;
		
		for (i=0;y == 1;i++) {
		System.out.println("Bienvenidos a THP!!!!!!" + "\n");
		System.out.println("Aprenderemos a programar muchas cosas!!!!!" + "\n");		
		
		System.out.println("Por favor, ingrese su nombre:" + "\n");
		x =miTeclado.nextLine();
		
		System.out.println( "\n" + "Bienvenido " + x + "!");
		
		System.out.println( "\n" + "----------------------");
				
	}
		miTeclado.close();
}
}
