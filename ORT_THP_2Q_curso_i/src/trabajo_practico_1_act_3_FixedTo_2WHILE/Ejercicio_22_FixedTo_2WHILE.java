/*Enunciado
	22.	Realizá un programa que muestre todos los números enteros del 1 al 5, 
	y luego los mismos números pero en orden inverso. [EC]
*/

package trabajo_practico_1_act_3_FixedTo_2WHILE;

public class Ejercicio_22_FixedTo_2WHILE {

    public static void main(String[] args) {

        int i;
        int y = 1;
    	while (y == 1){
        System.out.println("--------------------------------------");
        for (i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------");
        for (i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------");
    }
}
}
