/*
 Realizá el diagrama de clases UML y luego desarrollalo en Java.

Escribí una clase que simule un dado tradicional de 6 caras, con las propiedades y métodos que
consideres más adecuados. Recordá que debe tener un constructor el cual setea el valor inicial del
dado, más el método getValor() que devuelve.

Escribí la clase Test que utilice la clase dado para lanzar dos dados. Haga lo siguiente:
e Decir si el resultado es el mismo en los dos dados, indicando el valor.
e Siel resultado no es el mismo en los dos dados, mostrar el valor mayor.
e Mostrar por pantalla el promedio de los resultados de 100 lanzamientos (de los dos dados).

Para obtener un número aleatorio en Java debes utilizar el método random colocándolo donde lo
consideres necesario.

// devuelve un valor entre 0 y 5. El 6 es la cantidad de caras en este caso.
valor = (int) (Math.random() * 6);

Para más información podés consultar el siguiente link:

 */

/*
class Dado {
  - valor: int

  + Dado()    // Constructor
  + lanzar() : void
  + getValor() : int
}
 */

package trabajo_practico_2_act_1_Ejs_6;

public class Test {
    static int vd1;
    static int vd2;
    static String validacionResultados;
    static String impresionResultados;
    static String promedio100;
    static Dado dado1 = new Dado();
    static Dado dado2 = new Dado();

    public static void main(String[] args) {
        int valorDado1;
        int valorDado2;
        int total = 0;
        int numLanzamientos = 100;
        int i;     
      
        dado1.tirarDado();  // tirar dado 1
        dado2.tirarDado();  // tirar dado 2

        valorDado1 = dado1.getValor(); // asignar valor a dado 1
        valorDado2 = dado2.getValor(); // asignar valor a dado 2
        vd1 = valorDado1; 			   // llevar a capa 1  los datos de dado 1
        vd2 = valorDado2; 			   // llevar a capa 1  los datos de dado 2

        System.out.println(imprimirResultadosPrimarios());
        System.out.println(validarResultados());       
        System.out.println(tirar100veces_e_ImprimirResultadosFinales()); // tirar 100 veces, contando la primera ya hecho y saca promedios

    }
    
    public static String imprimirResultadosPrimarios() {
        String impresionResultados;
        impresionResultados = "------IMPRIMIENDO RESULTADOS----------" + "\n" + "\n" +"Resultado del primer dado: " + vd1
                + "\n" + "Resultado del segundo dado: " + vd2 + "\n";

        return impresionResultados;
    } 
    
    public static String validarResultados() {
        String validacionResultados;

        if (vd1 == vd2) {
            validacionResultados = ("Los resultados son iguales: " + vd1);
        } else {
            if (vd1 > vd2) {
                validacionResultados = ("El resultado mayor es: " + vd1);
            } else {
                validacionResultados = ("El resultado mayor es: " + vd2);
            }
        }

        
        return validacionResultados;
    }

    public static String tirar100veces_e_ImprimirResultadosFinales() {
        int numLanzamientos = 99;
        int totalDado1 = 0;
        int totalDado2 = 0;
        double promedioDado1;
        double promedioDado2;
        double promedioFinal;
        totalDado1 += vd1;
        totalDado2 += vd2;
        
        
        for (int i = 0; i < numLanzamientos; i++) {            
            dado1.tirarDado();
            dado2.tirarDado();
            
            totalDado1 += dado1.getValor();
            totalDado2 += dado2.getValor();
        }

         promedioDado1 = (double) totalDado1 / numLanzamientos;
         promedioDado2 = (double) totalDado2 / numLanzamientos;
         promedioDado1 = (int) (promedioDado1 * 100) / 100.0;
         promedioDado2 = (int) (promedioDado2 * 100) / 100.0;
         
         promedioFinal = ((promedioDado1 + promedioDado2) / 2);
         promedioFinal = (int) (promedioFinal * 100) / 100.0;

        System.out.println("\n" + "------CALCULANDO PROMEDIOS----------");
        System.out.println("\n" + "Promedio del primer dado en " + (numLanzamientos+1) + " lanzamientos: " + promedioDado1);
        System.out.println("\n" + "Promedio del segundo dado en " + (numLanzamientos+1) + " lanzamientos: " + promedioDado2);
        
        
        
        promedio100 = "\n" + "Promedio entre ambos dados: " + promedioFinal;
        
        return promedio100;
    }
      
}
