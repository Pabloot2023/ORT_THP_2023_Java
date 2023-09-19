package ej_parcial_1_1;

import java.util.Scanner;

public class Practica_1_Con_Metodos {
    
    static Scanner miTeclado = new Scanner(System.in);
    static String nombre_juego = " ";
    static final int COSTO_RUL = 100;
    static final int COSTO_BJK = 200;
    static final int COSTO_PKR = 500;
    static final int GANANCIA_MAX = 5000;
    static final int MONTO_MINIMO_GUITA = 500;
    static int costo_juego_elegido = 0;
    static int random_num;
    static int guita_jugador;
    static boolean tieneSaldo;
    static boolean puedeSeguirJugando;
    static int guita_min_pa_quedarse = MONTO_MINIMO_GUITA;
    
    public static void main(String[] args) {
        String nombre_jugador = " ";
        int guita_inicial = 0;

        nombre_jugador = iniciarJuego(nombre_jugador);
        guita_inicial = preguntarYValidarSaldo(guita_inicial);
        guita_jugador = cargarSaldo(guita_inicial);

        do {
            nombre_juego = pedirJuego(nombre_juego);
            costo_juego_elegido = asignacionDeCostoSegunJuego();
            
            
        } while (tieneSaldo() && puedeSeguirJugando());
    }

    public static String iniciarJuego(String nombre_jugador) {    
        System.out.println("Ingrese su nombre: ");
        nombre_jugador = miTeclado.nextLine();
        return nombre_jugador;
    }
    
    public static int preguntarYValidarSaldo(int guita_inicial) {        
        System.out.println("Ingrese la cantidad de dinero inicial con que jugara: ");
        guita_inicial = miTeclado.nextInt();
        
        while (guita_inicial < MONTO_MINIMO_GUITA) {
            System.out.println("\n-------ATENCION------------------");
            System.out.println("\nVerifique la cantidad ingresada, el mínimo es $" + MONTO_MINIMO_GUITA);
            System.out.println("Reingrese la cantidad de dinero inicial con que jugara: ");
            guita_inicial = miTeclado.nextInt();
        }
        
        return guita_inicial;
    }

    public static int cargarSaldo(int guita_inicial) {
        return guita_inicial;
    }
    
    public static String pedirJuego(String nombre_juego) {
        
        System.out.println("Elija el tipo de juego ingresando unicamente su alias entre comillas: ");
        System.out.println("Si desea Jugar a la ruleta escriba RUL");
        System.out.println("Si desea Jugar a la Black Jack escriba BJK");
        System.out.println("Si desea Jugar a la Poker escriba PKR");
        nombre_juego = miTeclado.next().toUpperCase(); // Cambiado a miTeclado.next()
        
        nombre_juego = validarJuego(nombre_juego);
        
        return nombre_juego;
    }
            
    public static int asignacionDeCostoSegunJuego() {
        switch (nombre_juego) {
            case "RUL":
                return COSTO_RUL;
            case "BJK":
                return COSTO_BJK;
            case "PKR":
                return COSTO_PKR;
            default:
                return 0;
        }
    }
    
    public static int bloqueJuegoYCalculador(int guita_jugador) {
        guita_jugador = guita_jugador - costo_juego_elegido;

        random_num = (int) (Math.random() * 3); // Cambiado a 3

        switch (random_num) {
            case 2:
                guita_jugador = guita_jugador + costo_juego_elegido * 2;
                break;
            case 1:
                guita_jugador = guita_jugador + costo_juego_elegido * 1;
                break;
            case 0:
                costo_juego_elegido = asignacionDeCostoSegunJuego();
                break;
            default:
                break;
        }
        return guita_jugador;
    }
    
    public static boolean tieneSaldo() {
        return guita_jugador >= COSTO_RUL || guita_jugador >= COSTO_BJK || guita_jugador >= COSTO_PKR; // Cambiado > a >=
    }
    
    public static boolean puedeSeguirJugando() {
        return guita_jugador >= guita_min_pa_quedarse && guita_jugador <= GANANCIA_MAX;
    }
      
    public static String validarJuego(String nombre_juego) {
    //	do {    
	        if (!nombre_juego.equals("RUL") && !nombre_juego.equals("BJK") && !nombre_juego.equals("PKR")) {
	            System.out.println("ATENCION ------ ERROR ------- ATENCION");
	        }
   // } while (!nombre_juego.equals("RUL") && !nombre_juego.equals("BJK") && !nombre_juego.equals("PKR"));

    return nombre_juego;
}
    
}
