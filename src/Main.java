import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void sumaNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
    }

    public static void parImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }

    public static void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        System.out.println("Tabla de multiplicar en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("Tabla de multiplicar en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void bonusSecreto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una serie de números enteros (termina con un número negativo):");
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        if (max == Integer.MIN_VALUE || min == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            System.out.println("El número más grande es: " + max);
            System.out.println("El número más pequeño es: " + min);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("0. Bonus secreto");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    bonusSecreto();
                    break;
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaNumeros();
                    break;
                case 3:
                    parImpar();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    tablaMultiplicar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}
