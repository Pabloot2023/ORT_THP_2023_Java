package ej_parcial_2;

import java.util.Scanner;

public class Practica_2 {

    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);

        final String jugador1 = "Ana";
        final String jugador2 = "Bartolo";
        int Eleccion;
//        int Comparador;
        String Tipo1 = "Piedra";
        String Tipo2 = "Piedra";
        int puntajeLimite;
        int puntaje_J1 = 0;
        int puntaje_J2 = 0;
        String Mensaje = "Piedra";
        String ganador_ronda = "Piedra";

        // INICIO Definir puntaje maximo
        do {
            System.out.println("Ingresen a cuantos puntos se juega la partida");
            puntajeLimite = miTeclado.nextInt();
        } while (puntajeLimite < 0);
        // FIN Definir puntaje maximo

        do {
            // INICIO bloque seleccion de mano ANA
            do {
                System.out.println(jugador1 + " por favor elija su mano opcion a jugar");
                System.out.println("Si desea elejir Piedra presiones el numero 0");
                System.out.println("Si desea elejir Papel presiones el numero 1");
                System.out.println("Si desea elejir Tijera presiones el numero 2");
                Eleccion = miTeclado.nextInt();

                switch (Eleccion) {
                    case 0:
                        Tipo1 = "Piedra";
                        break;
                    case 1:
                        Tipo1 = "Papel";
                        break;
                    case 2:
                        Tipo1 = "Tijera";
                        break;
                    default:
                        System.out.print("Solamente se puede ingresa 0, 1 o 2");
                        break;
                }

            } while (Eleccion != 0 && Eleccion != 1 && Eleccion != 2);
            // FIN bloque seleccion de mano ANA

            // INICIO bloque seleccion de mano BARTOLO
            do {
                System.out.println(jugador2 + " por favor elija su mano opcion a jugar");
                System.out.println("Si desea elejir Piedra presiones el numero 0");
                System.out.println("Si desea elejir Papel presiones el numero 1");
                System.out.println("Si desea elejir Tijera presiones el numero 2");
                Eleccion = miTeclado.nextInt();

                switch (Eleccion) {
                    case 0:
                        Tipo2 = "Piedra";
                        break;
                    case 1:
                        Tipo2 = "Papel";
                        break;
                    case 2:
                        Tipo2 = "Tijera";
                        break;
                    default:
                        System.out.print("Solamente se puede ingresa 0, 1 o 2");
                        break;
                }

            } while (Eleccion != 0 && Eleccion != 1 && Eleccion != 2);
            // FIN bloque seleccion de mano BARTOLO

            // INICIO bloque comparador y asignador
            if (Tipo1.equals(Tipo2)) {
                Mensaje = "EMPATE";
                puntaje_J1 = puntaje_J1 + 0;
                puntaje_J1 = puntaje_J1 + 0;
                ganador_ronda = "EMPATE";
            } else if (Tipo1.equals("Piedra") && Tipo2.equals("Tijera")) {
                Mensaje = jugador1;
                puntaje_J1++;
                ganador_ronda = jugador1;
            } else if (Tipo1.equals("Papel") && Tipo2.equals("Piedra")) {
                Mensaje = jugador1;
                puntaje_J1++;
                ganador_ronda = jugador1;
            } else if (Tipo1.equals("Tijera") && Tipo2.equals("Papel")) {
                Mensaje = jugador1;
                puntaje_J1++;
                ganador_ronda = jugador1;
            } else if (Tipo2.equals("Piedra") && Tipo1.equals("Tijera")) {
                Mensaje = jugador2;
                puntaje_J2++;
                ganador_ronda = jugador2;
            } else if (Tipo2.equals("Papel") && Tipo1.equals("Piedra")) {
                Mensaje = jugador2;
                puntaje_J2++;
                ganador_ronda = jugador2;
            } else if (Tipo2.equals("Tijera") && Tipo1.equals("Papel")) {
                Mensaje = jugador2;
                puntaje_J2++;
                ganador_ronda = jugador2;
            }
            // Fin bloque comparador y asignador

            // INICIO bloque impresion resultados de partida
            System.out.println("Ganador de la Partida: " + ganador_ronda);
            // FIN bloque impresion resultados de partida

        } while (puntaje_J1 < puntajeLimite && puntaje_J2 < puntajeLimite);
        
//        if (puntaje_J1 == puntajeLimite) {
//        	System.out.println("Ganador de la partida: " + jugador1);
//        } else if (puntaje_J2 == puntajeLimite) {
//        	System.out.println("Ganador de la partida: " + jugador2);
//        }
        
        miTeclado.close();
    }

}
