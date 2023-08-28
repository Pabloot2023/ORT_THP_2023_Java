/*Enunciado
	Realizá un programa que permita ingresar dos números naturales.
	Debes mostrar los resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC] 
*/

/*@startuml
class Scanner
class Ejercicio_8_FixedTo_UML {
    - miTeclado: Scanner
    - num1: int
    - num2: int
    - suma: int
    - resta: int
    - multiplicacion: int
    - division: double
    
    +main(args: String[]): void
}

Ejercicio_8_FixedTo_UML --> Scanner

Ejercicio_8_FixedTo_UML : RealizarOperacionesMatematicas()
@enduml
*/

package trabajo_practico_1_act_1_FixedTo_4UML;

import java.util.Scanner;

public class Ejercicio_8_FixedTo_UML {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		int resta = 0;
		int multiplicacion = 0;
		double division = 0;
		
		// Pedir al usuario que ingrese dos números naturales.
        System.out.println("Ingrese el primer numero:");
        
        num1 = miTeclado.nextInt();


        System.out.println("Ingrese el segundo numero:");
        num2 = miTeclado.nextInt();

        // Realizar las operaciones matemáticas básicas.
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;

        // Mostrar los resultados de cada operación matemática.
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        miTeclado.close();
		
	

	}

}
