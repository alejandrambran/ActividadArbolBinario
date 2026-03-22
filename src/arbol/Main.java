package arbol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese número: ");
                    int num = scanner.nextInt();
                    arbol.insertar(num);
                    break;

                case 2:
                    System.out.print("Recorrido inorden: ");
                    arbol.inorden();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Número a buscar: ");
                    int buscar = scanner.nextInt();

                    if (arbol.buscar(buscar)) {
                        System.out.println("Número encontrado");
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

