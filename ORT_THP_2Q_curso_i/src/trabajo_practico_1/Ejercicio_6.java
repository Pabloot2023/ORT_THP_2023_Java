package trabajo_practico_1;

/*Realizá un programa que permita ingresar el monto total de las ventas realizadas por un vendedor durante el mes,
 *  de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16 por ciento del monto total vendido. 
 *  Con tales datos debes calcular y mostrar el importe a cobrar por el vendedor.
 */

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
	
	Scanner miTeclado = new Scanner(System.in);
	
	int ventasTot = 0;
	int sueldoFijo = 44000;
	
	System.out.println("Ingrese el monto total de las ventas realizadas");
	ventasTot = miTeclado.nextInt();
	System.out.println("El monto a cobrar por el vendedor es de: $" + ((double)sueldoFijo+(ventasTot*0.16)));
	
	
	
	}
}
