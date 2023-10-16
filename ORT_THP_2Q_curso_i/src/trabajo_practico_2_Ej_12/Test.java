package trabajo_practico_2_Ej_12;

public class Test {

	public static void main(String[] args) {
		 Calculadora calculadora = new Calculadora();
		 
	        int a = 1;
	        int b = 2;

	        // Realizar las operaciones y mostrar los resultados
	        System.out.println("Operación a + b: " + calculadora.sumar(a, b)); // Resultado esperado: 3
	        System.out.println("Operación a - b: " + calculadora.restar(a, b)); // Resultado esperado: -1
	        System.out.println("Operación b - a: " + calculadora.restar(b, a)); // Resultado esperado: 1
	        System.out.println("Operación a * b: " + calculadora.multiplicar(a, b)); // Resultado esperado: 2
	        System.out.println("Operación a / b: " + calculadora.dividir(a, b)); // Resultado esperado: 0
	        System.out.println("Operación b / a: " + calculadora.dividir(b, a)); // Resultado esperado: 2
	        System.out.println("Operación a / 0: " + calculadora.dividir(a, 0)); // Resultado esperado: 0
	        System.out.println("Operación b / 0: " + calculadora.dividir(b, 0)); // Resultado esperado: 0
	        System.out.println("Operación 0 / a: " + calculadora.dividir(0, a)); // Resultado esperado: 0
	        System.out.println("Operación 0 / b: " + calculadora.dividir(0, b)); // Resultado esperado: 0
	    }

	}


