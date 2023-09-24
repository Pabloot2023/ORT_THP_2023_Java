/*Enunciado
	Realizá un programa que permita ingresar dos números enteros 
	y la operación a realizar (' + ', -', '”’, / ). 
	Debe mostrarse el resultado para la operación ingresada.
	Considerar que no se puede dividir por cero (en ese caso mostrar el texto ERROR ' ). [EC]
*/


package trabajo_practico_1_act_2_FixedTo_2WHILE;

import java.util.Scanner;

public class Ejercicio_20_FixedTo_WHILE {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		 int num1;
		 int num2;
		 int resultado;
	     char operacion;
	     int y = 1;
			
			while (y==1) {

	    System.out.print("Ingrese el primer numero: ");
	    num1 = miTeclado.nextInt();

	    System.out.print("Ingrese el segundo numero: ");
	    num2 = miTeclado.nextInt();

	    System.out.print("Ingrese la operacion a realizar (+, -, *, /): ");
	    operacion = miTeclado.next().charAt(0);

	        switch (operacion) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println("\n" + "El resultado de la suma es: " + resultado);
	                break;
	            case '-':
	                resultado = num1 - num2;
	                System.out.println("\n" + "El resultado de la resta es: " + resultado);
	                break;
	            case '*':
	                resultado = num1 * num2;
	                System.out.println("\n" + "El resultado de la multiplicacion es: " + resultado);
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("\n" + "ERROR: No se puede dividir por cero.");
	                } else {
	                    resultado = num1 / num2;
	                    System.out.println("\n" + "El resultado de la division es: " + resultado);
	                }
	                break;
	            default:
	                System.out.println("ERROR: Operacion invalida.");
	                break;
	        }    

	        miTeclado.close();

	}
	}
}
