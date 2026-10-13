import java.util.Random;
import java.util.Scanner;

public class Bucles1 {
    static Scanner sc = new Scanner(System.in);
    static Random rm = new Random();

    /*
     * Ejercicio 1: Realizar un programa que imprima en pantalla
     * los números del 1 al 100. (Debes hacerlo con las tres estructuras
     * iterativas vistas: while, do while y for).
     */
    public static void ejercicio1while() {
        int n = 1;
        while (n <= 100) {
            System.out.println(n++);
        }
    }

    public static void ejercicio1dowhile() {
        int n = 1;
        do {
            System.out.println(n++);
        } while (n <= 100);
    }

    public static void ejercicio1for() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /*
     * Ejercicio 2: Escribir un programa que solicite
     * un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en
     * uno.
     */
    public static void ejercicio2() {
        System.out.println("Introduce un valor positivo");
        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            System.out.println(i);
        }
    }

    /*
     * Ejercicio 3: Desarrollar un programa que permita la carga
     * de 10 valores por teclado y nos muestre posteriormente la suma de los valores
     * ingresados y su promedio.
     */
    public static void ejercicio3() {
        int suma = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Introduzca un valor " + i + ": ");
            int valor = sc.nextInt();
            suma += valor;
        }
        double promedio = (double) suma / 10;
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);
    }

    /*
     * Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
     * o Guarda en una variable tu nombre.
     * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
     * por teclado.
     * o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa
     * debe continuar
     * pidiendo al usuario que lo intente otra vez.
     */
    public static void ejercicio4() {
        String nombreReal = "Daniel";
        String intento;
        boolean acierto = false;

        do {
            System.out.println("---Intenta adivinar mi nombre---");
            intento = sc.nextLine();

            if (intento.equalsIgnoreCase(nombreReal)) {
                System.out.println("Muy bien, lo has adivinado, toma una chapa");
                acierto = true;
            } else {
                System.out.println("Inténtalo de nuevo");
            }
        } while (!acierto);
    }

    /*
     * Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y
     * muestre al usuario el resultado
     * de la tirada. Si los dos dados tienen el mismo número debe mostrar un mensaje
     * indicando que el
     * resultado es el mismo. La aplicación se debe repetir hasta que el usuario
     * indique que no quiere tirar
     * más (preguntando por ‘s’ o ‘n’, o “si” o “no”).
     */
    public static void ejercicio5() throws InterruptedException {
        String seguir;
        int dado1;
        int dado2;

        do {
            dado1 = rm.nextInt(7) + 1;
            dado2 = rm.nextInt(7) + 1;

            if (dado1 == dado2) {
                System.out.println("Ambos dados son iguales: " + dado1);
            } else {
                System.out.println("Resultado del dado 1: " + dado1 + "\nResultado del dado 2: " + dado2);
            }

            do {
                System.out.println("¿Quieres repetir la tirada?");
                seguir = sc.nextLine();

                if (!seguir.equalsIgnoreCase("si") && !seguir.equalsIgnoreCase("no")) {
                    System.out.println("Solo puedes responder con sí o no");
                }
            } while (!seguir.equalsIgnoreCase("si") && !seguir.equalsIgnoreCase("no"));
        } while (seguir.equalsIgnoreCase("si"));
        System.out.println("Saliendo");
        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        System.out.println();
    }

    /*
     * Ejercicio 6: Realizar un juego para adivinar un número. Para ello primero, el
     * programa debe guardar
     * un número en una variable y el usuario debe introducir números hasta
     * acertarlos. Para darle pistas
     * al usuario se le indicará “mayor” o “menor” según sea mayor o menor con
     * respecto al número
     * guardado. El proceso termina cuando el usuario acierta.
     */
    public static void ejercicio6() {
        int nReal = rm.nextInt(100) + 1;
        int respuesta;

        do {
            System.out.println("Intenta adivinar el número");
            respuesta = sc.nextInt();

            if (nReal > respuesta) {
                System.out.println("El número introducido es menor que el número a adivinar");
            }
            if (nReal < respuesta) {
                System.out.println("El número introducido es mayor que el número a adivinar");
            }
        } while (respuesta != nReal);
        System.out.println("¡FELICIDADES! \n El número era: " + nReal);
    }

    /*
     * Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la
     * hora sin parar. Debe
     * esperar un segundo real para darle más realismo. Pasos:
     * o Pide al usuario que introduzca la hora y los minutos.
     * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
     * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
     * cambio de
     * minuto y hora
     * o Muéstralo por pantalla.
     * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
     * durante 1000
     * milisegundos = 1 segundo)
     */
    public static void ejercicio7() {
        int hora;
        int minutos;
        int segundos = 0;

        // Entrada de las horas
        do {
            System.out.println("Introduce la hora (0-23)");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);

        // Entrada de los minutos
        do {
            System.out.println("Introduce los minutos (0-59)");
            minutos = sc.nextInt();
        } while (minutos < 0 || minutos > 59);

        System.out.println("------Reloj Iniciado------");

        while (true) {
            System.out.printf("\rHora actual: %02d:%02d:%02d", hora, minutos, segundos);

            // Para que no de error
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nReloj interrumpido.");
                break;
            }
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    hora++;

                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }
    }

    /*
     * • Ejercicio 8: Escriba un programa que calcule el factorial de un número. El
     * factorial de un número es
     * igual al producto de todos los números enteros positivos desde 1 hasta dicho
     * número.
     */
    public static void ejercicio8() {
        long n;

        do {
            System.out.println("Introduce un número entero, no puede ser negativo");
            n = sc.nextLong();
            if (n < 0) {
                System.out.println("No se puede hacer factorial de un número negativo");
            }
        } while (n < 0);

        long factorial = 1;

        for (long i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    /*
     * Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La
     * altura de la escalera se lee
     * por teclado. Ejemplo: Si introducimos un 5 nos queda:
     *
     **
     ***
     ****
     *****
     * Posteriormente hacer lo mismo, pero con la pirámide invertida.
     */
    public static void ejercicio9() {
        int altura;

        do {
            System.out.println("Introduce la altura de la escalera");
            altura = sc.nextInt();
            if (altura <= 0) {
                System.out.println("Debe ser mayor a 0");
            }
        } while (altura <= 0);

        System.out.println("\n--- Escalera Normal ---");
        for (int i = 1; i <= altura; i++) { // Controla la fila en la que está
            for (int j = 1; j <= i; j++) { // Contador del bucle interno
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }

        System.out.println("\n--- Escalera Invertida ---");
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // ejercicio1while();
        // ejercicio1dowhile();
        // ejercicio1for();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
    }
}
