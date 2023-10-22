package trabajo_practico_3_Ej_3;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;

		public static void main(String[] args) {
			
		    Inmobiliaria inmobiliaria = new Inmobiliaria();
				 
		    //casoDePrueba1();// Agregar barrios

		    //casoDePrueba2();// Agregar propiedades a los barrios

		    //casoDePrueba3();// Cambiar propiedad de barrio

		    //casoDePrueba4();// Borrar propiedad y Mostrar propiedades

		    //casoDePrueba5();// Mostrar barrios con la mayor cantidad de propiedades

			}

	public static void casoDePrueba1() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

		    // Agregar barrios
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    	    
		    inmobiliaria.buscarBarrio("Barrio2");
		
	    outro();
		}
		
	public static void casoDePrueba2() {
		intro();
		
		 Inmobiliaria inmobiliaria = new Inmobiliaria();

	 
		    inmobiliaria.agregarBarrio("Barrio1");
		    inmobiliaria.agregarBarrio("Barrio2");
		    inmobiliaria.agregarBarrio("Barrio3");
		    
		    inmobiliaria.buscarBarrio("Barrio2");
		    
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle1",100000));
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 2", 90000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle 3", 120000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.PH,"Calle 4", 80000));
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 5", 150000));
		  
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
		    
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle1",100000));
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 2", 90000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle 3", 120000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.PH,"Calle 4", 80000));
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 5", 150000));
		  
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
		    
		    inmobiliaria.buscarBarrio("Barrio2");
		    
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle1",100000));
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 2", 90000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle 3", 120000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.PH,"Calle 4", 80000));
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 5", 150000));
		  
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
		    
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle1",100000));
		    inmobiliaria.buscarBarrio("Barrio1").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 2", 90000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.CASA,"Calle 3", 120000));
		    inmobiliaria.buscarBarrio("Barrio2").agregarPropiedad(new Propiedad(tipoPropiedad.PH,"Calle 4", 80000));
		    inmobiliaria.buscarBarrio("Barrio3").agregarPropiedad(new Propiedad(tipoPropiedad.DEPARTAMENTO,"Calle 5", 150000));
		  
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
