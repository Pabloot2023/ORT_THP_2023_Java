package noNumberAttch;

public class Test {

    public static void main(String[] args) {
    	//casoDePrueba1(); 		// Agregar Área
        //casoDePrueba2(); 		// Agregar Oficina a Área
        casoDePrueba3(); 		// Agregar Empleado a Oficina o Área
        //casoDePrueba4();
        //casoDePrueba5();
        //casoDePrueba6();
        //casoDePrueba7();
        //casoDePrueba8();
        //casoDePrueba9();
        //casoDePrueba10();
    }

    private static void casoDePrueba1() {
        System.out.println("Caso de Prueba 1: Agregar Área");
        Compania Compania1 = new Compania("Mi Compañía 1");
        boolean areaAgregada = Compania1.agregarArea(1);
        if (areaAgregada) {
            System.out.println("Área agregada con éxito.");
        } else {
            System.out.println("No se pudo agregar el área.");
        }
    }

    private static void casoDePrueba2() {
        System.out.println("Caso de Prueba 2: Agregar Oficina a Área");
        Compania Compania2 = new Compania("Mi Compañía 2");
        boolean areaAgregada = Compania2.agregarArea(1);
        boolean oficinaAgregada = Compania2.agregarOficina(1,101); // Oficina 101
        if (oficinaAgregada) {
            System.out.println("Oficina agregada con éxito al área.");
        } else {
            System.out.println("No se pudo agregar la oficina al área.");
        }
    }

    private static void casoDePrueba3() {
        System.out.println("Caso de Prueba 3: Agregar Empleado a Oficina o Área");
        Compania Compania3 = new Compania("Mi Compañía");
        Compania3.agregarArea(1);
        Compania3.agregarOficina(1,102);
        boolean empleadoAgregado = Compania3.agregarEmpleado("Juan", "Perez", 123456); // Oficina 101
        if (empleadoAgregado) {
            System.out.println("Empleado agregado con éxito a la oficina.");
        } else {
            System.out.println("No se pudo agregar el empleado a la oficina.");
        }
    }

    private static void casoDePrueba4() {
        System.out.println("Caso de Prueba 4: Listar Áreas");
        Compania Compania4 = new Compania("Mi Compañía");
        Compania4.agregarArea(1);
        Compania4.agregarArea(2);
        Compania4.listarAreas();
    }

    private static void casoDePrueba5() {
        System.out.println("Caso de Prueba 5: Listar Empleados de Área");
        Compania Compania5 = new Compania("Mi Compañía");
        Compania5.agregarArea(1);
        Compania5.agregarOficina(1,103);
        Compania5.agregarEmpleado("Juan", "Perez", 123456);
        Compania5.listarEmpleados();
    }
    
    private static void casoDePrueba6() {
        System.out.println("Caso de Prueba 6: Existe Empleado");
        Compania Compania6 = new Compania("Mi Compañía");
        Compania6.agregarArea(1);
        Compania6.agregarOficina(1,104);
        Compania6.agregarEmpleado("Juan", "Perez", 123456);
        
        boolean existeEmpleado1 = Compania6.existeEmpleado(123456); // DNI existente
        boolean existeEmpleado2 = Compania6.existeEmpleado(789012); // DNI inexistente
        
        System.out.println("Existe empleado con DNI 123456: " + existeEmpleado1);
        System.out.println("Existe empleado con DNI 789012: " + existeEmpleado2);
    }

    private static void casoDePrueba7() {
        System.out.println("Caso de Prueba 7: Modificar Empleado (acceso a métodos privados)");
        Empleado empleado = new Empleado("Juan", "Perez", 123456);
        empleado.setNombre("Luis");
        empleado.setApellido("Gomez");
        empleado.setDni(789012);
        System.out.println(empleado.toString());
    }

    private static void casoDePrueba8() {
        System.out.println("Caso de Prueba 8: Listar Empleados de Oficina");
        Compania miCompania = new Compania("Mi Compañía");
        miCompania.agregarArea(1);
        miCompania.agregarOficina(1,105);
        miCompania.agregarEmpleado("Juan", "Perez", 123456);
        miCompania.agregarEmpleado("Maria", "Lopez", 789012);
        miCompania.listarEmpleados();
    }

    private static void casoDePrueba9() {
        System.out.println("Caso de Prueba 9: Existe Empleado en Oficina");
        Compania miCompania = new Compania("Mi Compañía");
        miCompania.agregarArea(1);
        miCompania.agregarOficina(1,106);
        miCompania.agregarEmpleado("Juan", "Perez", 123456);
        
        boolean existeEmpleado1 = miCompania.existeEmpleado(123456); // DNI existente
        boolean existeEmpleado2 = miCompania.existeEmpleado(789012); // DNI inexistente
        
        System.out.println("Existe empleado con DNI 123456 en Oficina 101: " + existeEmpleado1);
        System.out.println("Existe empleado con DNI 789012 en Oficina 101: " + existeEmpleado2);
    }

    private static void casoDePrueba10() {
        System.out.println("Caso de Prueba 10: Existe Empleado en Área");
        Compania miCompania = new Compania("Mi Compañía");
        miCompania.agregarArea(1);
        miCompania.agregarOficina(1,107);
        miCompania.agregarEmpleado("Juan", "Perez", 123456);
        
        boolean existeEmpleado1 = miCompania.existeEmpleado(123456); // DNI existente
        boolean existeEmpleado2 = miCompania.existeEmpleado(789012); // DNI inexistente
        
        System.out.println("Existe empleado con DNI 123456 en Área 1: " + existeEmpleado1);
        System.out.println("Existe empleado con DNI 789012 en Área 1: " + existeEmpleado2);
    }

}

