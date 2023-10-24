package ej_parcial_3_1;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;
	
	
    public static void main(String[] args) {
        casoDePrueba1();
        //casoDePrueba2();
        //casoDePrueba3(); 
        //casoDePrueba4(); 
        //casoDePrueba5(); 

    }

    public static void casoDePrueba1() {
    	intro();
        Edificio edificio = new Edificio("Av San Juan 1234", 10);
        edificio.agregarUnidad(1, "1A", "Propietario 1");
        edificio.agregarUnidad(2, "2B", "Propietario 2");
        edificio.agregarUnidad(3, "3C", "Propietario 3");
        edificio.actualizarVoto(1, 'S');
        edificio.actualizarVoto(2, 'N');
        barraSeparadora();
        edificio.listarVotosPositivos();
        outro();
    }

//    public static void casoDePrueba2() {
//        Edificio edificio = new Edificio("Dirección del Edificio", 10);
//        edificio.agregarUnidad(1, "11111111A", "Propietario 1");
//        edificio.agregarUnidad(2, "22222222B", "Propietario 2");
//        // Agregar más departamentos y votos para este caso de prueba
//        edificio.actualizarVoto(1, 'S');
//        edificio.actualizarVoto(2, 'N');
//        edificio.listarVotosPositivos();
//        verificarResultados(edificio);
//    }

//    public static void casoDePrueba3() { 
//        Edificio edificio = new Edificio("Dirección del Edificio", 10);
//
//        // Agregar departamentos
//        edificio.agregarUnidad(1, "11111111A", "Propietario 1");
//        edificio.agregarUnidad(2, "22222222B", "Propietario 2");
//        edificio.agregarUnidad(3, "33333333C", "Propietario 3");
//
//        // Actualizar votos
//        edificio.actualizarVoto(1, 'S');
//        edificio.actualizarVoto(2, 'N');
//
//        // Agregar más departamentos
//        edificio.agregarUnidad(4, "44444444D", "Propietario 4");
//        edificio.agregarUnidad(5, "55555555E", "Propietario 5");
//        edificio.agregarUnidad(6, "66666666F", "Propietario 6");
//
//        // Actualizar más votos
//        edificio.actualizarVoto(3, 'S');
//        edificio.actualizarVoto(4, 'N');
//        edificio.actualizarVoto(6, 'S');
//
//        // Listar votos positivos y calcular el porcentaje
//        edificio.listarVotosPositivos();
//        
//        verificarResultadosCaso3(edificio);
//    }
//
//
//    public static void casoDePrueba4() {
//        
//    }
//
//    public static void casoDePrueba5() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//
//    public static void casoDePrueba6() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//
//    public static void casoDePrueba7() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//
//    public static void casoDePrueba8() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//
//    public static void casoDePrueba9() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//
//    public static void casoDePrueba10() {
//        // Agregar departamentos, votos y probar otras funcionalidades
//    }
//    
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
