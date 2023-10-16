/*
 1) Arrancando despacito... [EC]

a) Desde la clase Ejercicio1 crear el método sumar(...) que reciba 2 números y devuelva el valor
de la suma entre ambos.

b) Realizar un método de la misma clase llamado pedirNumero(...) el cual recibe un texto a
mostrar y 2 valores que serán los límites mínimo y máximo (inclusive). Deberá devolver un
número comprendido entre los límites recibidos.


 */

package trabajo_practico_2_act_1_Ejs_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static Scanner Teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
	        
	        int num1;
	        int num2;
	        int resultado;
	        int limiteMinimo = 1;
	        int limiteMaximo = 10;
	        int numeroElegido;
	        

	        System.out.println("Por favor, ingrese un primer numero: ");
	        num1 = Teclado.nextInt();
	        System.out.println("Por favor, ingrese un segundo numero: ");
	        num2 = Teclado.nextInt();
	        
	        resultado = sumar(num1, num2);
	        
	        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);		        
	        
	        System.out.println(" ");
	        System.out.println("----------------------------------");
	        System.out.println(" ");

	        numeroElegido = pedirNumero("Ingrese un número entre " + limiteMinimo + " y " + limiteMaximo + ": ",
	                limiteMinimo, limiteMaximo);
	        System.out.println(" ");
	        System.out.println("Número elegido: " + numeroElegido);

	        Teclado.close();
	    }

	    // Método para sumar dos números
	    public static int sumar(int num1, int num2) {		
	        return num1 + num2;
	    }

	    // Método para pedir un número dentro de un rango
	    public static int pedirNumero(String mensaje, int limiteMinimo, int limiteMaximo) {
	        int numeroIngresado;

	        do {
	            System.out.println(mensaje);
	            
					            while (!Teclado.hasNextInt()) {
					                System.out.println("Por favor, ingrese un número valido: ");
					                Teclado.next();
					            								}
					    numeroIngresado = Teclado.nextInt();

						            if (numeroIngresado < limiteMinimo || numeroIngresado > limiteMaximo) {
						            	System.out.println(" ");
						            	System.out.println("Por favor, ingrese un número valido: ");
						                System.out.println("El numero debe estar entre " + limiteMinimo + " y " + limiteMaximo + ".");
						                System.out.println(" ");
						            											}
	        	} while (numeroIngresado < limiteMinimo || numeroIngresado > limiteMaximo);

	        return numeroIngresado;
	    }
	}