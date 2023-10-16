package trabajo_practico_2_act_1_Ejs_11;

public class Test {
	
	public static String separador1;
	public static String separador2;
	public static String barraSeparadora;

	public static void main(String[] args) {
		Turnera turnera = new Turnera();

		barraSeparadora();
        System.out.println("Último número otorgado: " + turnera.obtenerUltimoNumeroOtorgado());
        barraSeparadora();
        separador2();
        
        barraSeparadora();
        turnera.otorgarProximoNumero();
        System.out.println("Nuevo número otorgado: " + turnera.obtenerUltimoNumeroOtorgado());
        barraSeparadora();
        separador2();

        barraSeparadora();
        turnera.resetearContador();
        System.out.println("Contador reiniciado: " + turnera.obtenerUltimoNumeroOtorgado());
        barraSeparadora();
        separador2();
        
        barraSeparadora();
        turnera.resetearContador(75);
        System.out.println("Contador reiniciado a 75: " + turnera.obtenerUltimoNumeroOtorgado());
        barraSeparadora();
        separador2();
     
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
