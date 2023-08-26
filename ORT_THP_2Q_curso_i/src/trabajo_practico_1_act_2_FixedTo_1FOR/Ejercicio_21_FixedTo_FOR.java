/*Enunciado
    Realizá un programa que permita al usuario ingresar un número entero entre 1 y 7. 
    Debe mostrarse por pantalla el nombre del día de la semana que representa tal número 
    tomando como el primer día de la semana el Domingo.
    De ingresar un número fuera de rango debe mostrar error.
*/

package trabajo_practico_1_act_2_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_21_FixedTo_FOR {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int diaSemana;
        String nombreDia;

        System.out.println("Ingrese un numero entre 1 y 7: ");
        diaSemana = miTeclado.nextInt();

        switch(diaSemana) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;   
            default:
                nombreDia = "Error";
                break;
                
        }

        if (nombreDia.equals("Error")) {
            System.out.println("\n" + "El numero ingresado esta fuera de rango.");
        } else {
            System.out.println("\n" + "El numero " + diaSemana + " corresponde al dia " + nombreDia + ".");
        }

        miTeclado.close();

	}

}
