import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Ingresa 3 parametros, de ellos se muestra el mayor");
        System.out.println("2. Ingresa 3 parametros de texto, mostrar por pantalla el texto concatenado");
        System.out.println("3. Tabla de multiplicar con el numero ingresado por el usuario");
        System.out.println("4. Metodo que recibe 2 numeros y un operador y que devuelve el resultado");
        System.out.println("5. Determinar si un numero ingresado es primo o no");
        System.out.println("6. Lista de estudiantes");
        System.out.println("7. Recorrer lista");
        System.out.println("8. Salir");

        System.out.print("Selecciona una opción (1-6): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                numeroMayor(scanner);
                break;

            case 2:
                concatenarTexto(scanner);
                break;

            case 3:
                tablaDeMultiplicar(scanner);
                break;

            case 4:
                metodoNumerosOperador(scanner);
                break;

            case 5:
                numeroPrimo(scanner);
                break;

            case 6:
                lista(scanner);
                break;

            case 7:
                recorrerLista(scanner);
                break;

            case 8:
                System.out.println("¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Inténtalo nuevamente.");
        }


        ExamenFinalVarianteC numeroMayor = new ExamenFinalVarianteC();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double maximo = Math.max(numero, Math.max(num2, num3));
        System.out.println("El mayor número es: " + maximo);

    }

}
