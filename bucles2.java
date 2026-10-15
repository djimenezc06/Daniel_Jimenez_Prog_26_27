import java.util.Scanner;

public class bucles2 {

    static Scanner sc = new Scanner(System.in);

    /*
     * Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba
     * tantas líneas como diga
     * el número y en cada línea escriba desde el número 1 hasta el número
     * introducido.
     * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
     * 12345
     * 12345
     * 12345
     * 12345
     * 12345
     */
    public static void ejercicio1() {
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en
     * este caso deberá
     * escribir los números en orden decreciente, es decir, si introducimos el
     * número 5 deberá mostrar en
     * pantalla:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    public static void ejercicio2() {
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar
     * de
     * imprimir en todas las líneas todos los números desde el 1 hasta el
     * introducido por teclado, en la
     * primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así
     * hasta escribir el número
     * de líneas indicadas por el usuario.
     * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void ejercicio3() {
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de
     * 7 en 7, es decir,
     * mostrará 100, 93, 86…0.
     */
    public static void ejercicio4() {
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }

    /*
     * Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres
     * leer. Nosotros
     * deberemos leer la cantidad de números indicada y calcula el promedio de los
     * valores indicados.
     */
    public static void ejercicio5() {
        System.out.println("¿Cuántos números quieres leer?");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;
        System.out.println(promedio);
    }

    /*
     * Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si
     * el número es o no
     * primo. (Los números primos son aquellos que sólo son divisibles por ellos
     * mismos y por la unidad).
     */
    public static void ejercicio6() {
        System.out.println("Introduce un número para saber si es primo o no");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Si encuentra un divisor sale del bucle
                }
            }
        }
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }

    /*
     * Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0,
     * y nos muestre el
     * máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como
     * número introducido, solo
     * como valor de salida.
     */
    public static void ejercicio7() {
        int max = 0;
        int min = 0;
        int contador = 0;
        double suma = 0;
        boolean primerNum = true;

        System.out.println("Introduce un número, introduzca 0 para terminar");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (primerNum) {
                max = numero;
                min = numero;
                primerNum = false;
            } else {
                if (numero > max) {
                    max = numero;
                }
                if (numero < min) {
                    min = numero;
                }
            }
            suma += numero;
            contador++;

            System.out.println("Introduce otro número, introduce 0 para terminar");
            numero = sc.nextInt();
        }
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("---Resultados---");
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se ha introducido ningún número");
        }
    }

    /*
     * Ejercicio 8: Escribe un programa en Java que implemente una calculadora
     * simple. La calculadora
     * debe permitir a los usuarios realizar operaciones matemáticas básicas, como
     * suma, resta,
     * multiplicación y división. El programa deberá mostrar un menú con las
     * siguientes opciones:
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * Programación UT.3: Estructuras de Control
     * Página 2 de 3
     * 5. Es primo (indica si el número introducido es primo o no lo es)
     * 6. Salir
     * Cuando el usuario selecciona una opción (del 1 al 5), el programa debe
     * solicitar los números
     * necesarios para realizar la operación y mostrar el resultado de dicha
     * operación. El programa debe
     * repetir el proceso hasta que el usuario seleccione la opción "Salir".
     */
    public static void ejercicio8() {
        double suma;
        double resta;
        double multiplicar;
        double dividir;
        double n1;
        double n2;
        int respuesta;

        do {

            System.out.println("---Bienvenido, elige qué operación quieres hacer---");
            System.out.println("(1.) Sumar");
            System.out.println("(2.) Restar");
            System.out.println("(3.) Multiplicar");
            System.out.println("(4.) Dividir");
            System.out.println("(5.) Saber si es primo o no");
            System.out.println("(6.) Salir");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Introduce un número");
                    n1 = sc.nextDouble();
                    System.out.println("Introduce otro número");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado de la suma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Introduce un número");
                    n1 = sc.nextDouble();
                    System.out.println("Introduce otro número");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado de la resta: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Introduce un número");
                    n1 = sc.nextDouble();
                    System.out.println("Introduce otro número");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado de la multiplicación: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Introduce un número");
                    n1 = sc.nextDouble();
                    System.out.println("Introduce otro número");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado de la división: " + (n1 / n2));
                    break;
                case 5:
                    boolean esPrimo = true;

                    System.out.println("Introduce un número para saber si es primo");
                    int n = sc.nextInt();
                    if (n <= 1) {
                        esPrimo = false;
                    } else {
                        for (int i = 2; i * i <= n; i++) {
                            if (n % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }
                    if (esPrimo) {
                        System.out.println("El número " + n + " es primo");
                    } else {
                        System.out.println("El número " + n + " no es primo");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Debes introducir un número de los ya dichos");
                    break;
            }
        } while (respuesta != 6);
    }

    /*
     * Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
     * o 1º Pediremos el DNI por teclado al usuario.
     * o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
     * quedándonos con el
     * resto de la división, que debe estar entre 0 y 22.
     * o Comprobaremos en la siguiente tabla, en función del resto obtenido en el
     * paso anterior, cuál
     * es la letra que corresponde
     */
    public static void ejercicio9() {
        char letra = ' ';
        System.out.println("Introduce el número de tu dni para calcular tu letra (Ej: 03454345)");
        int num = sc.nextInt();

        double resto = num % 23;

        switch (resto) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                letra = '?';
                break;
        }
        System.out.println("El DNI completo es: " + dni + "-" + letra);

    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
    }
}
