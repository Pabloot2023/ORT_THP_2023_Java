package trabajo_practico_1_act_2;

/*Enunciado
 * Realizá un programa que permita ingresar una edad (entre 1 y 120 años)
 *  y un género (' F para mujeres, 'M’ para hombres).
 *   En caso de haber ingresado valores erróneos (edad fuera de rango o género inválido), 
 *   informar tal situación y terminar el programa. 
 *   Si los datos están bien ingresados el programa debe indicar,
 *    sabiendo que las mujeres se jubilan con 60 años o más y los hombres con 65 años o más, 
 *    si la persona está en edad de jubilarse.
 */

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int edad;
        char genero;

        // Repetir hasta que se ingrese una edad válida
        do {
            System.out.print("Ingrese la edad: ");
            if (miTeclado.hasNextInt()) {
                edad = miTeclado.nextInt();
                miTeclado.nextLine(); // Para limpiar el buffer del scanner
                break;
            } else {
                System.out.println("Los valores ingresados son inválidos.");
                miTeclado.nextLine(); // Para limpiar el buffer del scanner
            }
        } while (true);

        // Repetir hasta que se ingrese un género válido
        do {
            System.out.print("Ingrese el género (F/M): ");
            genero = miTeclado.nextLine().toUpperCase().charAt(0);
            if (genero == 'F' || genero == 'M') {
                break;
            } else {
                System.out.println("El género ingresado es inválido.");
            }
        } while (true);

        if ((genero == 'F' && edad >= 60) || (genero == 'M' && edad >= 65)) {
            System.out.println("Esta en edad de jubilarse.");
        } else {
            System.out.println("No esta en edad de jubilarse.");
        }

        miTeclado.close();

	}

}
