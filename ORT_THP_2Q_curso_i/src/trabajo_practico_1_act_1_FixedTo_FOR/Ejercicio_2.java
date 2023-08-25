/*Enunciado
	Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
	 para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
*/

package trabajo_practico_1_act_1_FixedTo_FOR;

import java.util.Scanner;
//se importa el scanner

public class Ejercicio_2 {
	
	// private static Scanner miTeclado = new Scanner(System.in);
	// se iniciaria scanner con private static  por estar fuera del metodo main

	public static void main(String[] args) {

		Scanner miTeclado = new Scanner(System.in);
		// se inicia scanner SIN private static  por estar dentro  del metodo main

		
		int notaparcial1 = 6;
		// variable para la nota 1
		int notaparcial2 = 6;
		// variable para la nota 2
		int sumatoriaDeNotas = 0;
		// sumatoria de las notas
		double promedio = 0;
		// variable para el promedio
		String nombre = "Juan";
		// variable para el nombre del alumno
	
		
		System.out.println("Ingrese el Nombre del Alumno: ");
		nombre = miTeclado.nextLine();
		// se pregunta el nombre y pisa lo inicializado
			
	
		System.out.println("Ingrese la primer nota: ");
		// se pregunta la primer nota y pisa lo inicializado
		notaparcial1 = miTeclado.nextInt();
        
		System.out.println("Ingrese la segunda nota: ");
		notaparcial2 = miTeclado.nextInt();
		// se pregunta la segunda nota y pisa lo inicializado
		
		sumatoriaDeNotas = notaparcial1 + notaparcial2;
		// suma toda las nota y pisa lo inicializado
		promedio = (double)sumatoriaDeNotas/2;
		// calcula el promedio y pisa lo inicializado
		
		System.out.println("\n" + "Hola " + nombre + "!!");
        System.out.println("La nota del primer parcial es: " + notaparcial1);
        System.out.println("La nota del segundo parcial es: " + notaparcial2 + "\n");
        System.out.println("El Promedio es: " + promedio + "\n");
       
        
        
        //toma decision en base a condicion
        // hacer una cosa un otra
        
        if ( promedio >= 4 ) {
        System.out.println("Felicitaciones has aprobado!!!" + "\n");
        // caso positivo
        } 
       else { 
    	System.out.println("Lamentablemente no has aprobado..." + "\n");
        // caso negativo
        }
  

			
		miTeclado.close();
	    // por buena practica siempre cerrar el scanner que se abre

	}

}
