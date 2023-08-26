/*Enunciado
	25.	Realizó un programa que permita ingresar dos números enteros que 
	representen el ancho y el alto de una matriz de cruces. 
	El programa debe dibujar dicha matriz.
*/

package trabajo_practico_1_act_3;

import java.util.Scanner;

public class Ejercicio_25 {

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        int i,j,ancho,alto;
        

        System.out.print("Ingrese el ancho de la matriz de cruces: ");
         ancho = miTeclado.nextInt();

        System.out.print("Ingrese el alto de la matriz de cruces: ");
         alto = miTeclado.nextInt();
        
        
        for ( i = 0; i < alto; i++) {

            for ( j = 0; j < ancho; j++) {
            	
                if (j == ancho / 2 && i == alto / 2) {
                    System.out.print("+ ");
                } else if (j == 0 || j == ancho - 1 || i == 0 || i == alto - 1 ) {
                    System.out.print(". ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        miTeclado.close();
    }
}