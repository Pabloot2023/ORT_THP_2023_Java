/*Enunciado
	Realizá un programa que permita ingresar el monto total de las ventas realizadas por un vendedor durante el mes,
	de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16 por ciento del monto total vendido. 
	Con tales datos debes calcular y mostrar el importe a cobrar por el vendedor.
*/

package trabajo_practico_1_act_1_FixedTo_FOR;

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
	
	Scanner miTeclado = new Scanner(System.in);
	
	final String CARTEL = "Bienvenido";
	int ventasTot = 0;
	final int SUELDOFIJO = 44000;
	final double COMISION = 16;
	
	System.out.println(CARTEL);
	System.out.println("Ingrese el monto total de las ventas realizadas");
	ventasTot = miTeclado.nextInt();
	System.out.println("\n" + "El monto a cobrar por el vendedor es de: $" + ((double)SUELDOFIJO+(ventasTot*COMISION/100)));
	
	miTeclado.close();
	
	
	}
}
