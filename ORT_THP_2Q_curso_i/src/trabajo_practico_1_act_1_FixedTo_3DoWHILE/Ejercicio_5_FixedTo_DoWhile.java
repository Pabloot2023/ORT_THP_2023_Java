/*Enunciado
	Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y num2.
	Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores 
	(que lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas. [EC]
*/

package trabajo_practico_1_act_1_FixedTo_3DoWHILE;

import java.util.Scanner;

public class Ejercicio_5_FixedTo_DoWhile {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
	
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese un primer numero");
		num1 = miTeclado.nextInt();
		
		System.out.println("Ingrese un segundo numero");
		num2 = miTeclado.nextInt();
		
		System.out.println("El primer numero es " + num1 + " y el segundo numero es " + num2);
		num0 = num1;
		num1 = num2;
		num2 = num0;
		
		
		System.out.println("El primer numero actualizado es " + num1 + " y el segundo numero actualizado es " + num2);
		
		miTeclado.close();
		
	}

}
