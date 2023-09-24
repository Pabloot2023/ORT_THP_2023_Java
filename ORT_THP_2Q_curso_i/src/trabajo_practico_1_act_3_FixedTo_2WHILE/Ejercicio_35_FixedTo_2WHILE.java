/*Enunciado
35.	Realizá un programa que permita ingresar 
nombre y edad de un grupo de personas (para cada una, nombre y edad).
 La carga termina cuando en el nombre de la persona se ingresa un asterisco 
 (’ * '). Mostrar al final cómo se Ilama la persona más joven.
*/

package trabajo_practico_1_act_3_FixedTo_2WHILE;

import java.util.Scanner;

public class Ejercicio_35_FixedTo_2WHILE {

    public static void main(String[] args) {
        Scanner miTeclado1 = new Scanner(System.in);
        Scanner miTeclado2 = new Scanner(System.in);

        String nombre;
        int edad;
        int younger = 100000;
        String dato_nombre = "a";
        int dato_edad = 0;
        int y = 1;
    	while (y == 1){

        System.out.print("Ingrese el nombre de la persona: ");
        nombre = miTeclado1.nextLine();

        while (!nombre.equals("*")) {

            System.out.print("Ingrese la edad de la persona: ");
            edad = miTeclado2.nextInt();

            if (edad < younger) {
                dato_nombre = nombre;
                dato_edad = edad;
            }
            
            nombre = "a";
            edad = 0;

            System.out.print("Ingrese el nombre de la persona: ");

            nombre = miTeclado1.nextLine();
        }

        System.out.println("El nombre de la persona mas Joven es: " + dato_nombre);
        miTeclado1.close();
        miTeclado2.close();
    }
}
}