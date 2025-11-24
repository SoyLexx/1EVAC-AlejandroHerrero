package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RepoFile repo = new RepoFile();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== AGENDA ===");
            System.out.println("1. Listar");
            System.out.println("2. Buscar por día");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Añadir");
            System.out.println("5. Eliminar");
            System.out.println("6. salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (CumpleAgenda c : repo.getLista()) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "2":
                    System.out.print("Día: ");
                    for (CumpleAgenda c : repo.buscarDia(Integer.parseInt(sc.nextLine()))) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "3":
                    System.out.print("Nombre: ");
                    CumpleAgenda c = repo.buscarNombre(sc.nextLine());
                    if (c != null) System.out.println(c.get_nombre());
                    break;

                case "4":
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    System.out.print("Día: ");
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print("Mes: ");
                    int m = Integer.parseInt(sc.nextLine());
                    repo.addCumple(new CumpleAgenda(n, d, m));
                    break;

                case "5":
                    System.out.print("Eliminar nombre: ");
                    repo.eliminarNombre(sc.nextLine());
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }
}
