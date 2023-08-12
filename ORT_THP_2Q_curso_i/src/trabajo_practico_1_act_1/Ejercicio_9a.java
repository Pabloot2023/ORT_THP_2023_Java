package trabajo_practico_1_act_1;

/*Enunciado
 * Realizá un programa que permita resolver el siguiente problema: 
 * Tres personas aportan diferente capital a una sociedad y desean saber el valor total aportado
 *  y qué porcentaje aportó cada una (indicando nombre y porcentaje). 
 *  Solicitar la carga por teclado del nombre de cada socio, su capital aportado 
 *  y a partir de esto calcular e informar lo requerido previamente.
 */


import java.util.Scanner;

public class Ejercicio_9a {

	public static void main(String[] args) {
		
		Scanner miTeclado1 = new Scanner(System.in);
		Scanner miTeclado2 = new Scanner(System.in);
		Scanner miTeclado3 = new Scanner(System.in);
		
		String user1 = "x";
		int user11 = 0;
		String user2 = "y";
		int user22 = 0;
		String user3 = "z";
		int user33 = 0;
		
		int totalFondo = user11+user22+user33;
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		
		 System.out.println("\n" + "Estimado primer Socio, por favor ingrese su nombre");
		 user1 =miTeclado1.nextLine();
		 System.out.println("Indique su capital aportado");
		 user11 =miTeclado1.nextInt();
		 
		 
		 System.out.println("\n" + "Estimado segundo Socio, por favor ingrese su nombre");
		 user2 =miTeclado2.nextLine();
		 System.out.println("Indique su capital aportado");
		 user22 =miTeclado2.nextInt();
		 
		
		 System.out.println("\n" + "Estimado tercer Socio, por favor ingrese su nombre");
		 user3 =miTeclado3.nextLine();
		 System.out.println("Indique su capital aportado");
		 user33 =miTeclado3.nextInt();
		 
		 totalFondo = user11+user22+user33;
		 p1 = (user11*totalFondo)/100;
		 p2 = (user22*totalFondo)/100;
		 p3 = (user33*totalFondo)/100;
		
		 
		 System.out.println("---------------------------------------------------------");
		 System.out.println("------------DETALLES CONTABLES DE LA SOCIEDAD------------");
		 System.out.println("---------------------------------------------------------" + "\n");
		 
//		 System.out.println("El monto total en pesos del fondo de la sociedad es: " + totalFondo);
		 System.out.println( user1 + " aporto: " + user11 + " pesos representando el " + p1 + "% del Total de la Sociedad" + "\n");
		 System.out.println( user2 + " aporto: " + user22 + " pesos representando el " + p2 + "% del Total de la Sociedad" + "\n");
		 System.out.println( user3 + " aporto: " + user33 + " pesos representando el " + p3 + "% del Total de la Sociedad" + "\n");
		 
		  miTeclado1.close();
		  miTeclado2.close();
		  miTeclado3.close();
	}

}
