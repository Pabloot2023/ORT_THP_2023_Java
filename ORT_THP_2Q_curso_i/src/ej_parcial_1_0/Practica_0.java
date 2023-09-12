/*Enunciado
Nos encargan un programa para procesar los resultados de una consulta popular a realizarse entre 
los habitantes de un distrito.
La pregunta que deberá responder cada ciudadano es si desea que se poden los árboles. 
Las respuestas posibles son "S", "N", "B" (si votan en blanco) o 'F' (para finalizar el proceso).
Por cada voto se ingresarán los siguientes datos:
Opción Votada
1 Carácter ("S", "N", "B" o "F").
Edad del Votante
Entero (18 o más años).
Nota 1:
Los datos a ingresar deben ser validados.
Nota 2:
El ingreso de datos termina al ingresar "F" como opción.

----->Se pide informar:

1. Opción ganadora ("Sí", "No" o "Indeterminado"). 
Se considera Indeterminado si la mayoría votó en blanco. Se considera que no habrá empate.

2. Porcentaje de votantes que no desean que los árboles se poden.

3. Promedio de edad de los votantes.
 */

package ej_parcial_1_0;

import java.util.Scanner;

public class Practica_0 {

    public static void main(String[] args) {

        Scanner miTeclado = new Scanner(System.in);

        String opcion;
        int edad = 0;
        int votS = 0;
        int votN = 0;
        int votB = 0;
        int totalVOTOS = 0;
        double porcentajeNegativo = 0;
        int totalEDAD = 0;
        int contadorEDAD = 0;
        double promedioEDAD = 0;
        String mensaje = "a";

        // INICIO pedir voto
        System.out.println("Ingrese el voto, las ocpiones son");
        System.out.println("S" + " Para votar que SI");
        System.out.println("B" + " Para votar en BLANCO");
        System.out.println("N" + " Para votar que NO");
        System.out.println("F" + " Para finalizar la carga de votos");
        opcion = miTeclado.nextLine().toUpperCase();
        while (!opcion.equals("S") && !opcion.equals("N") && !opcion.equals("B") && !opcion.equals("F")) {
            System.out.println("ERROR! VERIFIQUE EL DATO INGRESADO! las ocpiones son");
            System.out.println("S" + " Para votar que SI");
            System.out.println("B" + " Para votar en BLANCO");
            System.out.println("N" + " Para votar que NO");
            System.out.println("F" + " Para finalizar la carga de votos");
            opcion = miTeclado.nextLine().toUpperCase();
        }
        // FIN pedir voto

				        // INICIO ciclo mayor
				        while (!opcion.equals("F")) {
					            // INICIO pedir edad
					            System.out.println("Ingrese la edad del votante");
					            edad = miTeclado.nextInt();
							            while (edad < 18) {
							                System.out.println("Error verifique la edad ingresada");
							                System.out.println("Solo pueden votar personas de 18 anios en adelante");
							                System.out.println("Ingrese la edad del votante");
							                edad = miTeclado.nextInt();
							            }				
					            // FIN pedir edad
					
					            // INICIO asignar valores
					            switch (opcion) {
					                case "S":
					                    votS++;
					                    break;
					                case "N":
					                    votN++;
					                    break;
					                case "B":
					                    votB++;
					                    break;
					                default:
					
					                    break;
					            }
					            // FIN asignar valores
					
					            // INICIO interno Promedio de edad
					            totalEDAD += edad;
					            totalVOTOS++;
					            contadorEDAD++;
					
					            // FIN interno Promedio de edad
					
					            // INICIO pedir voto
					            miTeclado.nextLine();
					            System.out.println("Ingrese el voto, las ocpiones son");
					            System.out.println("S" + " Para votar que SI");
					            System.out.println("B" + " Para votar en BLANCO");
					            System.out.println("N" + " Para votar que NO");
					            System.out.println("F" + " Para finalizar la carga de votos");
					            opcion = miTeclado.nextLine().toUpperCase();					
								            while (!opcion.equals("S") && !opcion.equals("N") && !opcion.equals("B") && !opcion.equals("F")) {
								                System.out.println("ERROR! VERIFIQUE EL DATO INGRESADO! las ocpiones son");
								                System.out.println("S" + " Para votar que SI");
								                System.out.println("B" + " Para votar en BLANCO");
								                System.out.println("N" + " Para votar que NO");
								                System.out.println("F" + " Para finalizar la carga de votos");
								                opcion = miTeclado.nextLine().toUpperCase();
								            }
					            // FIN pedir voto
				
				        }
				        // FIN ciclo mayor

        // INICIO porcentaje negativo
        if (totalVOTOS > 0) {
            porcentajeNegativo = ((double) votN / totalVOTOS) * 100;
        } else {
            porcentajeNegativo = 0;
        }
        // FIN porcentaje negativo

        // INICIO externo Promedio de edad
        if (contadorEDAD > 0) {
            promedioEDAD = (double) totalEDAD / contadorEDAD;
        } else {
            promedioEDAD = 0;
        }
        // FIN externo Promedio de edad

        // INICIO ver que opción ganó
        if (votS > votN && votS > votB) {
            mensaje = "La opción ganadora fue 'SI' ";
        } else if (votN > votS && votN > votB) {
            mensaje = "La opción ganadora fue 'NO' ";
        } else if (votB > votS && votB > votN) {
            mensaje = "La opción ganadora fue 'Indeterminado' ";
        }
        // FIN ver qué opción ganó

        // INICIO impresión de resultados
        System.out.println(mensaje);
        System.out.println("El porcentaje de votantes que no desean que los arboles se poden fue: " + porcentajeNegativo + "%");
        System.out.println("El Promedio de edad de los votantes fue: " + promedioEDAD + " anios");

        // Fin impresión de resultados

        miTeclado.close();
    }

}
