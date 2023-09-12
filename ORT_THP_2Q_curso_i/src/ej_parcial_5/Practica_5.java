package ej_parcial_5;

import java.util.Scanner;

public class Practica_5 {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		int user = 11111111;
		int pass = 1234; 
		int userINPUT = 0;
		int passINPUT = 0;
		int intentos = 0; 
		String corte = "a";
		double saldo = 5000;
		double retirar_monto;
		double billetera_monto = saldo;
		double depositar_monto;
		final double PRESTAMO1 = 100000.00;
		final double PRESTAMO2 = 500000.00;
		final double PRESTAMO3 = 1000000.00;
		int prestamo_monto;
		String transferencia_alias;
		int transferencia_monto = 0;
		String eleccion;
		String bloqueo = "a";		
		boolean comboCorrecto = false;
		
		// INICIO pedir combo user:pass
		System.out.println("*** Bienvenido/a al Cajero Bancario de ORT Banking *** ");
			while (!comboCorrecto) {
		    System.out.println("Ingrese el usuario");
		    userINPUT = miTeclado.nextInt();
		    System.out.println("Ingrese la contrasena");
		    passINPUT = miTeclado.nextInt();
		    miTeclado.nextLine();

					    if (user == userINPUT && pass == passINPUT) {
					        comboCorrecto = true;
					    } else {
					        intentos++;
					        System.out.println("ERROR! VERIFIQUE LOS DATOS INGRESADOS");
							        if (intentos >= 5) {
							            bloqueo = "F";
							        }
					    }
			}
		// FIN pedir combo user:pass


			        
			        
		// INICIO ciclo mayor
		while (user == userINPUT && pass == passINPUT && !bloqueo.equals("F") && !corte.equals("F")) {
			System.out.println("Ingrese Opcion");
			System.out.println("a) Retirar dinero");
			System.out.println("b) Depositar dinero");
			System.out.println("c) Consultar saldo actual");
			System.out.println("d) Pedir prestamo");
			System.out.println("e) Transferencia de dinero");
			System.out.println("f) Salir");
			eleccion = miTeclado.nextLine().toUpperCase();
			
					switch (eleccion) {
		            case "A":
		            	// INICIO Retirar dinero
		            	System.out.println("Ingrese un  monto positivo que desea retirar");
		            	retirar_monto = miTeclado.nextDouble();
		            	miTeclado.nextLine(); 
		            	while (retirar_monto < 0 || retirar_monto > billetera_monto) {      
		            	    if (retirar_monto < 0) {
		            	        System.out.println("Ingrese un monto positivo");
		            	    } else {
		            	        System.out.println("La cuenta no posee saldo suficiente para retirar dicho monto");
		            	    }
		            	    System.out.println("Ingrese el monto que desea retirar");
		            	    retirar_monto = miTeclado.nextDouble();
		            	    miTeclado.nextLine(); 
		            	}

		            	billetera_monto -= retirar_monto;
		            	System.out.println("Operacion realizada. El saldo actual disponible es: " + billetera_monto);
		            	// FIN Retirar dinero

		                break;
		            case "B":
		            	// INICIO Depositar dinero
		            	System.out.println("Ingrese el monto positivo que desea depositar");
		            	depositar_monto = miTeclado.nextDouble();
		            	miTeclado.nextLine();

		            	while (depositar_monto < 0) {
		            	    System.out.println("Ingrese un monto positivo");
		            	    System.out.println("Ingrese el monto que desea depositar");
		            	    depositar_monto = miTeclado.nextDouble();
		            	    miTeclado.nextLine(); 
		            	}

		            	
		            	if (depositar_monto >= 0) {
		            	    billetera_monto += depositar_monto;
		            	    System.out.println("Operacin realizada. El saldo actual disponible es: " + billetera_monto);
		            	}
		            	// FIN Depositar dinero

		                break;
		            case "C":
		            	// INICIO Consultar saldo actual
						System.out.println("El saldo actual disponible es: $" + billetera_monto);											        
						// FIN Consultar saldo actual	
		                break;
		            case "D":
		            	// INICIO Pedir préstamo
						if (billetera_monto >= 0) {
						System.out.println("Ingrese un monto para solicitar un prestamo, puede ser: $100000, $500000 o $1000000");
						prestamo_monto = miTeclado.nextInt();
						miTeclado.nextLine();
								while (prestamo_monto != PRESTAMO1 && prestamo_monto != PRESTAMO2 && prestamo_monto != PRESTAMO3) {
								System.out.println("Ingrese un monto para solicitar un prestamo, puede ser: $100000, $500000 o $1000000");
								prestamo_monto = miTeclado.nextInt();
								miTeclado.nextLine();
								}
						System.out.println("Estimado " + user + "se ha solicitado su prestamo de $" + prestamo_monto + " correctamente");
						} else {
						System.out.println("Estimado " + user + "usted no esta habilitado a solicitar un préstamo");
						};																							
						// FIN Pedir préstamo
		                break;
		            case "E":
		            	// INICIO Transferencia de dinero        	
//		            	if (transferencia_monto < billetera_monto) {
//		            		System.out.println("Estimado " + user + " usted no dispone de este monto para realizar la transferencia");
//					} else 
		            		
		            	 if (billetera_monto >= 10000) {
		            	    System.out.println("Ingrese un alias");
		            	    transferencia_alias = miTeclado.nextLine();

		            	    while (transferencia_alias == null || transferencia_alias.trim().isEmpty()) {
		            	        System.out.println("Ingrese un alias");
		            	        transferencia_alias = miTeclado.nextLine();
		            	    } 

		            	    System.out.println("Ingrese un monto positivo");
		            	    transferencia_monto = miTeclado.nextInt();
		            	    miTeclado.nextLine(); 

		            	    if (transferencia_monto <= billetera_monto) {
		            	        billetera_monto -= transferencia_monto;
		            	        System.out.println("Operacion realizada. El saldo actual disponible es: " + billetera_monto);
		            	    } else {
		            	    	System.out.println("Estimado " + user + " usted no dispone de este monto para realizar la transferencia");
		            	    }
		            	}else {
	            	    	System.out.println("Estimado " + user + " usted no dispone de este monto para realizar la transferencia");
	            	    }
		            	// FIN Transferencia de dinero

		                break;
		            case "F":
		            	corte = "F";	
		                break;    
		            default:
		                System.out.print("ERROR!! ingrese una opcion valida!!!");
		                break;
		        }
			
		
		}	        			        
	    // FIN ciclo mayor
		
		
		 // INICIO caso bloqueo de cuenta 
		if (bloqueo.equals("F")) {
			System.out.println("Se le ha bloqueado el ingreso al cajero. Contacte a un asesor en linea");
		};			        
		// FIN caso bloqueo de cuenta
		
		 miTeclado.close();
	}

}
