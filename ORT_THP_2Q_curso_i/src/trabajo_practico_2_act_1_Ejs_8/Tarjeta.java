package trabajo_practico_2_act_1_Ejs_8;

public class Tarjeta {
	
	    private String numero;
	    private String titular;
	    private double limiteDeCompra;
	    private double acumuladoActual;
	    static Boolean realizarCompra;

	    public Tarjeta(String numero, String titular, double limiteDeCompra) {
	        this.numero = numero;
	        this.titular = titular;
	        this.limiteDeCompra = limiteDeCompra;
	        this.acumuladoActual = 0;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getLimiteDeCompra() {
	        return limiteDeCompra;
	    }

	    private void setNumero(String numero) {
	        this.numero = numero;
	    }

	    private void setTitular(String titular) {
	        this.titular = titular;
	    }

	    private void setLimiteDeCompra(double limiteDeCompra) {
	    	
	        this.limiteDeCompra = limiteDeCompra;
	    }

	    public double montoDisponible() {
	        double disponible = limiteDeCompra - acumuladoActual;
	        if (disponible < 0) {
	            return 0;
	        } else {
	            return disponible;
	        }
	    }


	    private boolean compraPosible(double monto) {
	        return monto <= montoDisponible();
	    }

	    public void actualizarLimite(double nuevoLimite) {
	        setLimiteDeCompra(nuevoLimite);
	    }

	    private void acumularGastoActual(double importe) {
	        acumuladoActual += importe;
	    }

	    public boolean realizarCompra(double monto) {
	    	System.out.println("\n" + "Procesando Compra, Aguarde un Instante");
	    	System.out.println(".");
	    	System.out.println("..");
	    	System.out.println("...");
	    	if (compraPosible(monto)) {
	            acumularGastoActual(monto);
	            realizarCompra = true;
	            return true;
	        } else {
	        	realizarCompra = false;
	            return false;
	        }
	    }
	    
	    
	    public static String validarCompra() {
	    	String validarCompra = " ";

	        if (realizarCompra) {
	            System.out.println("Compra realizada con éxito!!");
	            System.out.println("...");
		    	System.out.println("..");
		    	System.out.println("." + "\n");
	        } else {
	            System.out.println("No se pudo realizar la compra. Cancelando compra");
	            System.out.println("...");
		    	System.out.println("..");
		    	System.out.println("." + "\n");
	        }
	        
	        return validarCompra;
	    }
	    

	    @Override
	    public String toString() {
	        return "Número de Tarjeta: " + numero + "\nTitular: " + titular + "\nLímite de Compra: $" + limiteDeCompra
	                + "\nMonto Disponible: $" + montoDisponible();
	    }
	}


