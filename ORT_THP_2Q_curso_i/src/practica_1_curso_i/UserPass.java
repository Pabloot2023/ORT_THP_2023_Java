package practica_1_curso_i;

import java.util.Scanner;

public class UserPass {

	public static void main(String[] args) {
		
		Scanner miTeclado = new Scanner(System.in);
		
		final String USUARIO_VALIDO = "PEPE";
		final String CONTRASENIA_VALIDA = "12342023";
		
		String usuarioIngresado;
		String claveIngresada;
		
		System.out.println("Ingrese su Usuario");
		usuarioIngresado = miTeclado.nextLine();
		
		System.out.println("Ingrese su Contrasenia");
		claveIngresada = miTeclado.nextLine();
		
		if (usuarioIngresado.equalsIgnoreCase(USUARIO_VALIDO) && claveIngresada.equals(CONTRASENIA_VALIDA)) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("Datos incorrecto, no puede acceder!!!");
		}
				

	}

}
