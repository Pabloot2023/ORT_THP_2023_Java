/*Enunciado
28.	Realizá un programa que a partir de un número entero cant ingresado 
por el usuario permita cargar por teclado cant números enteros. 
La computadora debe mostrar cuál fue el mayor número y en qué posición apareció.
*/

package trabajo_practico_1_act_3;

import java.util.Scanner;

public class Ejercicio_28 {

	 public static void main(String[] args) {
	        Scanner miTeclado = new Scanner(System.in);
	        
	        int cant,posicion,numero,i;
	        int mayor = 0;

	        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
	        cant = miTeclado.nextInt();
	        System.out.println("\n" + "--------------------------------------");

	        mayor = Integer.MIN_VALUE;
	        posicion = 0;

	        for ( i = 0; i < cant; i++) {
	            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
	            numero = miTeclado.nextInt();

	            if (numero > mayor) {
	                mayor = numero;
	                posicion = i + 1;
	            }
	        }
	   	 	System.out.println("--------------------------------------");
	        System.out.println("\n" + "El mayor numero ingresado es: " + mayor);
	        System.out.println("Se encontro en la posicion: " + posicion);
	        System.out.println("\n" + "--------------------------------------");

	        miTeclado.close();
	    }
	}