/*

4 La clase Cafetera cuenta con los siguientes atributos
● capacidadMaxima (entero, la cantidad máxima de café que puede contener la
cafetera en mililitros),
● cantidadActual (entero, la cantidad actual de café que hay en la cafetera en
mililitros).
Implementar, al menos, los siguientes métodos:
a. Constructor predeterminado o por defecto: establece la capacidad máxima en
1000 y la actual en cero (cafetera vacía).
b. Constructor con la capacidad máxima de la cafetera: inicializa la capacidad
máxima con lo recibido y la cantidad actual en cero (vacía).
c. Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual
es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
d. Setters privados y getters públicos. El setter de la capacidad nunca debe
permitir un valor menor a 250 (si es menor lo fuerza a 250); la cantidad actual
debe controlar que nunca sea menor a cero ni mayor a la capacidad de la
cafetera.
e. llenar(): iguala la cantidad actual de la cafetera con la capacidad máxima.
f. servirTaza(int): simula la acción de servir una taza con la capacidad indicada
por parámetro. Si la cantidad actual de café no alcanza para llenar la taza, se
sirve lo que haya.
g. vaciar(): setea la cantidad de café actual en cero.
h. agregarCafe(int): añade a la cafetera la cantidad de café indicada, en el caso
de ser posible. Devuelve la cantidad sobrante.
Realizar la clase Test para probar el correcto funcionamiento de todos los métodos de
la clase previamente realizada. Crear una cafetera por defecto, otra con medio litro de
capacidad y una tercera con tres cuartos litros de capacidad y una cantidad inicial de
medio litro de café. Usar un único método testearCafetera(Cafetera) para probar las
tres cafeteras por separado, una cada vez.
 */

package trabajo_practico_2_act_1_Extra_Cafetera;

public class Test {

    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(); // Cafetera por defecto
        Cafetera cafetera2 = new Cafetera(500); // Cafetera con 500 ml de capacidad
        Cafetera cafetera3 = new Cafetera(750, 500); // Cafetera con 750 ml de capacidad y 500 ml de café

        System.out.println("\nCafetera 1:");
        testearCafetera(cafetera1);
        System.out.println("-----------------------------------------");
        System.out.println("\nCafetera 2:");
        testearCafetera(cafetera2);
        System.out.println("-----------------------------------------");
        System.out.println("\nCafetera 3:");
        testearCafetera(cafetera3);
    }

    public static void testearCafetera(Cafetera cafetera) {
    	int sobrante;
    	
        System.out.println(cafetera);

        System.out.println("\nLlenar la cafetera:");
        cafetera.llenar();
        System.out.println(cafetera);

        System.out.println("\nServir una taza de 250 ml:");
        cafetera.servirTaza(250);
        System.out.println(cafetera);

        System.out.println("\nVaciar la cafetera:");
        cafetera.vaciar();
        System.out.println(cafetera);

        System.out.println("\nAgregar 600 ml de café:");
        sobrante = cafetera.agregarCafe(600);
        System.out.println("Sobrante: " + sobrante + " ml");
        System.out.println(cafetera);
    }
}
