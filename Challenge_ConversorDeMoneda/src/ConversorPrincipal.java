import java.util.Scanner;

public class ConversorPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        int opcion;

        do {
            menu.imprimirMenu();
            opcion = scanner.nextInt();
            menu.seleccionDeOpcion(opcion);
        } while (opcion != 7);

        scanner.close();
    }
}