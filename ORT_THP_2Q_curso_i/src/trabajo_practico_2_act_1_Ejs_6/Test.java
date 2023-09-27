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

https://www.w3schools.com/java/java math.asp

 
 */

/*
@startuml

class Dado {
  - valor: int

  + Dado()    // Constructor
  + lanzar() : void
  + getValor() : int
}

@enduml
 */


package trabajo_practico_2_act_1_Ejs_6;

public class Test {
    public static void main(String[] args) {
    	int valorDado1;
        int valorDado2;
        int total = 0;
        int numLanzamientos = 100;
        int i;
    	
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        // Lanzar los dos dados
        dado1.lanzar();
        dado2.lanzar();

        valorDado1 = dado1.getValor();
        valorDado2 = dado2.getValor();

        System.out.println("------IMPRIMIENDO RESULTADOS----------");
        System.out.println(" ");
        System.out.println("Resultado del primer dado: " + valorDado1);
        System.out.println("Resultado del segundo dado: " + valorDado2);
        System.out.println(" ");

        if (valorDado1 == valorDado2) {
            System.out.println("Los resultados son iguales: " + valorDado1);
            System.out.println(" ");
        } else {
            System.out.println("El resultado mayor es: " + (valorDado1 > valorDado2 ? valorDado1 : valorDado2));
            System.out.println(" ");
        }

        // Calcular el promedio de 100 lanzamientos
     

        for ( i = 0; i < numLanzamientos; i++) {
            Dado dado = new Dado();
            dado.lanzar();
            total += dado.getValor();
        }

        double promedio = (double) total / numLanzamientos;
        System.out.println("Promedio de los resultados de " + numLanzamientos + " lanzamientos: " + promedio);
    }
}
