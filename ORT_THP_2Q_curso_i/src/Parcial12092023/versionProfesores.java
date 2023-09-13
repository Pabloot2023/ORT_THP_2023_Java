package Parcial12092023;

import java.util.Scanner;

public class versionProfesores {

	public static void main(String[] args) {
		Scanner miTeclado = new Scanner(System.in);
		
		final int PISO = 1;
		int numero1;
		int numero2;
		int mcd;
		int resto;
		int aux;
		
		do {
			 System.out.println("Ingresa un numero entero mayor o igual que " + PISO + ":");
			 numero1 = miTeclado.nextInt();			
		} while (numero1 < PISO);
		
		do {
			 System.out.println("Ingresa otro numero entero mayor o igual que " + PISO + " y menor a " + numero1 + ":");
			 numero2 = miTeclado.nextInt();			
		} while (numero2 < PISO || numero2 >= numero1);
		
		mcd = numero1;
		resto = numero2;
		
		while (resto != 0) {
			aux = resto;
			resto = mcd % resto;
			mcd = aux;			
		}
		
		System.out.println("El MCD entre " + numero1 + " y " + numero2 + " es " + mcd);
		
		
		

	}

}
