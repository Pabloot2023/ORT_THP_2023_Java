package ej_parcial_3;

import java.util.Scanner;

public class Practica_3 {
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);

        final int VUELTAS_TOTALES = 5;
        int vueltasRojo = 0;
        int vueltasVerde = 0;
        int pianitosRojo = 0;
        int acum_pianitosRojo = 0;
        int acum_pianitosVerde = 0;
        int pianitosVerde = 0;
        boolean carreraTerminada = false;
        boolean finalAbrupto = false;
        String Karting = "a";
        double promedioRojo;
        double promedioVerde;
        String kartingMenosPianitos;

        do {
            while (!Karting.equals("R") && !Karting.equals("V") && !Karting.equals("F")) {
                System.out.println("Informe el karting (R/V) o F si es que debieron suspender la carrera");
                Karting = miTeclado.nextLine().toUpperCase();
            }

            if (Karting.equals("R")) {
                vueltasRojo++;
                System.out.println("Ingrese la cantidad de Pianitos para el Karting Rojo");
                pianitosRojo = miTeclado.nextInt();
                miTeclado.nextLine(); // Consumir el carácter de nueva línea
                while (pianitosRojo < 0) {
                    System.out.println("ERROR: Ingrese la cantidad de Pianitos para el Karting Rojo igual o mayor a 0");
                    pianitosRojo = miTeclado.nextInt();
                    miTeclado.nextLine(); // Consumir el carácter de nueva línea
                }
            }

            if (Karting.equals("V")) {
                vueltasVerde++;
                System.out.println("Ingrese la cantidad de Pianitos para el Karting Verde");
                pianitosVerde = miTeclado.nextInt();
                miTeclado.nextLine(); // Consumir el carácter de nueva línea
                while (pianitosVerde < 0) {
                    System.out.println("ERROR: Ingrese la cantidad de Pianitos para el Karting Verde igual o mayor a 0");
                    pianitosVerde = miTeclado.nextInt();
                    miTeclado.nextLine(); // Consumir el carácter de nueva línea
                }
            }

            if (Karting.equals("F") || Karting.equals("f")) {
                finalAbrupto = true;
            }

            if (vueltasRojo >= VUELTAS_TOTALES || vueltasVerde >= VUELTAS_TOTALES) {
                carreraTerminada = true;
            }

            // Reiniciar Karting para la próxima iteración
            Karting = "a";

        } while (!carreraTerminada && !finalAbrupto);

        promedioRojo = (double) pianitosRojo / vueltasRojo;
        promedioVerde = (double) pianitosVerde / vueltasVerde;

        if (promedioRojo < promedioVerde) {
            kartingMenosPianitos = "Rojo!";
        } else {
            kartingMenosPianitos = "Verde!";
        }

        if ((vueltasRojo > vueltasVerde) && !finalAbrupto) {
            System.out.println("Karting ganador: Rojo!");
            System.out.println("Karting con menos pianitos en promedio fue: " + kartingMenosPianitos);
        }

        if ((vueltasVerde > vueltasRojo) && !finalAbrupto) {
            System.out.println("Karting ganador: Verde!");
            System.out.println("Karting con menos pianitos en promedio fue: " + kartingMenosPianitos);
        }

        if (finalAbrupto) {
            kartingMenosPianitos = "Sin datos por carrera suspendida";
            System.out.println("Carrera suspendida, FINAL ABRUPTO!");
            System.out.println("Karting con menos pianitos en promedio fue: " + kartingMenosPianitos);
        }

        miTeclado.close();
    }
}
