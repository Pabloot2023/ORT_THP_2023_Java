package trabajo_practico_2_act_1;

import java.util.Scanner;

public class PruebaAlumno {
	
	static Scanner miTeclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombreIngresado;
		String dniIngresado;
		String emailIngresado;
		int notaPrimerParcial;
		int notaSegundoParcial;

		
		System.out.println("Ingrese el nombre");
		nombreIngresado =  miTeclado.nextLine();
		
		System.out.println("Ingrese el DNI");
		dniIngresado =  miTeclado.nextLine();
		
		System.out.println("Ingrese el email");
		emailIngresado =  miTeclado.nextLine();
		
		// ahora creamos un objeto alumno
		System.out.println("creando objeto..");
		Alumno alumno1 = new Alumno();
		
		
		//mandamos el mensaje mediante el seter	
		System.out.println("guardando datos..");
		alumno1.setNombre(nombreIngresado);
		
		alumno1.setDni(dniIngresado);
		
		alumno1.setEmail(emailIngresado);
		
		alumno1.setNotaPrimerParcial(8);
		alumno1.setNotaSegundoParcial(4);
		
		System.out.println("mostramos los datos del alumno 1");
		//mostramos los atributos por medios de los geters
		System.out.println("Nombre " + alumno1.getNombre());
		System.out.println("DNI " + alumno1.getDni());
		System.out.println("email " + alumno1.getEmail());
		
		System.out.println("el promedio es " + alumno1.calcularPromedio());
		
		// ahora creamos un objeto alumno usando el constructor parametrizad
		System.out.println("creando objeto parametrizado..");
		Alumno alumno2 = new Alumno("pepe","012346823720","pepe@ort.edu.ar");
		
		System.out.println("mostramos los datos del alumno 2");
		//mostramos los atributos por medios de los geters
		System.out.println("Nombre " + alumno2.getNombre());
		System.out.println("DNI " + alumno2.getDni());
		System.out.println("email " + alumno2.getEmail());
		
		alumno2.setNotaPrimerParcial(10);
		alumno2.setNotaSegundoParcial(9);
		
		System.out.println("el promedio del segundo alumno es " + alumno2.calcularPromedio());
		
		System.out.println(alumno1.toString());
		
		System.out.println(alumno2.toString());
	
	
	
	}

}
