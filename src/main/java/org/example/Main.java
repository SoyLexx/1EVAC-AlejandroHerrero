package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Crea variables para el menú.
         */
        RepoFile repo = new RepoFile();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        /**
         * Imprime el menú en con bucle de salida.
         */

        while (!salir) {
            menu();

            String opcion = sc.nextLine();

            switch (opcion) {
                /**
                 * Caso 1 del menú, imprime el nombre
                 */
                case "1":
                    nombre(repo.getLista());
                    break;
                /**
                 * Caso 2 del menú
                 */
                case "2":
                    pideNombre(repo, sc);
                    break;
                /**
                 * Caso 3 del menú, imprime el nombre
                 */
                case "3":
                    imprimeNombre(repo, sc);
                    break;
                /**
                 * Caso 4 del menú, dice el día
                 */
                case "4":
                    dia(sc, repo);
                    break;
                /**
                 * Caso 5 del menú, elimina el nombre
                 */
                case "5":
                    elimina(repo, sc);
                    break;
                /**
                 * Caso 6 del menú, sale del programa
                 */
                case "6":
                    salir = isSalir();
                    break;
            }
        }
    }

    private static boolean isSalir() {
        boolean salir;
        salir = true;
        return salir;
    }

    private static void elimina(RepoFile repo, Scanner sc) {
        System.out.print("Eliminar nombre: ");
        repo.eliminarNombre(sc.nextLine());
    }

    private static void dia(Scanner sc, RepoFile repo) {
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Día: ");
        int d = Integer.parseInt(sc.nextLine());
        System.out.print("Mes: ");
        int m = Integer.parseInt(sc.nextLine());
        repo.addCumple(new CumpleAgenda(n, d, m));
    }

    private static void imprimeNombre(RepoFile repo, Scanner sc) {
        System.out.print("Nombre: ");
        CumpleAgenda c = repo.buscarNombre(sc.nextLine());
        if (c != null) System.out.println(c.get_nombre());
    }

    private static void pideNombre(RepoFile repo, Scanner sc) {
        System.out.print("Día: ");
        for (CumpleAgenda c : repo.buscarDia(Integer.parseInt(sc.nextLine()))) {
            System.out.println(c.get_nombre());
        }
    }

    private static void nombre(List<CumpleAgenda> repo) {
        for (CumpleAgenda c : repo) {
            System.out.println(c.get_nombre());
        }
    }

    private static void menu() {
        System.out.println("\n=== AGENDA ===");
        System.out.println("1. Listar");
        System.out.println("2. Buscar por día");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Añadir");
        System.out.println("5. Eliminar");
        System.out.println("6. salir");
    }
}
