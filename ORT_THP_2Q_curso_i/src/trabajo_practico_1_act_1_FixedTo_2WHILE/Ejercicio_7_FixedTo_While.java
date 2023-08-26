/*Enunciado
	Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros 
	y el valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno 
	y la cantidad de metros de alambre para cercarlo completamente a tres alturas distintas.
*/

package trabajo_practico_1_act_1_FixedTo_2WHILE;

import java.util.Scanner;

public class Ejercicio_7_FixedTo_While {

	public static void main(String[] args) {
		int ancho;
		int largo;
		int valorM2;
		
		Scanner miTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese el ancho del terreno: ");
		ancho =  miTeclado.nextInt();
		
		System.out.println("Ingrese el largo del terreno: ");
		largo =  miTeclado.nextInt();
		
		System.out.println("Ingrese el valor del metro cuadrado de tierra: ");
		valorM2 =  miTeclado.nextInt();

		
		System.out.println("El valor total del terreno es de: $" + (ancho*largo*valorM2) + "\n");
		System.out.println("Se precisan " + (ancho*largo*1) + " metros de alambre para cercar por completo en una altura");
		System.out.println("Se precisan " + (ancho*largo*2) + " metros de alambre para cercar por completo en dos alturas");
		System.out.println("Se precisan " + (ancho*largo*3) + " metros de alambre para cercar por completo en tres alturas");
		
		miTeclado.close();
		
	}

}
