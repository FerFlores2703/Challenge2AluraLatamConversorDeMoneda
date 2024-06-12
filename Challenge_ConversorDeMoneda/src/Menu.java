import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ConversorMonedas conversor;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.conversor = new ConversorMonedas();
    }

    public void imprimirMenu() {
        System.out.println("*****************************************");
        System.out.println("Elija una opción válida:");
        System.out.println("1) Dólar >> Peso Argentino");
        System.out.println("2) Peso Argentino >> Dólar");
        System.out.println("3) Dólar >> Real Brasileño");
        System.out.println("4) Real Brasileño >> Dólar");
        System.out.println("5) Dólar >> Peso Colombiano");
        System.out.println("6) Peso Colombiano >> Dólar");
        System.out.println("7) Salir");
        System.out.println("*****************************************");
    }

    public void seleccionDeOpcion(int opcion) {
        switch (opcion) {
            case 1:
                conversor.convertirMoneda("USD", "ARS");
                break;
            case 2:
                conversor.convertirMoneda("ARS", "USD");
                break;
            case 3:
                conversor.convertirMoneda("USD", "BRL");
                break;
            case 4:
                conversor.convertirMoneda("BRL", "USD");
                break;
            case 5:
                conversor.convertirMoneda("USD", "COP");
                break;
            case 6:
                conversor.convertirMoneda("COP", "USD");
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida, por favor elija una opción válida.");
                break;
        }
    }
}
