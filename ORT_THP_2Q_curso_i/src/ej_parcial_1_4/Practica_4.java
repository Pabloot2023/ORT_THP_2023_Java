package ej_parcial_1_4;

import java.util.Scanner;

public class Practica_4 {

	public static void main(String[] args) {
		        Scanner miTeclado = new Scanner(System.in);
		        
		  
		        int cantidadPedidos = 0;
		        int cantidadChico = 0;
		        int cantidadMediano = 0;
		        int cantidadGrande = 0;
		        double totalImporte = 0;
		        double maxImporte = 0;
		        String compradorMaxImporte = null;
		        int pedidosTipoC = 0;
		        int pedidosTotal = 0;
		        String tamano;
		        int cantidadGustos;
		        final double COMISION_HELADERO = 50; 
		        String nombreComprador;
		        String gustoMenosCalorico = null;
		        int caloriasMenosCalorico = 1000000000;
		        String nombreGusto;
		        int calorias;
		        double promedioImporte;
		        double porcentajeTipoC;
		        double importePedido;
		        int i;
		        
		        
		        
		        
		        System.out.println("Ingrese el tamano del pedido (C/M/G) o 'Z' para finalizar:");
		        tamano = miTeclado.nextLine().toUpperCase();
		        while (!tamano.equals("C") && !tamano.equals("M") && !tamano.equals("G") && !tamano.equals("Z")) {
		            System.out.println("Tamano no valido. Intente nuevamente.");
		            System.out.println("Ingrese el tamaño del pedido (C/M/G) o 'Z' para finalizar:");
		            tamano = miTeclado.nextLine().toUpperCase();
		        }

		        	        
		        
		        // Bucle principal para registrar ventas
		        while (cantidadGrande < 20 && !tamano.equals("Z")) {
		        	cantidadPedidos++;
		            pedidosTotal++;
		             
		                switch (tamano) {
		                    case "C":
		                    	cantidadChico++;
		                        break;
		                    case "M":
		                    	cantidadMediano++;
		                        break;
		                    case "G":
		                    	cantidadGrande++;
		                        break;
		                 
		                }
			        
		            
		             System.out.println("Ingrese la cantidad de gustos (>0 y <=4):");
			         cantidadGustos = miTeclado.nextInt();
			         while (cantidadGustos <= 0 || cantidadGustos > 4) {
			        	 System.out.println("Cantidad de gustos no valida. Intente nuevamente.");
			        	 System.out.println("Ingrese la cantidad de gustos (>0 y <=4):");
				         cantidadGustos = miTeclado.nextInt();
			         }
			         
			         
			         // tomar  el carácter para limpiar error de impresion
			         miTeclado.nextLine();
			         
			         System.out.println("Ingrese el importe a cobrar:");
			         importePedido = miTeclado.nextDouble();
			         
			         // tomar  el carácter para limpiar error de impresion
			         miTeclado.nextLine();
			         
			         System.out.println("Ingrese el nombre del comprador");
			         nombreComprador = miTeclado.nextLine().toUpperCase();
			        
			       
		             
		            
		             if (importePedido > maxImporte) {
			                maxImporte = importePedido;
			                compradorMaxImporte = nombreComprador;
			            }
		             
		             caloriasMenosCalorico = 1000000000;
		             for (i = 1; i <= cantidadGustos; i++) {
			                System.out.println("Ingrese el nombre del gusto:");
			                nombreGusto = miTeclado.next();
			                
			                System.out.println("Ingrese la cantidad de calorias:");
			                calorias = miTeclado.nextInt();
			                
			                
							if (calorias < caloriasMenosCalorico) {
			                    caloriasMenosCalorico = calorias;
			                    gustoMenosCalorico = nombreGusto;
			                }
			            }
			         
		             importePedido += COMISION_HELADERO;
			            
			            if (importePedido > maxImporte) {
			                maxImporte = importePedido;
			                compradorMaxImporte = nombreComprador;
			            }

			           
			            
			            tamano = ""; // Limpiar variable
				        miTeclado.nextLine(); // tomar  el carácter para limpiar error de impresion
				         
			            System.out.println("Ingrese el tamano del pedido (C/M/G) o 'Z' para finalizar:");
				        tamano = miTeclado.nextLine().toUpperCase();
				        while (!tamano.equals("C") && !tamano.equals("M") && !tamano.equals("G") && !tamano.equals("Z")) {
				            System.out.println("Tamaño no valido. Intente nuevamente.");
				            System.out.println("Ingrese el tamaño del pedido (C/M/G) o 'Z' para finalizar:");
				            tamano = miTeclado.nextLine().toUpperCase();
				        }
		            
		            
		            
		            
		        }
		        
	        
	            
		        // promedio de importes
		        promedioImporte = (double) totalImporte / cantidadPedidos;
		        
		        //  porcentaje de pedidosC
		        porcentajeTipoC = (double) pedidosTipoC / pedidosTotal * 100;
		        
		        // Imprimir resultados
		        System.out.println("--------------------------------------");
		        System.out.println("Resumen de Ventas Diarias:");
		        System.out.println("--------------------------------------");
		        System.out.println("Cantidad de pedidos por tamano:");
		        System.out.println("Chico (C): " + cantidadChico);
		        System.out.println("Mediano (M): " + cantidadMediano);
		        System.out.println("Grande (G): " + cantidadGrande);
		        System.out.println("--------------------------------------");
		        System.out.println("Promedio importe entre todas las compras: $" + promedioImporte);
		        System.out.println("Pedido mas caro realizado por: " + compradorMaxImporte);
		        System.out.println("Porcentaje de pedidos de tipo 'C' con respecto al total: " + porcentajeTipoC + "%");
		        
		        miTeclado.close();
		    }
		
	}


