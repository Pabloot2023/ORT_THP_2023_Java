package trabajo_practico_1_act_2;

/* Enunciado
 Realizó un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y su valor. [EC]
 */

import java.util.Scanner;


public class Ejercicio_13 {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		 int numero1 = 0;
		 int numero2 = 0;
		 int numero3 = 0;
		 int mayor = 0;
		
		System.out.print("Ingrese el primer numero: ");
	    numero1 = miTeclado.nextInt();  
	    System.out.print("Ingrese el segundo numero: ");
	    numero2 = miTeclado.nextInt();  
	    System.out.print("Ingrese el tercer numero: ");
	    numero3 = miTeclado.nextInt();;  
	    
	    mayor = numero1;  
	    
	    if (numero2 > mayor) {
	        mayor = numero2;  
	    } else if (numero3 > mayor) {
	        mayor = numero3;  
	    }
	    
	    System.out.println("El numero mayor es: " + mayor);  // imprimir el número mayor
	    
	    miTeclado.close(); 
		

	}

	
	
}




