/*
 ﻿

13) La Liga de los programadores
Crear la clase SuperHeroe con los atributos nombre (String), fuerza (int), resistencia (int) y superpoderes (int). Todos los atributos numéricos deberán aceptar valores entre 0 y 100; en caso de que el setter correspondiente reciba un valor fuera de rango deberá setear el valor límite correspondiente (si recibe un valor negativo asignar cero, si recibe uno superior a cien, asignar cien). El constructor de la clase recibirá todos los valores de sus atributos por parámetro y usará los setters (todos privados) para validar el rango correcto de los poderes del superhéroe.
También habrá el método toString() para devolver el estado completo de la instancia y un método competir(), ambos públicos. Este último recibirá otro superhéroe como parámetro y, comparando los poderes de él mismo contra el otro recibido por parámetro, devolverá TRIUNFO, EMPATE o DERROTA, dependiendo del resultado. Para triunfar un superhéroe debe superar al otro en al menos 2 de los 3 items.
Escribir la clase Test que contenga el método main() para probar el correcto funcionamiento de la clase previamente realizada con el siguiente ejemplo:
superHeroe1: Nombre: "Batman", Fuerza: 90, Resistencia: 70, Superpoderes: 0
superHeroe2: Nombre: "Superman", Fuerza: 95, Resistencia: 60, Superpoderes: 70
Hacer jugar al superheroe1 pasándole el objeto superheroe2 y mostrar el resultado por pantalla. Chequear el resultado (debería ser DERROTA).
Hacer jugar al superheroe2 contra el superheroe1 y mostrar el resultado por pantalla. Chequear el resultado (debería ser TRIUNFO).
Crear más superhéroes con distintos valores y jugar.
 */

package trabajo_practico_2_act_1_Ejs_13;

public class Test {

    public static void main(String[] args) {
        SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
        SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60, 70);

        System.out.println("Super Heroe 1: " + superHeroe1);
        System.out.println("Super Heroe 2: " + superHeroe2);

        Resultado resultado1 = superHeroe1.competir(superHeroe2);
        Resultado resultado2 = superHeroe2.competir(superHeroe1);

        System.out.println("\n" + "Resultado de superHeroe1 contra superHeroe2: " + resultado1);
        System.out.println("Resultado de superHeroe2 contra superHeroe1: " + resultado2);
        
        
        
        
    }
}




