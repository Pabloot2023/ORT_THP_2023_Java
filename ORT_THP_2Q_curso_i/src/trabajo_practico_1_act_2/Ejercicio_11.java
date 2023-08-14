package trabajo_practico_1_act_2;

/*Enunciado
Realizá un programa que permita ingresar un número entero e indique si se trata de un número par o impar. [EC]
*/

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
	
		Scanner miTeclado = new Scanner(System.in);
		int num = 0;
		boolean esPar = false;
		
		System.out.println("Ingrese un numero entero, le dire si es par o impar");
		num = Integer.parseInt(miTeclado.nextLine());
		
		if (num % 2 == 0) {
            System.out.println("\n" + num + " es un numero par");
        } else {
            System.out.println("\n" + num + " es un numero impar");
        }

		  miTeclado.close();

// otra forma de hacer lo mismo
		  
		  if (num % 2 == 0) {
	            esPar = true;
	        } else {
	        	esPar = false;
	        }
		  
		  if (esPar == true) {
			  System.out.println("\n" + num + " es un numero par");
	        } else {
	          System.out.println("\n" + num + " es un numero impar");
	        }
		  
 // otra forma de hacer lo mismo.MAS OPTIMO	  
		  esPar = num % 2 == 0;
		  
		  if (esPar == true) {
			  System.out.println("\n" + num + " es un numero par");
	        } else {
	          System.out.println("\n" + num + " es un numero impar");
	        }
	}

	}
