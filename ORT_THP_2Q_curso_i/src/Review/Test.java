package Review;

public class Test {

	public static void main(String[] args) {
		 Compania miCompania = new Compania("MiCompania");

	        // Agregar áreas
	        miCompania.agregarArea("Recursos Humanos");
	        //miCompania.agregarArea("Ventas");

	        // Agregar oficinas a las áreas
	        miCompania.agregarOficina("Recursos Humanos", 101);
	        //miCompania.agregarOficina("Ventas", 201);

	        // Agregar empleados a las oficinas
	        miCompania.agregarEmpleado("Recursos Humanos", 101, "Juan", "Gómez");
	        //miCompania.agregarEmpleado("Recursos Humanos", 101, "Ana", "Pérez");
	        //miCompania.agregarEmpleado("Ventas", 201, "Carlos", "López");

	        // Listar empleados en la compañía
	        miCompania.listarEmpleados();

	       
	}

}