package trabajo_practico_2_Ej_10;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;
	
    public static void main(String[] args) {
        Robot Robot1 = new Robot("Optimus Prime");
        Persona persona1 = new Persona("Susana Gimenez");
        Persona persona2 = new Persona("Mirtha Legrand");

        // Caso 1: Saludo del robot
        barraSeparadora();
        System.out.println("CASO 1:");
        separador1();
        Robot1.saludar();
        barraSeparadora();
        separador1();
        
        // Caso 2: Saludo de Optimus Prime a Susana Gimenez
        barraSeparadora();        
        System.out.println("CASO 2:");
        separador1();
        Robot1.saludar(persona1);
        barraSeparadora();
        

        // Caso 3: Saludo de Optimus Prime a Mirtha Legrand
        separador1();
        barraSeparadora();
        System.out.println("CASO 3:");
        separador1();
        Robot1.saludar(persona2);
        barraSeparadora();
        separador1();
    }
    
    public static void separador1() {
    	separador1 = " ";
        System.out.println(separador1);
    }
    
    public static void barraSeparadora() {
    	barraSeparadora = "--------------------------------------------------------------------------";
    	System.out.println(barraSeparadora);

    }
}