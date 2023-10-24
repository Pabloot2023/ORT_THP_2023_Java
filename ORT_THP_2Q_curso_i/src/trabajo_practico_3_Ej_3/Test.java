package trabajo_practico_3_Ej_3;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;

		public static void main(String[] args) {
			
		    Inmobiliaria inmobiliaria = new Inmobiliaria();
				 
		    //casoDePrueba1();// 	 OK --->  Agregar barrios

		    //casoDePrueba2();// OK ---> Agregar propiedades a los barrios

		    casoDePrueba3();// Cambiar propiedad de barrio

		    //casoDePrueba4();// Borrar propiedad y Mostrar propiedades

		    //casoDePrueba5();// Mostrar barrios con la mayor cantidad de propiedades

			}

		public static void casoDePrueba1() {
		    Barrio barrioBuscado; 
		    intro();

		    Inmobiliaria inmobiliaria = new Inmobiliaria();

		    System.out.println("Creando..Barrio1..Barrio2..Barrio3..");
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    separador1();
		 
		    System.out.println("Probemos buscar  Barrio2");
		    barrioBuscado = inmobiliaria.buscarBarrio("Barrio2");
		    
		    separador1();            
		    
		    System.out.println("Probemos buscar  Barrio5");
		    barrioBuscado = inmobiliaria.buscarBarrio("Barrio5");
		  
		    outro();
		}

		public static void casoDePrueba2() {
			
	    intro();

	    Inmobiliaria inmobiliaria = new Inmobiliaria();

	    inmobiliaria.agregarBarrio("Barrio1");
	    inmobiliaria.agregarBarrio("Barrio2");
	    inmobiliaria.agregarBarrio("Barrio3");

	    // Crear
	    Propiedad propiedad1 = new Propiedad(tipoPropiedad.CASA, "Calle1", 100000);
	    Propiedad propiedad2 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 2", 90000);
	    Propiedad propiedad3 = new Propiedad(tipoPropiedad.CASA, "Calle 3", 120000);
	    Propiedad propiedad4 = new Propiedad(tipoPropiedad.PH, "Calle 4", 80000);
	    Propiedad propiedad5 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 5", 150000);
	    // Agregar 
	    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad1.obtenerTipo(), propiedad1.obtenerDomicilio(), propiedad1.obtenerPrecio());
	    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad2.obtenerTipo(), propiedad2.obtenerDomicilio(), propiedad2.obtenerPrecio());
	    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad3.obtenerTipo(), propiedad3.obtenerDomicilio(), propiedad3.obtenerPrecio());
	    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad4.obtenerTipo(), propiedad4.obtenerDomicilio(), propiedad4.obtenerPrecio());
	    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(propiedad5.obtenerTipo(), propiedad5.obtenerDomicilio(), propiedad5.obtenerPrecio());

	    inmobiliaria.mostrarPropiedades();

	    outro();
	}
		
		public static void casoDePrueba3() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

				 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.buscarBarrio("Barrio2");

			 barraSeparadora();
			 
		    // Crear
		    Propiedad propiedad1 = new Propiedad(tipoPropiedad.CASA, "Calle1", 100000);
		    Propiedad propiedad2 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 2", 90000);
		    Propiedad propiedad3 = new Propiedad(tipoPropiedad.CASA, "Calle 3", 120000);
		    Propiedad propiedad4 = new Propiedad(tipoPropiedad.PH, "Calle 4", 80000);
		    Propiedad propiedad5 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 5", 150000);
		    // Agregar 
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad1.obtenerTipo(), propiedad1.obtenerDomicilio(), propiedad1.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad2.obtenerTipo(), propiedad2.obtenerDomicilio(), propiedad2.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad3.obtenerTipo(), propiedad3.obtenerDomicilio(), propiedad3.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad4.obtenerTipo(), propiedad4.obtenerDomicilio(), propiedad4.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(propiedad5.obtenerTipo(), propiedad5.obtenerDomicilio(), propiedad5.obtenerPrecio());

			 barraSeparadora();
			 
		    inmobiliaria.mostrarPropiedades();

			 barraSeparadora();
			 
		    inmobiliaria.cambiarPropiedadDeBarrio("Calle 2", "Barrio2");
		    
			 barraSeparadora();
			 		    
		    inmobiliaria.mostrarPropiedades();

					 
		
	    outro();
		}
		
		
		public static void casoDePrueba4() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.buscarBarrio("Barrio2");
		    
		    // Crear
		    Propiedad propiedad1 = new Propiedad(tipoPropiedad.CASA, "Calle1", 100000);
		    Propiedad propiedad2 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 2", 90000);
		    Propiedad propiedad3 = new Propiedad(tipoPropiedad.CASA, "Calle 3", 120000);
		    Propiedad propiedad4 = new Propiedad(tipoPropiedad.PH, "Calle 4", 80000);
		    Propiedad propiedad5 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 5", 150000);
		    // Agregar 
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad1.obtenerTipo(), propiedad1.obtenerDomicilio(), propiedad1.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad2.obtenerTipo(), propiedad2.obtenerDomicilio(), propiedad2.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad3.obtenerTipo(), propiedad3.obtenerDomicilio(), propiedad3.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad4.obtenerTipo(), propiedad4.obtenerDomicilio(), propiedad4.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(propiedad5.obtenerTipo(), propiedad5.obtenerDomicilio(), propiedad5.obtenerPrecio());

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
		    
		    // Crear
		    Propiedad propiedad1 = new Propiedad(tipoPropiedad.CASA, "Calle1", 100000);
		    Propiedad propiedad2 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 2", 90000);
		    Propiedad propiedad3 = new Propiedad(tipoPropiedad.CASA, "Calle 3", 120000);
		    Propiedad propiedad4 = new Propiedad(tipoPropiedad.PH, "Calle 4", 80000);
		    Propiedad propiedad5 = new Propiedad(tipoPropiedad.DEPARTAMENTO, "Calle 5", 150000);
		    // Agregar 
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad1.obtenerTipo(), propiedad1.obtenerDomicilio(), propiedad1.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(propiedad2.obtenerTipo(), propiedad2.obtenerDomicilio(), propiedad2.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad3.obtenerTipo(), propiedad3.obtenerDomicilio(), propiedad3.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(propiedad4.obtenerTipo(), propiedad4.obtenerDomicilio(), propiedad4.obtenerPrecio());
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(propiedad5.obtenerTipo(), propiedad5.obtenerDomicilio(), propiedad5.obtenerPrecio());

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
