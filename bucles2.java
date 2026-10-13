import java.util.Scanner;

public class Bucles2 {

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

        for(int i = 1; i >= n; i--){
            for(int j = 1; j >= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
    }
}
