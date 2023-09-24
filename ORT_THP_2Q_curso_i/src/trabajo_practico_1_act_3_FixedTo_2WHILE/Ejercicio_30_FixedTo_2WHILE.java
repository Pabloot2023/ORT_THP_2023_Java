/*Enunciado
Realizá un programa que permita realizar varias operaciones matemáticas 
ingresando un caracter por cada una la operación a realizar 
(‘+’,‘-’,’”’,‘/’,‘F’) y dos números enteros en el caso que no haya elegido ‘F’
 La computadora debe mostrar el resultado para la operación ingresada. 
 Considerar que no se puede dividir por cero. 
 Cuando la operación ingresada sea ‘F’ 
 nos indicará que no se desean calcular más operaciones. [EC]
*/
 
 
package trabajo_practico_1_act_3_FixedTo_2WHILE;
 
import java.util.Scanner;
 
public class Ejercicio_30_FixedTo_2WHILE {
 
	public static void main(String[] args) {
		 Scanner miTeclado = new Scanner(System.in);
 
 
		 int num1;
		 int num2;
		 int resultado;
	     String operacion;
	     boolean flag = true;
 
	     do {
	    	 	System.out.print("\n" + "Ingrese la operacion a realizar (+, -, *, /, F): ");
	    	 	operacion = miTeclado.nextLine();
			
			 		
	     } while (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/") && !operacion.equals("F") && !operacion.equals("f") );
 
	     if (operacion == "F" || operacion == "f") {
	 			flag = false;
	 		} else {
	 			flag = true;
	 		}
	     
	    			while (flag == true )  {
 
 
	    				System.out.print("Ingrese el primer numero: ");
	    				num1 = miTeclado.nextInt();
 
	    				System.out.print("Ingrese el segundo numero: ");
	    				num2 = miTeclado.nextInt();
 
	    					switch (operacion) {
	    						case "+":
	    							resultado = num1 + num2;
	    							System.out.println("-----------------------------------------");
	    							System.out.println("\n" + "El resultado de la suma es: " + resultado + "\n");
	    							System.out.println("-----------------------------------------");
	    							break;
	    						case "-":
	    							resultado = num1 - num2;
	    							System.out.println("-----------------------------------------");
	    							System.out.println("\n" + "El resultado de la resta es: " + resultado + "\n");
	    							System.out.println("-----------------------------------------");
	    							break;
	    						case "*":
	    							resultado = num1 * num2;
	    							System.out.println("-----------------------------------------");
	    							System.out.println("\n" + "El resultado de la multiplicacion es: " + resultado + "\n");
	    							System.out.println("-----------------------------------------");
	    							break;
	    						case "/":
	    							if (num2 == 0) {
	    								System.out.println("-----------------------------------------");
	    								System.out.println("\n" + "ERROR: No se puede dividir por cero." + "\n");
	    								System.out.println("-----------------------------------------");
	    							} else {
	    								resultado = num1 / num2;
	    								System.out.println("-----------------------------------------");
	    								System.out.println("\n" + "El resultado de la division es: " + resultado + "\n");
	    								System.out.println("-----------------------------------------");
	    							}
	    							break;
	    						default:
	    							System.out.println("ERROR: Operacion invalida.");
	    							break;
	    						}  
	    					System.out.println("\n" + "si desea finalizar la caluculadora presione F");
	    	    	        System.out.println("si desea continuar usando la calculadora presiona cualquier otra tecla");
	    	    	        operacion = miTeclado.nextLine();
 
	    	    	        if (operacion == "F" || operacion == "f") {
	    	    	        	flag = false;
	    	    	        } else {
	    	    	        	flag = true;
	    	    	        }
 
	}
 
	    			System.out.println("CALCULADORA FINALIZADA");
	    			miTeclado.close();
	    			}
	    }	
 