package trabajo_practico_3_Ej_3;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;

		public static void main(String[] args) {
			
		    Inmobiliaria inmobiliaria = new Inmobiliaria();
		
		    intro();
		    casoDePrueba1();// Agregar barrios
		    outro();
		    
		    intro();
		    casoDePrueba2();// Agregar propiedades a los barrios
		    outro();
		
		    intro();
		    casoDePrueba3();// Cambiar propiedad de barrio
		
		    intro();
		    casoDePrueba4();// Borrar propiedad y Mostrar propiedades
		    outro();
		    
		    intro();
		    casoDePrueba5();// Mostrar barrios con la mayor cantidad de propiedades
		    outro();
		    
			}

	public static void casoDePrueba1() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

		    // Agregar barrios
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.obtenerBarrio("Barrio2");
		
	    outro();
		}
		
	public static void casoDePrueba2() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.obtenerBarrio("Barrio2");
		    
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 1", 100000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 2", 90000, "Departamento"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 3", 120000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 4", 80000, "PH"));
		    inmobiliaria.obtenerBarrio("Barrio3").agregarPropiedad(new Propiedad("Calle 5", 150000, "Departamento"));
		    
		    inmobiliaria.mostrarPropiedades();
		
	    outro();
		}
		
	public static void casoDePrueba3() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.obtenerBarrio("Barrio2");
		    
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 1", 100000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 2", 90000, "Departamento"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 3", 120000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 4", 80000, "PH"));
		    inmobiliaria.obtenerBarrio("Barrio3").agregarPropiedad(new Propiedad("Calle 5", 150000, "Departamento"));
		    
		    inmobiliaria.mostrarPropiedades();
		    
		    inmobiliaria.cambiarPropiedadDeBarrio("Calle 2", "Barrio2");
		    
		    inmobiliaria.mostrarPropiedades();
		
	    outro();
		}
		
	public static void casoDePrueba4() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.obtenerBarrio("Barrio2");
		    
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 1", 100000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 2", 90000, "Departamento"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 3", 120000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 4", 80000, "PH"));
		    inmobiliaria.obtenerBarrio("Barrio3").agregarPropiedad(new Propiedad("Calle 5", 150000, "Departamento"));
		    
		    inmobiliaria.mostrarPropiedades();
		    
		    inmobiliaria.cambiarPropiedadDeBarrio("Calle 2", "Barrio2");
		    
		    inmobiliaria.mostrarPropiedades();
		    
		    inmobiliaria.borrarPropiedad("Calle 2");
		    
		    inmobiliaria.mostrarPropiedades();

		
	    outro();
		}
	
	public static void casoDePrueba5() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 1", 100000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio1").agregarPropiedad(new Propiedad("Calle 2", 90000, "Departamento"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 3", 120000, "Casa"));
		    inmobiliaria.obtenerBarrio("Barrio2").agregarPropiedad(new Propiedad("Calle 4", 80000, "PH"));
		    inmobiliaria.obtenerBarrio("Barrio3").agregarPropiedad(new Propiedad("Calle 5", 150000, "Departamento"));
		    
		    inmobiliaria.mostrarBarrioMaxProp();
		
	    outro();
		}
	
	public static void intro() {
	separador1();
    barraSeparadora();
	}
	
	public static void outro() {
	barraSeparadora();
	separador1();
	}
	
	public static void separador1() {
	separador1 = " ";
    System.out.println(separador1);
	}
	
	public static void separador2() {
	separador2 = " ";
	System.out.println(separador2);
	System.out.println(separador2);
	}

	public static void barraSeparadora() {
	barraSeparadora = "-------------------------------------";
	System.out.println(barraSeparadora);

	}

}
