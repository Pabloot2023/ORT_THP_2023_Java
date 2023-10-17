package trabajo_practico_3_Ej_1;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;
	
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

      
        intro();
        casoDePrueba1();  // Agregar 3 personas
        outro();

        intro();
        casoDePrueba2(); // Eliminación no exitosa
        outro();
    
        intro();
        casoDePrueba3();  // Eliminación exitosa
        outro();
        
        intro();
        casoDePrueba4(); // Modificación de dirección no exitosa
        outro();
        
        intro();
        casoDePrueba5(); // Modificación de dirección satisfactoria
        outro();
         
        intro();
        casoDePrueba6();// Listado de personas
        outro();
        
        intro();
        casoDePrueba7();// // Ejemplo de devolver último elemento
        outro();
        
        intro();
        casoDePrueba8();// // Ejemplo de devolver último elemento
        outro();
        
        
        
        
        // Eliminar todos los elementos a mano
        
    }
    
    public static void intro() {
    	separador1();
        barraSeparadora();
    }
    
    public static void outro() {
		barraSeparadora();
		separador1();
    }
    
    private static void casoDePrueba1() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
    }
    
    private static void casoDePrueba2() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
		Persona eliminacionNoExitosa = agenda.removerPersona(99999);
        if (eliminacionNoExitosa == null) {
            System.out.println("Eliminación no exitosa: No se encontró la persona.");
        }
    }
    
    private static void casoDePrueba3() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
        Persona eliminacionExitosa = agenda.removerPersona(67890);
        if (eliminacionExitosa != null) {
            System.out.println("Eliminación exitosa: " + eliminacionExitosa.toString());
        }
    }
    
    private static void casoDePrueba4() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
        boolean modificacionNoExitosa = agenda.modificarDomicilio(88888, "Nueva Direccion");
        if (!modificacionNoExitosa) {
            System.out.println("Modificación de dirección no exitosa: No se encontró la persona.");
        }
    }
    
    private static void casoDePrueba5() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
        boolean modificacionSatisfactoria = agenda.modificarDomicilio(12345, "Nueva Direccion");
        if (modificacionSatisfactoria) {
            System.out.println("Modificación de dirección satisfactoria: Domicilio actualizado.");
        }
    }
    
    private static void casoDePrueba6() {
    	Agenda agenda = new Agenda();
    	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
        agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
        agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
        
    	agenda.listarPersonas();
    }
    
    private static void casoDePrueba7() {
    	Agenda agenda = new Agenda();
	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
    	agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
    	agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
	
    	Persona ultimo = agenda.devolverUltimo();
        if (ultimo != null) {
            System.out.println("Última persona: " + ultimo.toString());
        } else {
            System.out.println("No hay personas en la agenda.");
        }

    }
    
    private static void casoDePrueba8() {
    	Agenda agenda = new Agenda();
	
    	agenda.agregarPersona(12345, "Juan", "Perez", "Calle A");
    	agenda.agregarPersona(67890, "Maria", "Lopez", "Calle B");
    	agenda.agregarPersona(54321, "Carlos", "Gonzalez", "Calle C");
    	
    
    	agenda.listarPersonas();
    	separador1();
    	agenda.eliminarTodosElementosAMano();
        System.out.println("Agenda vacía.");
       

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