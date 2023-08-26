/*Enunciado
    Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia
    y la cantidad de asientos disponibles en el auditorio. 
    Debes indicar si alcanzan los asientos, Si los asientos no alcanzaran 
    indicar cuántos faltan para que todos los inscriptos puedan sentarse.
*/

package trabajo_practico_1_act_2_FixedTo_3DoWHILE;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int inscriptos;
        int asientosDisponibles;
        int faltantes;
        
        System.out.print("Ingrese la cantidad de inscriptos: ");
        inscriptos = miTeclado.nextInt();
        System.out.print("Ingrese la cantidad de asientos disponibles en el auditorio: ");
        asientosDisponibles = miTeclado.nextInt();

        if (inscriptos <= asientosDisponibles) {
            System.out.println("Hay suficientes asientos para todos los inscriptos.");
        } else {
            faltantes = inscriptos - asientosDisponibles;
            System.out.println("\n" +"No hay suficientes asientos para todos los inscriptos."); 
            System.out.println("Faltan " + faltantes + " asientos.");
        }

        miTeclado.close();
	}

}
