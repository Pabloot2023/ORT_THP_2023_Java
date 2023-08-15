package trabajo_practico_1_act_2;

import java.util.Scanner;

/*Para entrar a la montaña rusa interno en las alturas se requiere
 *  tener al menos 7 años O medir más de 1,50 metros. 
 *  Completá el siguiente cuadro a mano según los requisitos 
 *  y luego escribí el programa que permita, ejecutándolo cada vez para cada niño 
 *  y según las edades y estaturas ingresadas por el usuario, 
 *  obtener los mismos resultados para los siguientes datos: [EC]
 * 
 * Nombre
 * Edad
 * Altura
 * ¿Entra al juego? (V/F)
 * 
 * Juan   María   Luis  Ana
 * 5      7       8     9
 * 1.45   1.23    1.51  1.39
 */

public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner miTeclado = new Scanner(System.in);
		
		 String nombre;
	        int EDAD = 6;
	        double ALTURA = 1.5;
	        boolean podriaEntrar;
	        String Juan;
	        String Maria;
	        String Luis;
	        String Ana;

	        // Juan
	        nombre = "Juan";
	        System.out.print("Ingrese la edad de Juan: ");
	        EDAD = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Juan: ");
	        ALTURA = miTeclado.nextDouble();
	        podriaEntrar = EDAD > 6 || ALTURA > 1.5;
	        Juan = (nombre + " tiene " + EDAD + " años, mide " + ALTURA + " metros y " + (podriaEntrar ? "puede" : "no puede") + " entrar al juego.");

	        // Maria
	        nombre = "Maria";
	        System.out.print("\n" + "Ingrese la edad de Maria: ");
	        EDAD = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Maria: ");
	        ALTURA = miTeclado.nextDouble();
	        podriaEntrar = EDAD > 6 || ALTURA > 1.5;
	        Maria = (nombre + " tiene " + EDAD + " años, mide " + ALTURA + " metros y " + (podriaEntrar ? "puede" : "no puede") + " entrar al juego.");

	        // Luis
	        nombre = "Luis";
	        System.out.print("\n" + "Ingrese la edad de Luis: ");
	        EDAD = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Luis: ");
	        ALTURA = miTeclado.nextDouble();
	        podriaEntrar = EDAD > 6 || ALTURA > 1.5;
	        Luis = (nombre + " tiene " + EDAD + " años, mide " + ALTURA + " metros y " + (podriaEntrar ? "puede" : "no puede") + " entrar al juego.");

	        // Ana
	        nombre = "Ana";
	        System.out.print("\n" + "Ingrese la edad de Ana: ");
	        EDAD = miTeclado.nextInt();
	        System.out.print("Ingrese la altura de Ana: ");
	        ALTURA = miTeclado.nextDouble();
	        podriaEntrar = EDAD > 6 || ALTURA > 1.5;
	        Ana = (nombre + " tiene " + EDAD + " años, mide " + ALTURA + " metros y " + (podriaEntrar ? "puede" : "no puede") + " entrar al juego.");

	        System.out.print("\n" +  Juan + "\n");
	        System.out.print( Maria + "\n");
	        System.out.print( Luis + "\n");
	        System.out.print( Ana + "\n");
	        
	        miTeclado.close();

	}

}
