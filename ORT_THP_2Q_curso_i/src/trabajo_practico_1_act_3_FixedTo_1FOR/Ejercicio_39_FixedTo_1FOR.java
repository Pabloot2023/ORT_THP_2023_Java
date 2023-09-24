/*Enunciado
39.	Nos proponemos desarrollar un “Tiro al blanco” en el cual 2 o más participantes realizan 3 disparos consecutivos cada uno.
 Cada tiro, dependiendo de la distancia al centro da un puntaje que se acumula (se suman los tres disparos).
  Gana el jugador con mayor puntaje (se supone único).
  
La puntuación para cada tiro es la siguiente:
•	Si la distancia respecto al centro es 0 se ganan 500 puntos;
•	Si la distancia es <= a 10, se ganan 250;
•	Si la distancia está entre 11y 50 ganará 100 puntos;
•	Si es mayor no ganará nada (cayó fuera del tablero).

La mecánica del juego es la siguiente:

Se pide la cantidad de jugadores (mayor o igual a 2). Por cada jugador:
•	Ingresar el nombre
•	Ingresar la distancia de cada uno de sus tres tiros consecutivos (número mayor o igual a cero), calculando para cada uno de estos el puntaje obtenido.

Se pide:
•	Informar el nombre del participante ganador del torneo y su puntaje (suponer único
máximo)
•	Informar la cantidad total de tiros al centro.
*/

package trabajo_practico_1_act_3_FixedTo_1FOR;

import java.util.Scanner;

public class Ejercicio_39_FixedTo_1FOR {

	public static void main(String[] args) {
		 Scanner miTeclado = new Scanner(System.in);
		 	
		 	String nombre;
	        int cantidadJugadores;
	        int puntajeMaximo = 0;
	        int tirosAlCentro = 0;
	        String ganador = null;
	        int puntajeTotal = 0; 
            int tirosCentroJugador = 0; 
            int i,j;
            int distancia;
            int puntaje = 0;
            int a =1;
    		int b =0 ;
    		
    		for (b=0;a == 1;b++) {

	        System.out.print("Ingrese la cantidad de jugadores: ");
	        cantidadJugadores = miTeclado.nextInt();
	        while (cantidadJugadores < 2) {
	            System.out.println("Cantidad de jugadores no válida. Intente nuevamente. (mínimo 2)");
	            System.out.println("Ingrese la cantidad de jugadores: ");
	            cantidadJugadores = miTeclado.nextInt();
	        }
	        miTeclado.nextLine(); //limpiar

	        for (i = 0; i < cantidadJugadores; i++) {
	            

	            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
	            nombre = miTeclado.nextLine();

	            				puntajeTotal = 0;
					            for (j = 0; j < 3; j++) {
					                System.out.println("Ingrese la distancia del tiro " + (j + 1) + " para " + nombre + ": ");
					                distancia = miTeclado.nextInt();
					                miTeclado.nextLine(); //limpiar
				
					                
				
					                if (distancia == 0) {
					                    puntaje = 500;
					                    tirosCentroJugador++;
					                } else if (distancia <= 10) {
					                    puntaje = 250;
					                } else if (distancia >= 11 && distancia <= 50) {
					                    puntaje = 100;
					                }
				
					                puntajeTotal += puntaje;
					            }

	         
	            if (puntajeTotal > puntajeMaximo) {
	                puntajeMaximo = puntajeTotal;
	                ganador = nombre;
	                tirosAlCentro = tirosCentroJugador;
	            }
	        }

	        System.out.println("\n" + "El ganador del torneo es: " + ganador);
	        System.out.println("Puntaje total: " + puntajeMaximo);
	        System.out.println("Cantidad total de tiros al centro: " + tirosAlCentro);

	        
	        miTeclado.close();
	    }
	}
}