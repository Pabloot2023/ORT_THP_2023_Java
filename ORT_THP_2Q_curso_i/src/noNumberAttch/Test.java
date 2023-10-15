package noNumberAttch;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;

    public static void main(String[] args) {
    	//casoDePrueba1(); 		// OK --> Agregar Área
        //casoDePrueba2(); 		// OK --> Agregar Oficina a Área
        casoDePrueba3(); 		// OK --> Agregar Empleado a Área
        //casoDePrueba4(); 		// OK --> Listar Áreas 
        //casoDePrueba5(); 		// OK --> Listar Empleados
        //casoDePrueba6(); 		// OK --> Validar si existe Empleado mediante DNI
        //casoDePrueba7(); 		// OK --> Modificar datos de Empleado (accesos a métodos privados)
        //casoDePrueba8();  	// OK --> Listar Empleados de Oficina
        //casoDePrueba9(); 		// OK --> Existe Empleado en Oficina
        //casoDePrueba10();		// OK --> Existe Empleado en Area
    }

    private static void casoDePrueba1() {
        System.out.println("Caso de Prueba 1: Agregar Área");
        barraSeparadora();
        separador2();
        Compania Compania1 = new Compania("Mi Compañía 1");
        boolean areaAgregada = Compania1.agregarArea(1);
        if (areaAgregada) {
            System.out.println("Área agregada con éxito.");
        } else {
            System.out.println("No se pudo agregar el área.");
        }
        separador2();
        barraSeparadora();
    }

    private static void casoDePrueba2() {
        System.out.println("Caso de Prueba 2: Agregar Oficina a Área");
        barraSeparadora();
        separador2();
        Compania Compania2 = new Compania("Mi Compañía 2");
        boolean areaAgregada = Compania2.agregarArea(1);
        boolean oficinaAgregada = Compania2.agregarOficina(1,101); // Oficina 101
        if (oficinaAgregada) {
            System.out.println("Oficina agregada con éxito al área.");
        } else {
            System.out.println("No se pudo agregar la oficina al área.");
        }
        separador2();
        barraSeparadora();
    }

    private static void casoDePrueba3() {
        System.out.println("Caso de Prueba 3: Agregar Empleado a Área");
        barraSeparadora();
        separador2();
        Compania Compania3 = new Compania("Mi Compañía 3");
        Compania3.agregarArea(1);
        Compania3.agregarOficina(1,105);
        boolean empleadoAgregado = Compania3.agregarEmpleado("Juan", "Perez", 123456, 1); 
        if (empleadoAgregado) {
            System.out.println("Empleado agregado con éxito al área.");
        } else {
            System.out.println("No se pudo agregar el empleado al área. Posible motivo: el área está llena.");
        }
        separador2();
        barraSeparadora();
    }


    private static void casoDePrueba4() {
        System.out.println("Caso de Prueba 4: Listar Áreas");
        barraSeparadora();
        separador2();
        Compania Compania4 = new Compania("Mi Compañía 4");
        Compania4.agregarArea(1);
        Compania4.agregarArea(2);
        Compania4.listarAreas();
        separador2();
        barraSeparadora();
    }

    private static void casoDePrueba5() {
        System.out.println("Caso de Prueba 5: Listar Empleados de Área");
        barraSeparadora();
        separador2();
        Compania Compania5 = new Compania("Mi Compañía 5");
        Compania5.agregarArea(1);
        Compania5.agregarOficina(1, 103);
        Compania5.agregarEmpleado("Juan", "Perez", 123456, 1);
        Compania5.listarEmpleados();
        separador1();
        Compania5.agregarEmpleado("Alberto", "Perez", 654321, 1);
        Compania5.listarEmpleados();
        System.out.println(" ");
        Compania5.agregarArea(2);
        Compania5.agregarOficina(2, 109);
        Compania5.agregarEmpleado("Ana", "Perez", 987654, 2); 
        Compania5.listarEmpleados();
        separador1();
        Compania5.agregarEmpleado("Laura", "Perez", 456789, 2); 
        Compania5.listarEmpleados();
        separador2();
        barraSeparadora();
    }
   
    private static void casoDePrueba6() {
        System.out.println("Caso de Prueba 6: Validar si existe Empleado mediante DNI");
        barraSeparadora();
        separador2();
        Compania Compania6 = new Compania("Mi Compañía");
        Compania6.agregarArea(1);
        Compania6.agregarOficina(1, 104);
        Compania6.agregarEmpleado("Juan", "Perez", 123456, 1);
        separador1();            
        Compania6.existeEmpleado(123456); // DNI existente
        Compania6.existeEmpleado(789012); // DNI inexistente
        separador1();
        Compania6.agregarEmpleado("Alberto", "Perez", 789012, 1);
        separador1();
        Compania6.existeEmpleado(123456); // DNI existente
        separador1();
        Compania6.existeEmpleado(789012); // DNI ahora siexistente
        separador2();
        barraSeparadora();
    }

    private static void casoDePrueba7() {
        System.out.println("Caso de Prueba 7: Modificar Empleado (acceso a métodos privados)");
        barraSeparadora();
        separador2();
        System.out.println(" ");
        Compania Compania7 = new Compania("Mi Compañía");
        Compania7.agregarArea(1);
        Compania7.agregarOficina(1, 104);
        Compania7.agregarEmpleado("Juan", "Perez", 123456, 1);

        Compania7.existeEmpleado(123456); // DNI existente
        separador1();
        System.out.println("Probando modificar datos de");
        separador1();
        Compania7.modificarEmpleado(123456, "Luis", "Gomez", 789012);
        separador1();
        System.out.println("Buscando el viejo DNI");
        separador1();
        Compania7.existeEmpleado(123456); // DNI antiguo
        separador1();
        System.out.println("Buscando el nuevo DNI");
        separador1();
        Compania7.existeEmpleado(789012); // DNI ahora existente
        separador2();
        barraSeparadora();

    }
   
    private static void casoDePrueba8() {
        System.out.println("Caso de Prueba 8: Listar Empleados de Oficina");
        barraSeparadora();
        separador2();
        System.out.println(" ");
        Compania Compania8 = new Compania("Mi Compañía 8");
        Compania8.agregarArea(1);
        Compania8.agregarOficina(1,105);
        Compania8.agregarEmpleado("Juan", "Perez", 123456,1);
        Compania8.agregarEmpleado("Maria", "Lopez", 789012,1);
        Compania8.listarEmpleados();
        separador1();
        Compania8.agregarArea(2);
        Compania8.agregarOficina(2, 109);
        Compania8.agregarEmpleado("Ana", "Perez", 987654, 2); 
        Compania8.agregarEmpleado("Laura", "Perez", 456789, 2); 
        Compania8.listarEmpleados();
        separador2();
        barraSeparadora();
    }

    private static void casoDePrueba9() {
        System.out.println("Caso de Prueba 9: Existe Empleado en Oficina");
        barraSeparadora();
        separador2();
        Compania miCompania = new Compania("Mi Compañía");
        miCompania.agregarArea(1);
        miCompania.agregarOficina(1,106);
        miCompania.agregarEmpleado("Juan", "Perez", 123456,1);
        
        miCompania.existeEmpleado(123456); // DNI existente
        separador1();
        miCompania.existeEmpleado(789012); // DNI inexistente
        separador2();
        barraSeparadora();
        
    }

    private static void casoDePrueba10() {
        System.out.println("Caso de Prueba 10: Existe Empleado en Área");
        barraSeparadora();
        separador2();
        System.out.println(separador1);
        Compania miCompania = new Compania("Mi Compañía");
        miCompania.agregarArea(1);
        miCompania.agregarOficina(1,107);
        miCompania.agregarEmpleado("Juan", "Perez", 123456,1);     
        miCompania.existeEmpleado(123456); // DNI existente
        separador1();
        miCompania.existeEmpleado(789012); // DNI inexistente
        separador2();
        barraSeparadora();
        
        
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