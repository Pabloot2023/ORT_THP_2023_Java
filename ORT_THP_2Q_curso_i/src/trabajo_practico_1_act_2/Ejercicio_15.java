/*Enunciado
	Para entrar a la montaña rusa interno en las alturas se requiere
 	tener al menos 7 años O medir más de 1,50 metros. 
 	Completá el siguiente cuadro a mano según los requisitos 
 	y luego escribí el programa que permita, ejecutándolo cada vez para cada niño 
 	y según las edades y estaturas ingresadas por el usuario, 
 	obtener los mismos resultados para los siguientes datos: [EC]
 	 
 	Nombre
 	Edad
 	Altura
 	¿Entra al juego? (V/F)
 
	Juan   María   Luis  Ana
	5      7       8     9
	1.45   1.23    1.51  1.39
*/

package trabajo_practico_1_act_2;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner miTeclado = new Scanner(System.in);
		
		 String nombre;
	        int edad = 6;
	        double altura = 1.5;
	        boolean podriaEntrar;
	        String Juan;
	        String Maria;
	        String Luis;
	        String Ana;
	        String flag;

	        // Juan
	        nombre = "Juan";
	        System.out.print("Ingrese la edad de Juan: ");
	        edad = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Juan: ");
	        altura = miTeclado.nextDouble();
	       
	        if (podriaEntrar = edad >= 7 || altura > 1.5 ) {
	        	podriaEntrar = true;
	        	flag = "puede";
	        } else {
	        	podriaEntrar = false;
	        	flag = "no puede";
	        }
	        	        
	        Juan = (nombre + " tiene " + edad + " anios, mide " + altura + " metros y " + flag + " entrar al juego.");

	        // Maria
	        nombre = "Maria";
	        System.out.print("\n" + "Ingrese la edad de Maria: ");
	        edad = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Maria: ");
	        altura = miTeclado.nextDouble();

	        if (podriaEntrar = edad >= 7 || altura > 1.5 ) {
	        	podriaEntrar = true;
	        	flag = "puede";
	        } else {
	        	podriaEntrar = false;
	        	flag = "no puede";
	        }
	        	
	        Maria = (nombre + " tiene " + edad + " anios, mide " + altura + " metros y " + flag + " entrar al juego.");

	        // Luis
	        nombre = "Luis";
	        System.out.print("\n" + "Ingrese la edad de Luis: ");
	        edad = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Luis: ");
	        altura = miTeclado.nextDouble();

	        if (podriaEntrar = edad >= 7 || altura > 1.5 ) {
	        	podriaEntrar = true;
	        	flag = "puede";
	        } else {
	        	podriaEntrar = false;
	        	flag = "no puede";
	        }
	        	
	        Luis = (nombre + " tiene " + edad + " anios, mide " + altura + " metros y " + flag + " entrar al juego.");

	        // Ana
	        nombre = "Ana";
	        System.out.print("\n" + "Ingrese la edad de Ana: ");
	        edad = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Ana: ");
	        altura = miTeclado.nextDouble();

	        if (podriaEntrar = edad >= 7 || altura > 1.5 ) {
	        	podriaEntrar = true;
	        	flag = "puede";
	        } else {
	        	podriaEntrar = false;
	        	flag = "no puede";
	        }
	        	
	        Ana = (nombre + " tiene " + edad + " anios, mide " + altura + " metros y " + flag + " entrar al juego.");

	        System.out.print("\n" +  Juan + "\n");
	        System.out.print( Maria + "\n");
	        System.out.print( Luis + "\n");
	        System.out.print( Ana + "\n");
	        
	        miTeclado.close();

	}

}
