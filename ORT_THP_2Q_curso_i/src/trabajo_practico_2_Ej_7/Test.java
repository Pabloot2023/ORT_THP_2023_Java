package trabajo_practico_2_Ej_7;

public class Test {

    public static void main(String[] args) {
    	// Caso 1: 
    	// Trabajar en la computadora, encenderla, validar temperatura, validar grabadora, apagar y reiniciar.
        System.out.println("Caso 1:");
        caso1();

        // Caso 2
        // Trabajar en la computadora, encenderla, validar temperatura, validar grabadora, reiniciar, apagar y descansar.
        System.out.println("\nCaso 2:");
        caso2();

        // Caso 3
        // Trabajar en la computadora, reiniciar, apagar, descansar, reiniciar.
        System.out.println("\nCaso 3:");
        caso3();

        // Caso 4
        // Trabajar en la computadora, apagar, encender, validar temperatura, validar grabadora, reiniciar.
        System.out.println("\nCaso 4:");
        caso4();

        // Caso 5
        // Descansar, encender la computadora, trabajar, validar temperatura, validar grabadora, apagar.
        System.out.println("\nCaso 5:");
        caso5();

        // Caso 6
        // Descansar, apagar la computadora, trabajar, validar temperatura, validar grabadora, apagar.
        System.out.println("\nCaso 6:");
        caso6();

        // Caso 7
        // Descansar, reiniciar, apagar, trabajar, encender, validar temperatura, validar grabadora, apagar.
        System.out.println("\nCaso 7:");
        caso7();
        
        // Caso 8
        // 
        System.out.println("\nCaso 8:");
        caso8();
    }

    
    private static void caso1() {
        Persona Persona1 = new Persona("Lionel", "Messi", 12345678);
        Computadora Computadora1 = new Computadora("HP", TipoComputadora.Desktop);
        Procesador unProcesador = new Procesador("Intel", "i7");
        LectoraDVD lectora = new LectoraDVD("Samsung", true);

        Persona1.asignarComputadora(Computadora1);

        // Trabajar
        Persona1.trabajar();

        // Encender la computadora
        Computadora1.encender(Persona1);

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Apagar la computadora
        Computadora1.apagar();

        // Reiniciar la computadora
        Computadora1.reiniciar(Persona1);

        // Descansar
        Persona1.descansar();
    }

    private static void caso2() {
        Persona Persona2 = new Persona("Cristiano", "Ronaldo", 98765432);
        Computadora Computadora2 = new Computadora("Dell", TipoComputadora.Laptop);
        Procesador unProcesador = new Procesador("AMD", "Ryzen");
        LectoraDVD lectora = new LectoraDVD("Sony", true);

        Persona2.asignarComputadora(Computadora2);

        // Trabajar
        Persona2.trabajar();

        // Encender la computadora
        Computadora2.encender(Persona2);

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Reiniciar la computadora
        Computadora2.reiniciar(Persona2);

        // Apagar la computadora
        Computadora2.apagar();

        // Descansar
        Persona2.descansar();
    }

    private static void caso3() {
        Persona Persona3 = new Persona("Julian", "Alvarez", 55555555);
        Computadora Computadora3 = new Computadora("Apple", TipoComputadora.AllInOne);
        Procesador unProcesador = new Procesador("Intel", "i5");

        Persona3.asignarComputadora(Computadora3);

        // Trabajar
        Persona3.trabajar();

        // Reiniciar la computadora
        Computadora3.reiniciar(Persona3);

        // Apagar la computadora
        Computadora3.apagar();

        // Descansar
        Persona3.descansar();

        // Reiniciar la computadora
        Computadora3.reiniciar(Persona3);
    }

    private static void caso4() {
        Persona Persona4 = new Persona("Kylian", "Mbappe", 77777777);
        Computadora Computadora4 = new Computadora("Lenovo", TipoComputadora.Desktop);
        Procesador unProcesador = new Procesador("AMD", "Ryzen");
        LectoraDVD lectora = new LectoraDVD("LG", true);

        Persona4.asignarComputadora(Computadora4);

        // Trabajar
        Persona4.trabajar();

        // Apagar la computadora
        Computadora4.apagar();

        // Encender la computadora
        Computadora4.encender(Persona4);

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Reiniciar la computadora
        Computadora4.reiniciar(Persona4);
    }

