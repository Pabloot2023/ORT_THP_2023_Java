package Parcial12092023;

import java.util.Scanner;

public class CodigoParcial09122023 {

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        int num1;
        int num2;
        int a;
        int b;
        int temp;
        int mcd = 0;

        System.out.println("Bienvenido a la calculadora del Maximo Comun Divisor (MCD)");

        // INICIO bloque pedir 1er num entero positivo
        System.out.println("Ingrese un primer numero entero positivo sin decimales");
        num1 = miTeclado.nextInt();
        while (num1 < 1) {
            System.out.println("ERROR! VERIFIQUE EL DATO INGRESADO!");
            System.out.println("---> El numero debe ser entero sin decimales");
            System.out.println("---> El numero debe ser positivo");
            System.out.println("Ingrese nuevamente primer numero entero positivo");
            num1 = miTeclado.nextInt();
        }
        // Fin bloque pedir 1er num entero positivo

        // INICIO bloque pedir 2do num entero positivo
        System.out.println("Ingrese un segundo numero entero positivo");
        num2 = miTeclado.nextInt();
        while (num2 < 1) {
            System.out.println("ERROR! VERIFIQUE EL DATO INGRESADO!");
            System.out.println("---> El numero debe ser entero sin decimales");
            System.out.println("---> El numero debe ser positivo");
            System.out.println("Ingrese un segundo numero entero positivo");
            num2 = miTeclado.nextInt();
        }
        // Fin bloque pedir 2do num entero positivo
        
        
        
        

        //INICIO Calcular el Máximo Común Divisor (MCD) 
        a = num1; // 15
        b = num2; // 6
        while (b != 0) {
            temp = b; // temp = 6
            b = a % b;// b = 15/6 -> b=3
            a = temp;//a= ??
            
        }
        mcd = a;	
        //FIN Calcular el Máximo Común Divisor (MCD)
        
        System.out.println("El Maximo Comun Divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);

        miTeclado.close();
    }
}


