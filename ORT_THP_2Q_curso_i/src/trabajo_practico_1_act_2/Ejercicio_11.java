package trabajo_practico_1_act_2;

/*Enunciado
Realizá un programa que permita ingresar un número entero e indique si se trata de un número par o impar. [EC]
*/

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
	
		Scanner miTeclado = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Ingrese un numero entero, le dire si es par o impar");
		num =miTeclado.nextInt();
		
		if (num % 2 == 0) {
            System.out.println(num + " es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }

		  miTeclado.close();
	}

}
