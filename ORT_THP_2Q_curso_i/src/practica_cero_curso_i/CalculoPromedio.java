package practica_cero_curso_i;
//se declara el paquete

import java.util.Scanner;
//se importa el scanner

public class CalculoPromedio {
	// apertura del cuerpo de la clasee
	
	// private static Scanner miTeclado = new Scanner(System.in);
	// se inicia scanner con private static  por estar fuera del metodo main

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		// se inicia scanner SIN private static  por estar dentro  del metodo main

		
		int notaparcial1;
		// variable para la nota 1
		int notaparcial2;
		// variable para la nota 2
		int sumatoriaDeNotas;
		// sumatoria de las notas
		double promedio;
		// variable para el promedio
		String nombre;
		// variable para el nombre del alumno
		boolean x;
		// variable para loopear
		
		
		// inicializamos siempre todas las variables
		notaparcial1 = 6;
		notaparcial2 = 6;
		sumatoriaDeNotas = 0;
		promedio =	0;
		nombre = "Juan";
		// inicializamos siempre todas las variables
		x=true;
		
		System.out.println("Ingrese el Nombre del Alumno: ");
		nombre = miTeclado.nextLine();
		// se pregunta el nombre y pisa lo inicializado
		
			do {	
	
		System.out.println("Ingrese la primer nota: ");
		// se pregunta la primer nota y pisa lo inicializado
		notaparcial1 = miTeclado.nextInt();
        
		System.out.println("Ingrese la primer nota: ");
		notaparcial2 = miTeclado.nextInt();
		// se pregunta la segunda nota y pisa lo inicializado
		
		sumatoriaDeNotas = notaparcial1 + notaparcial2;
		// suma toda las nota y pisa lo inicializado
		promedio = (double)sumatoriaDeNotas/2;
		// calcula el promedio y pisa lo inicializado
		
		System.out.println("\n" + "Hola " + nombre + "!!");
        System.out.println("La nota del primer parcial es: " + notaparcial1);
        System.out.println("La nota del segundo parcial es: " + notaparcial2 + "\n");
        System.out.println("El Promedio es: " + promedio + "\n" + x);
        
        
        //toma decision en base a condicion
        // hacer una cosa un otra
        
        if ( promedio >= 4 ) {
        System.out.println("Felicitaciones has aprbado!!!" + "\n");
        // caso positivo
        } 
       else { 
    	System.out.println("Lamentablemente no has aprobado..." + "\n");
        // caso negativo
        }
  
        
        
      } while( x=true);
		// loop infinito
			
		miTeclado.close();
	    // por buena practica siempre cerrar el scanner que se abre
	
	}

}
