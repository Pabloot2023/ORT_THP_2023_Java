/*
8) Que grande esta Tarjeta:
Crea la clase Tarjeta DeCredito con la siguiente estructura:

--- Atributos privados:
 numero (String),
titular (String),
limiteDeCompra (double),
acumuladoActual (double).

--- Método:

--> Constructor parametrizado y público que reciba número, titular y límite de compra por parámetros y 
los asigne al atributo correspondiente. El atributo acumulado Actual se inicializará con 0 (cero).

--> Los getters de cada uno de sus atributos, públicos, y los setters, todos privados,
 menos el método setAcumuladoActual() que no existe.
 
--> El método público monto Disponible() que devuelve la diferencia entre el límite de compras y
 el acumulado actual de gastos, pero si por alguna razón este valor es inferior a cero devuelve cero.
  Por ejemplo, si gastaste determinado monto y luego cambiaron el límite a un valor menor a éste,
   el monto disponible debe ser 0 (cero). El método privado compraPosible() que según el monto recibido
    por parámetro devuelve si se puede o no hacer la compra. Para saber si la compra es posible
     el monto de la misma no debe superar al monto disponible para compras.
     
--> El método público actualizarLimite(), que recibe un nuevo límite de compra. 
El método privado acumularGastoActual(), que recibe el importe de la compra y lo suma al acumulado actual.
--> El método público realizarCompra(), el cual dado un monto comprueba si esta se puede realizar 
(si con la compra no se supera el límite), y si es posible la procesa actualizando los atributos 
que deba actualizar siempre usando los métodos que corresponda. Este método devuelve un booleano 
que indica si la compra se pudo realizar o no.

--> El método toString() (público), el cual además de los atributos debe incluir el monto disponible para comprar.

En la clase Test, se creará un objeto tarjeta con la siguiente información:

Número 4145-4141-2222-1111
• Titular Juan Perez
• Límite 10000


Luego:
a) Hacer una compra de $4000
b) Mostrar el estado de la instancia (aprovechando el método toString()). Verás que el disponible debería ser de $6000.
c) Bajar el límite a $3000.
d) Intentar otra compra de $4000 (no debería poder).
e) Volver a mostrar el estado de la clase; ahora el disponible debería ser $0.

 */


package trabajo_practico_2_act_1_Ejs_8;

public class Test {

	public static void main(String[] args) {
		
		
		        Tarjeta tarjeta = new Tarjeta("4145-4141-2222-1111", "Juan Perez", 10000.0);
		        		  
		        tarjeta.realizarCompra(4000); // se procesa intento de pago | SI pasa actualiza acumulador monto y  levanta bandera validacion
		        						   // se procesa intento de pago | NO pasa no actualiza acumulador monto y baja bandera validacion
		        tarjeta.validarCompra();   // segun estado bandera imprime mensaje de exito o error

		        System.out.println(tarjeta.toString());
		         
		        tarjeta.actualizarLimite(3000);
		   	        
		        tarjeta.realizarCompra(4000);  // Intentamos otra compra de 4000
		        tarjeta.validarCompra();       // NO deberia de poderse el nuevo limite es 3000 y la compra es de 4000

		        System.out.println(tarjeta.toString());
		       

		    }
		

	


}