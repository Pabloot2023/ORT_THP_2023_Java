/*Enunciado
 	Realizá un programa que permita ingresar un número entero e indique si se trata de un número par o impar. [EC]
*/

package trabajo_practico_1_act_2_FixedTo_3DoWHILE;

import java.util.Scanner;

public class Ejercicio_11_FixedTo_DoWhile {

	public static void main(String[] args) {
	
		Scanner miTeclado = new Scanner(System.in);
		int num = 0;
//		boolean esPar = false;
		int y = 1;
		
		do {
		
		System.out.println("Ingrese un numero entero, le dire si es par o impar");
		num =  miTeclado.nextInt();
		
		if (num % 2 == 0) {
            System.out.println("\n" + num + " es un numero par");
        } else {
            System.out.println("\n" + num + " es un numero impar");
        }

		  miTeclado.close();
		} while (y == 1);

		}

	}
	
/* otra forma de hacer lo mismo
		  
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
*/			
		  

/* otra forma de hacer lo mismo.MAS OPTIMO	  
		  esPar = num % 2 == 0;
		  
		  if (esPar == true) {
			  System.out.println("\n" + num + " es un numero par");
	        } else {
	          System.out.println("\n" + num + " es un numero impar");
	        }

*/	

