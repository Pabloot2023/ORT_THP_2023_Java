/*Enunciado
	Realizá un programa que permita al usuario ingresar 
	dos números enteros num1 y num2, donde el primero
	 siempre deberá ser menor o igual al segundo. 
	 La computadora debe mostrar la secuencia de números existentes entre ambos:
a.	Incluyéndolos;
b.	Excluyéndolos.

*/

package trabajo_practico_1_act_3_FixedTo_2WHILE;

import java.util.Scanner;

public class Ejercicio_24_FixedTo_2WHILE {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int i;
		
		System.out.print("Ingrese un numero entero: ");
        num1 = miTeclado.nextInt();
        
        System.out.print("Ingrese otro numero entero: ");
        num2 = miTeclado.nextInt();
		
                
        while (num1 < num2) {
        	System.out.println("--------------------------------------");
        	System.out.print("\n" + "Verifique los datos: el segundo numero no puede ser menor al primero");
        	System.out.print("\n" + "Ingrese nuevamente un numero entero: ");
            num1 = miTeclado.nextInt();
            
            System.out.print("Ingrese nuevamente otro numero entero: ");
            num2 = miTeclado.nextInt();
        };
        
        System.out.println("--------------------------------------");
        System.out.println("\n" + "La secuencia de numeros entre " + num1 + " y " + num2 + " incluyendolos, es:" );
        
        for (i = num1 ; i >= num2 ; i++) {
            System.out.println("--> " + i);
        }
        
        System.out.println("\n" + "--------------------------------------");
        System.out.println("\n" + "La secuencia de numeros entre " + num1 + " y " + num2 + " excluyendolos, es:" );
        
        for (i = num1 + 1 ; i < num2  ; i++) {
            System.out.println("--> " + i);
        }
        System.out.println("\n" + "--------------------------------------");
        
        
        miTeclado.close(); 
	}

}
