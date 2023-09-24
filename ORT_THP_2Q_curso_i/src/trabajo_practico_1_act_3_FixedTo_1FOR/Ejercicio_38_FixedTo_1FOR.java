/*Enunciado
38.	Realizá un programa que permita controlar con validación el ingreso a un sitio
 web. Teniendo ya precargados un nombre de usuario ("admin") 
 y una contraseña ("123456"), 
 el programa debe permitir al usuario ingresar sus credenciales. 
 Si las mismas son erróneas, se volverán a pedir hasta un máximo de 3 intentos. 
 Finalmente, la computadora debe mostrar alguno de los siguientes mensajes según 
 sea el caso: "Acceso concedido" o "Se ha bloqueado la cuenta”.
*/

package trabajo_practico_1_act_3_FixedTo_1FOR;
import java.util.Scanner;

public class Ejercicio_38_FixedTo_1FOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "123456";
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese su nombre de usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos--;
                if (intentos == 0) {
                    System.out.println("Se ha bloqueado la cuenta");
                } else {
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + intentos);
                }
            }
        }

        scanner.close();
    }
}


