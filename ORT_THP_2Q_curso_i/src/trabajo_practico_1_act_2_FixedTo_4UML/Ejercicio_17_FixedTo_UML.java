/*Enunciado
    Realizá un programa que permita ingresar una edad (entre 1 y 120 años)
    y un género (' F para mujeres, 'M’ para hombres).
    En caso de haber ingresado valores erróneos (edad fuera de rango o género inválido), 
    informar tal situación y terminar el programa. 
    Si los datos están bien ingresados el programa debe indicar,
    sabiendo que las mujeres se jubilan con 60 años o más y los hombres con 65 años o más, 
    si la persona está en edad de jubilarse.
*/


package trabajo_practico_1_act_2_FixedTo_4UML;

import java.util.Scanner;

public class Ejercicio_17_FixedTo_UML {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int edadNum;
		boolean edadFlag;
        String genero;
        boolean generoFlag;
        
        System.out.print("Ingrese la edad: ");
        edadNum = miTeclado.nextInt();
        miTeclado.nextLine(); // limpiar buffer del teclado 
        
        System.out.print("Ingrese el genero (F/M): ");
        genero = miTeclado.nextLine().toUpperCase();
        
        // INICIO BANDERAS
        if ( edadNum >= 1 && edadNum <= 120)  {
        	edadFlag = true;
        	} else {
        	edadFlag = false;	
        	}
        
        if (genero.equals("M") || genero.equals("F")){
        	generoFlag = true;
        	} else {
        	generoFlag = false;	
        	}
        // FIN BANDERAS
        
        			//INICIO PROGRAMA 3 ESCENARIOS
        			//ESCENARIO 1 ERROR - CIERRA
        			//ESCENARIO 2 DATOS OK - SE PUEDE JUBILAR - CIERRA 
        			//ESCENARIO 3 DATOS OK - NO SE PUEDE JUBILAR - CIERRA 
        
      //INICIO BLOQUE PROGRAMA 
        if ( edadFlag == false || generoFlag == false ) {
        	//ESCENARIO 1 ERROR - CIERRA
        	System.out.println("--------------------------------------");
        	System.out.println("Los valores ingresados son invalidos.");
        	System.out.println("Programa terminado");
        	System.out.println("--------------------------------------");
        }
        	else  if ( edadFlag == true && generoFlag == true ) {
        	
        		//INICIO BLOQUE PROGRAMA DATOS OK
				if ((genero.equals("F") && edadNum >= 60) || (genero.equals("M") && edadNum >= 65)) {
					//ESCENARIO 2 OK - SE PUEDE JUBILAR - CIERRA 
					System.out.println("--------------------------------------");
					System.out.println("Esta en edad de jubilarse.");
					System.out.println("Programa terminado");
		        	System.out.println("--------------------------------------");
				} else {
				    //ESCENARIO 3 OK - NO SE PUEDE JUBILAR - CIERRA 
					System.out.println("--------------------------------------");
					System.out.println("No esta en edad de jubilarse.");
					System.out.println("Programa terminado");
		        	System.out.println("--------------------------------------");
					}
				//FIN BLOQUE PROGRAMA DATOS OK       	
        		}
        miTeclado.close();
	}
	
  }