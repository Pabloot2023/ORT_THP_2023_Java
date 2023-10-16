package trabajo_practico_2_Ejs_2345;

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
        	Domicilio domicilio1 = new Domicilio();
        	domicilio1.setCalle("Yatay");
        	domicilio1.setNumero(240);
        	domicilio1.setCiudad("CABA");
        	
        // asignar  domicilio1 para la persona1	
        persona1.setDireccionParticular(domicilio1);
     // mostrar el domicilio asociado a personal	
        persona1.mostrarDomicilio();
        
        // Crear  domicilio para la persona2
    	Domicilio domic2 = new Domicilio();
    	domic2.setCalle("Yatay");
    	domic2.setNumero(240);
    	domic2.setCiudad("CABA");
    	
    	  // asignar  domicilio2 para la persona2	
        persona2.setDireccionParticular(domicilio1);
        
        
        domic2.setCalle("Rivadavia");
        
        
        
    }
}