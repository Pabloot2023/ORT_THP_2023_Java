package ej_parcial_1_3;

import java.util.Scanner;

public class SANDBOX {

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);

        int num = -10; // se inicia en negativo para siempre ser distinto de 0 al iniciar el programa y entrar al bucle
        int contadorMesetaActual = 1; // inicia en uno para emular bandera comparadora en el bloque verificador y contabilizador de mesetas
        int contadorMesetas = 0;
        int maxMeseta = 0;
        int numeroAnterior = -1; // Inicializamos numeroAnterior en un valor que no estará en el rango [0-100]
        boolean hayMesetas = false; // Variable para verificar si se han encontrado mesetas
        final String ESPACIO = " ";
// mensaje bienvenida unico
    	System.out.println("-------> BIENVENIDO <-------- ");
		System.out.println("Iniciando el Sistema Contador de Mesetas..." );
		System.out.println(ESPACIO);
// mensaje bienvenida unico		
		
// inicio ciclo mayor		
        while (num != 0) {     
        	
        			//inicio pedir y validar numero en rango
					System.out.println("Ingrese un numero en el rango [0-100] (0 para finalizar): ");
					num = miTeclado.nextInt();
				    while (num < 0 || num > 100) {
				    	System.out.println("ERROR! VERIFIQUE EL DATO INGRESADO! ");
				        System.out.println("El numero ingresado debe ser igual o mayor a cero (0)");
				        System.out.println("El numero ingresado debe ser igual o menora cien (100)");
				        System.out.println("Ingrese los numeros que desea verificar");
				        num = miTeclado.nextInt();
				    };
				    //fin pedir y validar numero en rango
		    
				    
				    
				    //inicio bloque verificador y contabilizador de mesetas
                if (num == numeroAnterior) {
                    contadorMesetaActual++;
                } else {
                	
                	
                    if (contadorMesetaActual > 1) { 
                        		contadorMesetas++;
                        		
                        			// inicio bloque asignador largo de la meseta
			                        if (contadorMesetaActual > maxMeseta) {
			                        	maxMeseta = contadorMesetaActual;
			                        }
			                        // fin bloque asignador largo de la meseta
			                        
			                        hayMesetas = true; // asignador si encontró al menos una meseta
                    }
                    contadorMesetaActual = 1; // Iniciar una nueva meseta
                }
                numeroAnterior = num;
              //fin bloque verificador y contabilizador de mesetas
           
        };        
// fin ciclo mayor      

            
// inicio impresion condicional de resultados   
        if (hayMesetas) {
        	System.out.println(ESPACIO);
            System.out.println("Total de mesetas detectadas: " + contadorMesetas);
            System.out.println(ESPACIO);
            System.out.println("La meseta mas larga tuvo " + maxMeseta + " numeros.");
        } else {
        	System.out.println(ESPACIO);
            System.out.println("No se detectaron mesetas en los numeros ingresados.");
        }
// fin impresion condicional de resultados  
        
        miTeclado.close();
    }
}
