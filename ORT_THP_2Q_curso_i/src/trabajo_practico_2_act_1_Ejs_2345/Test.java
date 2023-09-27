package trabajo_practico_2_act_1_Ejs_2345;

public class Test {
    public static void main(String[] args) {


    	// Crear una instancia de la clase Persona
        Persona persona1 = new Persona();        
        // Asignar el nombre "Fulano" a la primera persona
        persona1.setNombre("Fulano");
        // Asignar el apellido "Gomez" a la primera persona
        persona1.setApellido("Gomez");
        // Mostrar el nombre completo de la primera persona
        System.out.println("Nombre completo de la primera persona: " + persona1.obtenerNombreCompleto());

        
        
        
        // Crear otra instancia de la clase Persona
        Persona persona2 = new Persona();
        // Asignar el nombre "Sutano" a la segunda persona
        persona2.setNombre("Sutano");
        // Asignar el apellido "Perez" a la segunda persona
        persona2.setApellido("Perez");
        // Mostrar el nombre completo de la segunda persona
        System.out.println("Nombre completo de la segunda persona: " + persona2.obtenerNombreCompleto());
        
        // Crear  domicilio para la persona1
        	Domicilio domic1 = new Domicilio();
        	domic1.setCalle(null);
        	domic1.setNumero(0);
        	domic1.setCiudad(null);
        	
        // asignar  domicilio1 para la persona1	
        persona1.setDireccionParticular(domic1);
     // mostrar el domicilio asociado a personal	
        persona1.mostrarDomicilio();
        
        
        
        
        
    }
}