package trabajo_practico_1_act_1;

import java.util.Scanner;

/*Enunciado
 Realizá un programa que permita que el usuario ingrese su nombre.
 El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
 */


public class Ejercicio_1 {
	
	public static void main(String[] args) {
		String x = "X";
		
		System.out.println("Bienvenidos a THP!!!!!!" + "\n");
		System.out.println("Aprenderemos a programar muchas cosas!!!!!" + "\n");
		
		Scanner miTeclado = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese su nombre:" + "\n");
		x =miTeclado.nextLine();
		
		System.out.println("Bienvenido " + x + "!");
		
		
		miTeclado.close();
	}

}
