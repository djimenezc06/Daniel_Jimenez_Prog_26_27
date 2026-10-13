import java.util.Scanner;

public class Condicionales2 {
    static Scanner sc = new Scanner(System.in);

    // Ejercicio 1: Escribe un programa que pida un número y diga si es o no
    // múltiplo de 3.
    public static void ejercicio1() {
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        if (n % 3 == 0) {
            System.out.println("El número introducido es múltiplo de 3");
        } else {
            System.out.println("El número introducido no es múltiplo de 3");
        }
    }

    // Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y
    // calcula y muestra el
    // mayor de los tres.
    public static void ejercicio2() {
        System.out.println("Introduce el primer número");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número: " + n1 + " es el mayor de los 3 introducidos");
        } else if (n1 < n2 && n2 > n3) {
            System.out.println("El número: " + n2 + " es el mayor de los 3 introducidos");
        } else {
            System.out.println("El número: " + n3 + " es el mayor de los 3 introducidos");
        }
    }

    /*
     * Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H,
     * M, S correspondientes
     * a hora, minutos y segundos respectivamente, y comprueba si la hora que
     * indican es una hora válida.
     * Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
     * para las horas será
     * mayor o igual que cero y menor que 24. El valor válido para los minutos y
     * segundos estará
     * comprendido entre 0 y 59 ambos incluidos.
     */
    public static void ejercicio3() {
        System.out.println("Introduce la hora");
        int h = sc.nextInt();
        System.out.println("Introduce los minutos");
        int m = sc.nextInt();
        System.out.println("Introduce los segundos");
        int s = sc.nextInt();

        if (h >= 00 && h <= 24 && m >= 00 && m <= 59 && s >= 00 && s <= 59) {
            System.out.println("Hora: \n" + h + ":" + m + ":" + s);
        } else {
            System.out.println("Algun/os de los datos introducidos es incorrecto, recuerde que el formato es 24h");
        }
    }

    /*
     * Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10,
     * y muestre en pantalla
     * el nombre en letras de ese número. Se debe controlar que se introduzca un
     * número válido.
     */
    public static void ejercicio4() {
        System.out.println("Introduce un número del 0 al 10");
        int n = sc.nextInt();

        // Los números están en alemán, por entretenerme algo
        switch (n) {
            case 0:
                System.out.println("Null");
                break;
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println("Drei");
                break;
            case 4:
                System.out.println("Vier");
                break;
            case 5:
                System.out.println("Fünf");
                break;
            case 6:
                System.out.println("Sechs");
                break;
            case 7:
                System.out.println("Sieben");
                break;
            case 8:
                System.out.println("Acht");
                break;
            case 9:
                System.out.println("Neun");
                break;
            case 10:
                System.out.println("Zehn");
                break;
            default:
                System.out.println(n + " tortazos te voy a dar\n Repite padre, del 1 al 10");
                break;
        }
    }

    /*
     * Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es
     * decir pide un número en
     * letras y enseña un número.
     * Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo
     * tanto, para que el
     * programa funcione correctamente deberías pasar todas las letras del nombre
     * del número a
     * mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que
     * nos permite realizar ese
     * cambio.
     */
    public static void ejercicio5() {
        System.out.println("Escribe un número del 1 al 10, no puedes introducir el número directamente (ejemplo: uno)");
        String numero = sc.nextLine().toLowerCase();

        switch (numero) {
            case "cero":
                System.out.println("0");
                break;
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;
            case "diez":
                System.out.println("10");
                break;
            default:
                System.out.println("Del 1 al 10 coño");
                break;
        }
    }

    /*
     * Ejercicio 6: Escribe un programa que lea una variable entera mes y compruebe
     * si el valor
     * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
     * 28 días. Se
     * mostrará además el nombre del mes.
     * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12
     */
    public static void ejercicio6() {
        System.out.println("Introduce un mes del año, del 1 al 12");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Spooky season tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("No has introducido un mes válido");
        }
    }

    /*
     * Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones, y
     * si están aprobadas
     * realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si
     * no, escribe que evaluación
     * debe recuperar.
     */
    public static void ejercicio7() {
        System.out.println("Introduce la nota de la primera evaluación");
        int primera = sc.nextInt();
        System.out.println("Introduce la nota de la segunda evaluación");
        int segunda = sc.nextInt();
        System.out.println("Introduce la nota de la tercera evaluación");
        int tercera = sc.nextInt();
        int suma = primera + segunda + tercera;
        int resultado = suma / 3;

        if (primera >= 5 && segunda >= 5 && tercera >= 5) {
            System.out.println("La nota final es de: " + resultado + "\n Felicidades, has aprobado todo");
        } else if (primera < 5 && segunda >= 5 && tercera >= 5) {
            System.out.println("Debes recuperar la primera evaluación");
        } else if (primera >= 5 && segunda < 5 && tercera >= 5) {
            System.out.println("Debes recuperar la segunda evaluación");
        } else if (primera >= 5 && segunda >= 5 && tercera < 5) {
            System.out.println("Debes recuperar la tercera evaluación");
        } else if (primera < 5 && segunda < 5 && tercera >= 5) {
            System.out.println("Debes recuperar la primera y segunda evaluación");
        } else if (primera < 5 && segunda >= 5 && tercera < 5) {
            System.out.println("Debes recuperar la primera y la tercera evaluación");
        } else if (primera >= 5 && segunda < 5 && tercera < 5) {
            System.out.println("Debes recuperar la segunda y la tercera evaluación");
        } else {
            System.out.println("No has aprobado ni mielda, a recuperar todo");
        }
    }

    /*
     * Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe
     * pedir el número de
     * horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir
     * de ahí, las restantes
     * horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total
     * del sueldo.
     */
    public static void ejercicio8() {
        System.out.println("Introduce el número de horas trabajadas este mes");
        int horas = sc.nextInt();
        int sueldo;

        if (horas <= 150) {
            sueldo = 150 * 10;
            System.out.println("El salario del trabajador será de: " + sueldo + " EUROS");
        } else {
            // Multiplica las primeras 150 horas por 10, después, resta las horas que ha
            // echado, menos 150 iniciales,
            // Y el resto se multiplica por 20, ambos resultados se suma y da su salario
            sueldo = (150 * 10) + ((horas - 150) * 20);
            System.out.println("El salario del trabajador será de: " + sueldo + " EUROS");
        }
    }

    /*
     * Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber
     * permitir aceptar años
     * negativos. Un año es bisiesto si cumple una de las siguientes reglas:
     * 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
     * 2. Divisible entre 4, NO divisible entre 100.
     */
    public static void ejercicio9() {
        System.out.println("Introduce un año (Ej: 1997)");
        int año = sc.nextInt();

        if (año % 4 == 0 && año % 100 == 0 && año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
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
        // ejercicio9();
    }
}
