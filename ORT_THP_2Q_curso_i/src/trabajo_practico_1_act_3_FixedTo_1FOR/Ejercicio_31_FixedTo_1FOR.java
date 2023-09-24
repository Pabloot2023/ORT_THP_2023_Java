/*Enunciado
31.	Realizá un programa que permita validar una opción ingresada.
 Se le preguntará al usuario si desea continuar con alguna operación de la forma 
 "¿Deseás continuar* [S/N]". 
 Se espera que el usuario ingrese una ‘S’ o una ' N’ (incluir las minúsculas).
  La opción debe ser ingresada tanto como sea necesario hasta que 
  quede comprendida dentro de las posibilidades esperadas. 
  Realizá este ejercicio en dos versiones (A y B): 
  con ciclo while 
  con ciclo do-while.
*/
 
package trabajo_practico_1_act_3_FixedTo_1FOR;
 
import java.util.Scanner;
 
public class Ejercicio_31_FixedTo_1FOR {
 
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		String x = "X";
		boolean flag = true;
		char operacion;
		int a =1;
		int b =0 ;
		
		for (b=0;a == 1;b++) {
 
 
		while (flag)  {	
		System.out.println("Por favor, ingrese su nombre:" + "\n");
		x =miTeclado.nextLine();
 
		System.out.println( "\n" + "Bienvenido " + x + "!");
 
		System.out.println("\n" + "Si desea continuar presione S sino presione N para salir");
		operacion =miTeclado.nextLine().charAt(0);;
 
		//bloque bandera
		 if (operacion == 'S' || operacion == 's') {
	        	flag = true;
	        } else if (operacion == 'n' || operacion == 'N'){
	        	flag = false;
	        }
		//bloque bandera
 
		}
		//corchete previo cierra el while
		System.out.println("PROGRAMA FINALIZADO");
		miTeclado.close();
	}
	}
}
 
