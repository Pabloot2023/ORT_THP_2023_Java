/*Enunciado
    Existen dos reglas que identifican dos conjuntos de valores:
    El número es de un solo dígito
    El número es impar.
    A partir de estas reglas, realizá un programa que permita 
    ingresar un número entero. Debe asignar el valor que corresponda a las variables 
    booleanas esDeUnSoloDigito, eslmpar, estaEnAmbosGrupos y noEstaEnNingunGrupo
    el valor Verdadero o Falso, según corresponda,
    para indicar si el valor número ingresado pertenece o no a cada conjunto.
    AI terminar el programa debe informar el número cargado y las cuatros variables lógicas.
    Definí un lote de prueba de varios números y probá el algoritmo,
    escribiendo los resultados tal como se hizo en los ejercicios anteriores.
*/


package trabajo_practico_1_act_2_FixedTo_4UML;

import java.util.Scanner;

public class Ejercicio_19_FixedTo_UML {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		int num;
        boolean esDeUnSoloDigito;
        boolean esImpar;
        boolean estaEnAmbosGrupos;
        boolean noEstaEnNingunGrupo;

        System.out.print("Ingrese un numero entero: ");
        num = miTeclado.nextInt();

        esDeUnSoloDigito = (num >= 0 && num <= 9);
        esImpar = (num % 2 != 0);
        estaEnAmbosGrupos = (esDeUnSoloDigito && esImpar);
        noEstaEnNingunGrupo = (!esDeUnSoloDigito && !esImpar);
        
        if (esDeUnSoloDigito) {
        		System.out.println("\n" + "Es de un solo digito: " + "Verdadero");	
        } else {
    			System.out.println("\n" + "Es de un solo digito: " + "Falso");	
        }
        
        if (esImpar) {
    			System.out.println("\n" + "Es impar: " + "Verdadero" );	
        } else {
        		System.out.println("\n" + "Es impar: " + "Falso" );	
        }
        
        if (estaEnAmbosGrupos) {
        		System.out.println("\n" + "Esta en ambos grupos: " + "Verdadero" );	
        } else {
        		System.out.println("\n" + "Esta en ambos grupos: " + "Falso" );		
        }
        
        if (noEstaEnNingunGrupo) {
				System.out.println("\n" + "No esta en ningun grupo: " + "Verdadero" );	
        } else {
        		System.out.println("\n" + "No esta en ningun grupo: " + "Falso" );	
        }

        
        miTeclado.close();
		

	}

}
