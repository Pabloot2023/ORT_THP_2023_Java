/*Enunciado
 	Realizá un programa que permita ingresar dos números 
 	que representan las medidas en grados de dos ángulos interiores de cierto triángulo.
 	A partir de los valores de estos dos ángulos el programa debe mostrar el valor en grados del ángulo restante. 
 	Recorda que la suma de los ángulos interiores de todo triángulo es de 180º.
*/

/* 
@startuml
class Scanner
class Ejercicio_9 {
    +main(args: String[]): void
}
Ejercicio_9 --> Scanner
@enduml
*/


package trabajo_practico_1_act_1_FixedTo_4UML;

import java.util.Scanner;

public class Ejercicio_9_FixedTo_UML {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int angulo1 = 0;
		int angulo2 = 0;
		
		 System.out.println("Ingrese el valor del primer angulo");
		 angulo1 = miTeclado.nextInt();
		
		 System.out.println("Ingrese el valor del segundo angulo");
		 angulo2 = miTeclado.nextInt();
		 
		 System.out.println("\n" + "El valor del tercer angulo es de " + (180-angulo1-angulo2) + " grados");
		 
		  miTeclado.close();
		 
		 
		
		

	}

}
