/*Enunciado
Realizá un programa que permita ingresar números
 mientras el promedio entre todos los ingresados sea menor a 20. 
 Al terminar el ingreso indicar la cantidad de valores leídos. [EC]
*/
 
package trabajo_practico_1_act_3_FixedTo_3DoWHILE;
 
import java.util.Scanner;
 
public class Ejercicio_36_FixedTo_3DoWHILE {
 
	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
 
		int numero;
		double promedio = 0;
		int divisor = 0 ; 
		int vueltas = 0 ; //cantidad de valores leídos
		int y = 1;
		
		do {
 
		while ( promedio < 20 )   {
			divisor ++ ;
			System.out.println("Ingrese un numero: ");
			numero = miTeclado.nextInt();
 
			promedio = (numero+promedio) / divisor;
			vueltas++;
		}
 
		System.out.println("El promedio final es " + promedio);
		System.out.println("la cantidad de valores leidos fue " + vueltas);
	} while (y == 1);
		miTeclado.close();
		
	}
 
}

