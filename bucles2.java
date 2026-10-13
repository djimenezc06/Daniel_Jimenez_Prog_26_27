import java.util.Scanner;

public class bucles2 {

    static Scanner sc = new Scanner(System.in);

    /*Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba tantas líneas como diga
    el número y en cada línea escriba desde el número 1 hasta el número introducido.
    Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
    12345
    12345
    12345
    12345
    12345 */
    public static void ejercicio1(){
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en este caso deberá
    escribir los números en orden decreciente, es decir, si introducimos el número 5 deberá mostrar en
    pantalla:
    54321
    54321
    54321
    54321
    54321
    */
    public static void ejercicio2(){
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar de
    imprimir en todas las líneas todos los números desde el 1 hasta el introducido por teclado, en la
    primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así hasta escribir el número
    de líneas indicadas por el usuario.
    Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
    1
    12
    123
    1234
    12345 */
    public static void ejercicio3(){
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de 7 en 7, es decir,
    mostrará 100, 93, 86…0. */
    public static void ejercicio4(){
        for(int i = 100; i >= 0; i-=7){
            System.out.println(i);
        }
    }

    /*Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres leer. Nosotros
    deberemos leer la cantidad de números indicada y calcula el promedio de los valores indicados.
    */
    public static void ejercicio5(){
        System.out.println("¿Cuántos números quieres leer?");
        int cantidad = sc.nextInt();
        double suma = 0;

        for(int i = 1; i <= cantidad; i++){
            System.out.print("Introduce el número " + i + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;
        System.out.println(promedio);
    }

    /*Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si el número es o no
primo. (Los números primos son aquellos que sólo son divisibles por ellos mismos y por la unidad). */
    public static void ejercicio6(){
        System.out.println("Introduce un número para saber si es primo o no");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if(numero <= 1){
            esPrimo = false;
        } else {
            for(int i = 2; i * i <= numero; i++){
                if (numero % i == 0){
                    esPrimo = false;
                    break; //Si encuentra un divisor sale del bucle
                }
            }
        }
        if(esPrimo){
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }

    /*Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0, y nos muestre el
    máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como número introducido, solo
    como valor de salida. */
    public static void ejercicio7(){
        
    }

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
    }
}
