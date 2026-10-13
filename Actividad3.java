import java.util.Scanner;

public class Actividad3 {
    static Scanner sc = new Scanner(System.in);

    //Ejercicio 1: Construye un programa que 
    // pida dos números al usuario e indique cuál es mayor o si son iguales
    public static void ejercicio1(){
        System.out.println("Introduce el primer número");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.printf("El número %d es mayor que el número %d" ,n1,n2);
        } else if (n2>n1){
            System.out.printf("El número %d es mayor que el número %d" ,n2,n1);
        } 
        else {
            System.out.println("Ambos números son iguales");
        }
    }
    //Ejercicio 2: Construye un programa que pida un número al usuario y nos indique si es par o impar
    public static void ejercicio2(){
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("El número " + n + " es par");
        } else {
            System.out.println("El número "+ n +" es impar");
        }
    }

    //Ejercicio 3: Construye un programa que pida dos números al usuario y muestre el resultado de su 
    // división. Si el segundo número es 0, debe mostrar un mensaje de error.
    public static void ejercicio3(){
        System.out.println("Introduce el primer número");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = sc.nextInt();

        if(n2==0){
            System.out.println("ERROR");
        } else {
            int division = n1/n2;
            System.out.println("El resultado de la división es: " + division);
        }
    }

    /*Ejercicio 4: Construye un programa que pida dos números al usuario. Debe calcular el resultado de
    elevar el primero (base) al segundo (exponente) teniendo en cuenta lo siguiente:
    o Si el exponente es cero el resultado es 1
    o En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la función que
    calcula la potencia)*/
    public static void ejercicio4(){
        System.out.println("Introduce el primer número");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = sc.nextInt();

        if(n2==0){
            System.out.println("Resultado: 1");
        } else {
            double resultado = Math.pow(n1,n2);
            System.out.println("El resultado es: " + resultado);
        }
    }

    /*Ejercicio 5: Construye un programa que exprese si un triángulo es isósceles, equilátero o escaleno y
    si es rectángulo. Para ello debe recibir por teclado 3 valores correspondiente a la medida de sus
    lados. */
    public static void ejercicio5(){
    System.out.println("Introduce el primer valor");
    int lado1 = sc.nextInt();
    System.out.println("Introduce el segundo valor");
    int lado2 = sc.nextInt();
    System.out.println("Introduce el tercer valor");
    int lado3 = sc.nextInt();

    //Comprobar qué tipo de triángulo es
    if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("El triángulo es equilátero");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("El triángulo es isósceles");
    } else {
        System.out.println("El triángulo es escaleno");
    }

    // Comprobar si es rectángulo
    if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3 || lado1 * lado1 + lado3 * lado3 == lado2 * lado2 
        || lado2 * lado2 + lado3 * lado3 == lado1 * lado1) {
        System.out.println("Además, es rectángulo, premio doble loquete");
    }
}


    /*Ejercicio 6: Un instituto está organizando un viaje y te piden que construyas un programa que
        calcule el coste total del viaje y lo que le supone a cada alumno en función de lo siguiente:
        o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
        o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
        o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
        o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total. */
    public static void ejercicio6(){
        System.out.println("Introduce el número de alumnos que asistirán al viaje");
        int alumnos=sc.nextInt();

        if(alumnos>=50){
            System.out.println("El coste será de 40Euros por alumno");
        } if(alumnos>=30 && alumnos<=49){
            System.out.println("El coste será de 48Euros por alumno");
        } if(alumnos>=20 && alumnos<=29){
            System.out.println("El coste será de 56Euros por alumno");
        } if(alumnos<20){
            System.out.println("Deberán abonar un total de 2000Euros entre los que asistan");
        }
    }

    public static void ejercicio6switch(){
        System.out.println("¿Cuántos alumnos asistirán a la excursión?");
        int respuesta = sc.nextInt();
        String alumnos = null;

        if(respuesta>=50){
            alumnos = "Grande";
        } if(respuesta>=30 && respuesta<=49){
            alumnos = "Mediano";
        } if(respuesta>=20 && respuesta<=29){
            alumnos = "Pequeño";
        } if(respuesta<20) {
            alumnos = "Personalizado";
        }
        switch(alumnos){
            case "Personalizado":
                System.out.println("Deberán abonar un total de 2000 EUROS entre los que asistan al viaje, por lo que son: " + (2000/respuesta) + "  EUROS por alumno");
                break;
            case "Mediano": 
                System.out.println("El coste será de 48 EUROS por alumno");
                break;
            case "Pequeño": 
                System.out.println("El coste será de 56 EUROS por alumno");
                break;
            default: //Grupo de 50 o más
                System.out.println("Deberán abonar 40 EUROS por alumno");
                break;
            }
    }

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio6switch();
    }
}
