import java.util.Scanner;
import java.lang.Math;

public class Actividad2{

    static Scanner sc = new Scanner(System.in);
    //Ejercicio 1 Pide por teclado un String preguntando 
    // por tu nombre, después muestra un mensaje de bienvenida 
    // por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”. 
    public static void ejercicio1(){
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido, " + nombre);
    }

    //Ejercicio 2 Pedir dos números y 
    // realizar operaciones básicas de suma, resta y multiplicación, enseñando el resultado. 
    public static void ejercicio2(){
        System.out.println("Introduce el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int n2 = sc.nextInt();
        int suma = n1+n2;
        int resta = n1-n2;
        int mult = n1*n2;
        System.out.println("Resultado de la suma: " + suma + "\nResultado de la resta: " + resta + "\nResultado de la multiplicacion: " + mult);
    }

    //Ejercicio 3 Pedir un número calcular su raíz cuadra. 
    public static void ejercicio3(){
        System.out.println("Introduce un numero para ver su raiz cuadrada");
        double n = sc.nextDouble();
        System.out.println("La raiz cuadrada de " + n + " es: " + Math.sqrt(n));
    }

    //Ejercicio 4 Pedir dos números (base y exponente) y calcular la potencia. 
    public static void ejercicio4(){
        System.out.println("Introduce el primer numero (base)");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero (exponente)");
        int n2 = sc.nextInt();
        System.out.println("La potencia es: " + Math.pow(n1, n2));
    }

    //Ejercicio 5 Pedir el radio de un circulo y calcular su área. (A=pi*r^2) 
    // (Podemos usar Math.PI para el valor de pi o poner directamente el valor) 
    public static void ejercicio5(){
        System.out.println("Introduce el radio del circulo");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    //Ejercicio 6      Pedir el radio de una circunferencia y calcular su longitud.(L=2+pi*r) 
    public static void ejercicio6(){
        System.out.println("Introduce el radio de una circunferencia");
        double radio = sc.nextDouble();
        double longitud = 2 + Math.PI * radio;
        System.out.println("La longitud de la circunferencia es de: " + longitud);
    }

    //Ejercicio 7   Pedir un password y comprobar si es igual que 
    // un String definido en el programa. Enseñar el resultado por pantalla. 
    public static void ejercicio7(){
        String contReal = "17112003D";
        String contraseña;
        do{
            System.out.println("Introduce la contraseña");
            contraseña = sc.nextLine();

            if(!contraseña.equals(contReal)){
                System.out.println("Contraseña incorrecta, intentelo de nuevo");
            }
        } while (!contraseña.equals(contReal));
        System.out.println("Bienvenido, usuario");
    }

    //Ejercicio 8      Pedir una frase y enseñar por pantalla, 
    // la longitud, la primera y última letra. 
    // Pista: La función substring nos permite extraer una subcadena de una cadena. 
    public static void ejercicio8(){
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        int longitud = frase.length();
        char primera = frase.charAt(0);
        char ultima = frase.charAt(frase.length()-1);
        System.out.println("La longitud de la frase es de: " + longitud + " caracteres. \nLa primera letra es: " + primera + "\nY la ultima letra es: " + ultima);
    }

    //Ejercicio9 Pedir una frase con la palabra amigo y mostrarla por pantalla
    public static void ejercicio9(){
        System.out.println("Introduce una frase que contenga la palabra (amigo)");
        String frase = sc.nextLine();

        int posicion = frase.indexOf("amigo");

        String palabra = frase.substring(posicion, posicion+"amigo".length());

        System.out.println("La palabra encontrada es: " + palabra);
    }

    public static void main(String [] arg) throws Exception{
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
    }
}