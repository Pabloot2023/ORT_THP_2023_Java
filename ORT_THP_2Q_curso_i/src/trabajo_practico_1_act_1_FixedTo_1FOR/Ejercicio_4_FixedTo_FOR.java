/*Enunciado
	Realizá un programa que permita ingresar el valor monetario de una hora de trabajo
	y la cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario semanal, 
	sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los sábados. 
	(Todas las horas valen lo mismo.)
*/

package trabajo_practico_1_act_1_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_4_FixedTo_FOR {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		
        int valorHora = 2;
        int cantHora = 3;
        int pagoDia = valorHora*cantHora;
        int pagoSem = pagoDia*5;
        int horaSab = ((cantHora/2)*valorHora);
        int y =1;
		int i =0 ;
		
		for (i=0;y == 1;i++) {
        System.out.println("Ingrese un numero el valor monetario de una hora de trabajo: ");
        valorHora = miTeclado.nextInt();
        	
        System.out.println("Ingrese la cantidad de horas trabajadas por dia del trabajador: ");
        cantHora = miTeclado.nextInt();
        
        pagoDia = valorHora*cantHora;
        pagoSem = pagoDia*7;
        horaSab = ((cantHora/2)*valorHora);
        
        System.out.println("\n" + "El valor del salario semanal es de:");
        System.out.println("$ " + (pagoSem)) ;
        
        System.out.println("\n" + "El valor del salario semanal incluyendo media jornada del sabado es de:");
        System.out.println("$ " + (pagoSem+horaSab)) ;
        
        
        miTeclado.close();
		
       
		
	}
	}
}
