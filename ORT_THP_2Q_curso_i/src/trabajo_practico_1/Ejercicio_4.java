package trabajo_practico_1;

/*
 Realizá un programa que permita ingresar el valor monetario de una hora de trabajo
  y la cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario semanal, 
  sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los sábados. 
  (Todas las horas valen lo mismo.)
 */

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		
        double valorHora = 0;
        double cantHora = 0;
        double pagoDia = valorHora*cantHora;
        double pagoSem = pagoDia*7;
        double horaSab = ((cantHora/2)*valorHora);
        
        
        System.out.println("Ingrese un numero el valor monetario de una hora de trabajo: ");
        valorHora = miTeclado.nextDouble();
        	
        System.out.println("Ingrese la cantidad de horas trabajadas por dia del trabajador: ");
        cantHora = miTeclado.nextDouble();
        
        System.out.println("\n" + "El valor del salario semanal es de:");
        System.out.println("$ " + (pagoSem)) ;
        
        miTeclado.close();
		
       
		
	}

}
