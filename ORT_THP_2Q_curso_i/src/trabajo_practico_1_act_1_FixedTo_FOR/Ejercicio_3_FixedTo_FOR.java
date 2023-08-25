/*Enunciado
	Realizá un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
	Multiplicado por 5.
	Dividido por 2.
*/

package trabajo_practico_1_act_1_FixedTo_FOR;

import java.util.Scanner;

public class Ejercicio_3_FixedTo_FOR {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		// se inicia scanner SIN private static  por estar dentro  del metodo main
		
        int numero = 0;
        
        System.out.println("Ingrese un numero entero: ");
        numero = miTeclado.nextInt();
        
        System.out.println("El numero ingresado es: " + numero + "\n");
    	
        System.out.println("El numero multiplicado por 5 es: " + (numero * 5) + "\n");
        
        System.out.println("El número dividido por 2 es: " + (numero / 2) + "\n");
        //System.out.printf("El numero dividido por 2 es: %.2f", ((double) numero / 2));
		
        //%.2f para que exhiba los dos decimales
        //(double) para que cambie el int de la variable numero a double
        
        /*otra forma para elegir cuantos decimales mostrar
         	double division = (double) numero / 2;
        	DecimalFormat decimalFormat = new DecimalFormat("#.##");
        	System.out.println("El número dividido por 2 es: " + decimalFormat.format(division));
        */
        
        miTeclado.close();
		
		

	}

}