    private static void caso5() {
        Persona Persona5 = new Persona("Robert", "Lewandowski", 99999999);
        Computadora Computadora5 = new Computadora("Asus", TipoComputadora.Laptop);
        Procesador unProcesador = new Procesador("Intel", "i9");
        LectoraDVD lectora = new LectoraDVD("Sony", false);

        Persona5.asignarComputadora(Computadora5);

        // Descansar
        Persona5.descansar();

        // Encender la computadora
        Computadora5.encender(Persona5);

        // Trabajar
        Persona5.trabajar();

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Apagar la computadora
        Computadora5.apagar();
    }

    private static void caso6() {
        Persona Persona6 = new Persona("Luis", "Suarez", 11111111);
        Computadora Computadora6 = new Computadora("HP", TipoComputadora.Desktop);
        Procesador unProcesador = new Procesador("Intel", "i7");
        LectoraDVD lectora = new LectoraDVD("Samsung", true);

        Persona6.asignarComputadora(Computadora6);

        // Descansar
        Persona6.descansar();

        // Apagar la computadora
        Computadora6.apagar();

        // Trabajar
        Persona6.trabajar();

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Apagar la computadora
        Computadora6.apagar();
    }
 
    private static void caso7() {
        Persona Persona7 = new Persona("Carlos", "Bilardo", 22222222);
        Computadora Computadora7 = new Computadora("Dell", TipoComputadora.AllInOne);
        Procesador unProcesador = new Procesador("AMD", "Ryzen");
        LectoraDVD lectora = new LectoraDVD("Sony", true);

        Persona7.asignarComputadora(Computadora7);

        // Descansar
        Persona7.descansar();

        // Reiniciar la computadora
        Computadora7.reiniciar(Persona7);

        // Apagar la computadora
        Computadora7.apagar();

        // Trabajar
        Persona7.trabajar();

        // Encender la computadora
        Computadora7.encender(Persona7);

        // Validar temperatura del procesador
        unProcesador.validarTemperatura();

        // Validar si hay lectora de DVD y si puede grabar
        if (lectora != null) {
            lectora.validarGrabadora();
        }

        // Apagar la computadora
        Computadora7.apagar();
    }

    private static void caso8() {
    Persona Persona8 = new Persona("Lionel", "Messi", 12345678);
    Computadora Computadora8 = new Computadora("HP", TipoComputadora.Desktop);
    Procesador unProcesador = new Procesador("Intel", "i7");
    LectoraDVD lectora = new LectoraDVD("Samsung", true);
    
    // Trabajar
    Persona8.trabajar();

    Persona8.asignarComputadora(Computadora8);

    // Trabajar
    Persona8.trabajar();

    // Encender la computadora
    Computadora8.encender(Persona8);

    // Validar temperatura del procesador
    unProcesador.validarTemperatura();

    // Validar si hay lectora de DVD y si puede grabar
    if (lectora != null) {
        lectora.validarGrabadora();
    }

    // Apagar la computadora
    Computadora8.apagar();

    // Reiniciar la computadora
    Computadora8.reiniciar(Persona8);

    // Descansar
    Persona8.descansar();
}
}

/*
 @startuml
class Persona [[java:trabajo_practico_2_act_1_Ejs_7.Persona]] {
    -nombre: String
    -apellido: String
    -dni: int
    -computadora: Computadora
    -descansando: boolean
    +Persona(nombre: String, apellido: String, dni: int)
    +getNombre(): String
    +trabajar(): void
    +descansar(): void
    +despertar(): void
    +asignarComputadora(computadora: Computadora): void
    +isDescansando(): boolean
}

class Computadora [[java:trabajo_practico_2_act_1_Ejs_7.Computadora]] {
    -marca: String
    -tipo: String
    -procesador: String
    -lectoraDVD: boolean
    -encendida: boolean
    +Computadora(marca: String, tipo: String, procesador: String, lectoraDVD: boolean)
    +Computadora(marca: String, tipo: TipoComputadora)
    +getMarca(): String
    +encender(persona: Persona): void
    +apagar(): void
    +reiniciar(persona: Persona): void
}

class Procesador [[java:trabajo_practico_2_act_1_Ejs_7.Procesador]] {
    -marca: String
    -modelo: String
    -temperatura: int
    +Procesador(marca: String, modelo: String)
    +validarTemperatura(): void
}

class LectoraDVD [[java:trabajo_practico_2_act_1_Ejs_7.LectoraDVD]] {
    -marca: String
    -puedeGrabar: boolean
    +LectoraDVD(marca: String, puedeGrabar: boolean)
    +validarGrabadora(): void
}
@enduml

*/