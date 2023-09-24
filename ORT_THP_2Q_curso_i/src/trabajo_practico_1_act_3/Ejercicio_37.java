/*Enunciado
Realizá un programa que permita al usuario ingresar hasta 12 valores,
 de a uno por vez, que representan los sueldos mensuales que percibió
  un empleado durante un año calendario. 
  Si durante la carga de los sueldos mensuales se detecta un valor negativo,
   esto indica que aún no se ha cobrado el mes en curso, 
   y en ese caso se debe dejar de ingresar datos. 
   AI finalizar mostrar el monto percibido por el empleado hasta ese momento 
   (total o parcial).
*/


package trabajo_practico_1_act_3;
import java.util.Scanner;

public class Ejercicio_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double sueldo = 0;
        double totalSueldos = 0;
        int i = 0;
        boolean continuar = true;

        while (i < 12 && continuar) {
            System.out.println("Ingrese el sueldo del mes " + (i + 1));
            sueldo = scanner.nextDouble();

            if (sueldo < 0) {
                continuar = false;
            } else {
                totalSueldos += sueldo;
                i++;
            }
        }

        System.out.println("El monto percibido por el empleado hasta el momento es: $" + totalSueldos);
        
        scanner.close();
    }
}
