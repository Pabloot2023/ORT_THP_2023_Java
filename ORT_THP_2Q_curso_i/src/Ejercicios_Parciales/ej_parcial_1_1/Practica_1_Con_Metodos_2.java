package ej_parcial_1_1;

import java.util.Scanner;

public class Practica_1_Con_Metodos_2 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
			String nombre_jugador;
			int guita_inicial = 0;
			int guita_jugador = 0 ;
			final int MONTO_MINIMO_GUITA = 500;
			int guita_min_pa_quedarse = (int) (guita_inicial * 0.2);
			final int COSTO_RUL = 100;
			final int COSTO_BJK = 200;
			final int COSTO_PKR = 500;
			final int GANANCIA_MAX = 5000;
			String nombre_juego = "A";
			int costo_juego_elegido = 0;
			int random_num = 0 ;
		
			System.out.println("Ingrese su nombre ");// datos jugador
			nombre_jugador = miTeclado.nextLine();
			System.out.println("la cantidad de dinero inicial con que jugara ");// plata al juego
			guita_inicial = miTeclado.nextInt();
			
			while (guita_inicial < MONTO_MINIMO_GUITA) { // validamos el minimo para jugar
				System.out.println("\n" + "-------ATENCION------------------");
				
				System.out.println("\n" + "Verifique la cantidad ingresada, el minimo es $500");
				System.out.println("Reingrese la cantidad de dinero inicial con que jugara ");
				guita_inicial = miTeclado.nextInt();
				};// validamos el minimo para jugar
				
			
			guita_jugador = guita_inicial;// cargamos saldo en billetera jugador
			
			
			
			
			//do { // entra al juego
			
			System.out.println("Elija el tipo de juego ingresando unicamente su alias entre comillas: ");// limitamos y obligamos las opciones
			System.out.println("Si desea Jugar a la ruleta escriba RUL");
			System.out.println("Si desea Jugar a la Black Jack escriba BJK");
			System.out.println("Si desea Jugar a la Poker escriba PKR");
			nombre_juego = miTeclado.nextLine().toUpperCase();
			
			do {
	            
	            if (!nombre_juego.equals("RUL") && !nombre_juego.equals("BJK") && !nombre_juego.equals("PKR")) {
	                System.out.println("ATENCION ------ ERORR -------ATENCION");
	                System.out.println("Si desea Jugar a la ruleta escriba RUL");
	                System.out.println("Si desea Jugar a la Black Jack escriba BJK");
	                System.out.println("Si desea Jugar a la Poker escriba PKR");
	            }
	        } while (!nombre_juego.equals("RUL") && !nombre_juego.equals("BJK") && !nombre_juego.equals("PKR"));
					
					
					
								do {
									switch (nombre_juego) { // entramos a definir el costo del juego
									case "RUL":
										costo_juego_elegido = COSTO_RUL;
										break;
									case "BJK":
										costo_juego_elegido = COSTO_BJK;
										break;
									case "PKR":
										costo_juego_elegido = COSTO_BJK;
										break;
									default:
										break;
												}     // salimos de definir el costo del juego   
			        	
			        	
							        					if (nombre_juego.equals("RUL")) {
							        						guita_jugador = guita_jugador - costo_juego_elegido;
							        						
							        								random_num = (int) (Math.random() * 2);
							        						
							        								switch (random_num) {
							        									case 2:
							        										guita_jugador = costo_juego_elegido * 2;
							        										break;
							        									case 1:
							        										guita_jugador = costo_juego_elegido * 1;
							        										break;
							        									case 0:
							        										costo_juego_elegido = COSTO_BJK;
							        										break;
							        									default:
							        										break;
							        									}							        													        						
							        						
							        						} 
							        	
							        					if (nombre_juego.equals("BJK")) {
							        						guita_jugador = guita_jugador - costo_juego_elegido;
									        				
							        								random_num = (int) (Math.random() * 2);
							        						
							        								switch (random_num) {
							        									case 2:
							        										guita_jugador = costo_juego_elegido * 2;
							        										break;
							        									case 1:
							        										guita_jugador = costo_juego_elegido * 1;
							        										break;
							        									case 0:
							        										costo_juego_elegido = COSTO_BJK;
							        										break;
							        									default:
							        										break;
							        									}
							        						
						        						} 
							        					
							        					if (nombre_juego.equals("PKR")) {
							        						guita_jugador = guita_jugador - costo_juego_elegido;
							        						
							        								random_num = (int) (Math.random() * 2);
							        						
							        								switch (random_num) {
							        									case 2:
							        										guita_jugador = costo_juego_elegido * 2;
							        										break;
							        									case 1:
							        										guita_jugador = costo_juego_elegido * 1;
							        										break;
							        									case 0:
							        										costo_juego_elegido = COSTO_BJK;
							        										break;
							        									default:
							        										break;
					        									}
							        													        						
						        						} 
							        					
								} while (guita_jugador > COSTO_RUL && guita_jugador > COSTO_BJK && guita_jugador > COSTO_PKR );
			        					
				
			        			
				
//		} while (guita_jugador > guita_min_pa_quedarse || (guita_jugador < COSTO_RUL && guita_jugador < COSTO_BJK && guita_jugador < COSTO_PKR) || guita_jugador > GANANCIA_MAX);	
			// corta el juego	
			
			
				
				
				
/*				condicion 1
				guita_jugador > guita_min_pa_quedarse
				
				condicion 2
				guita_jugador < COSTO_RUL %% guita_jugador < COSTO_BJK %% guita_jugador < COSTO_PKR
				
				condicion 3
				guita_jugador > GANANCIA_MAX
 */			
/*
 * condicion 1 El dinero restante del jugador esté por debajo del 20% del monto inicial
condicion 2 El dinero restante del jugador no sea suficiente para jugar a ningún juego de los disponibles.
condicion 3 El jugador haya acumulado $5000 o más.
 * 
 * 
 * 				
 */
			
	}

}
