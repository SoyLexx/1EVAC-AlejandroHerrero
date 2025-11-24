package org.example;

import java.util.Scanner;

public class main {

    public static final String NOMBRE = Constantes.NOMBRE1;

    public static void main(String[] args) {

        repo_file Repo = new repo_file();
        Scanner Sc = new Scanner(System.in);
        boolean Salir = false;

        while (!Salir) {
            menu();

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    agenda(Repo);
                    break;

                case "2":
                    dias(Repo, Sc);
                    break;

                case "3":
                    nombre(Repo, Sc);
                    break;

                case "4":
                    cumple(Sc, Repo);
                    break;

                case "5":
                    eliminar(Repo, Sc);
                    break;

                case "6":
                    Salir = isSalir();
                    break;
            }
        }
    }

    private static boolean isSalir() {
        boolean Salir;
        Salir = true;
        return Salir;
    }

    private static void eliminar(repo_file Repo, Scanner Sc) {
        System.out.print(Constantes.NOMBRE1);
        Repo.eliminar_nombre(Sc.nextLine());
    }

    private static void cumple(Scanner Sc, repo_file Repo) {
        System.out.print(NOMBRE);
        String n = Sc.nextLine();
        System.out.print(Constantes.DÍA);
        int d = Integer.parseInt(Sc.nextLine());
        System.out.print(Constantes.MES);
        int m = Integer.parseInt(Sc.nextLine());
        Repo.add_cumple(new cumple_agenda(n, d, m));
    }

    private static void nombre(repo_file Repo, Scanner Sc) {
        System.out.print(NOMBRE);
        cumple_agenda c = Repo.buscar_nombre(Sc.nextLine());
        if (c != null) System.out.println(c.get_nombre());
    }

    private static void dias(repo_file Repo, Scanner Sc) {
        System.out.print(Constantes.DÍA);
        for (cumple_agenda c : Repo.buscar_dia(Integer.parseInt(Sc.nextLine()))) {
            System.out.println(c.get_nombre());
        }
    }

    private static void agenda(repo_file Repo) {
        for (cumple_agenda c : Repo.get_lista()) {
            System.out.println(c.get_nombre());
        }
    }

    private static void menu() {
        System.out.println(Constantes.AGENDA);
        System.out.println(Constantes.LISTAR);
        System.out.println(Constantes.BUSCAR_POR_DÍA);
        System.out.println(Constantes.BUSCAR_POR_NOMBRE);
        System.out.println(Constantes.AÑADIR);
        System.out.println(Constantes.ELIMINAR);
        System.out.println(Constantes.SALIR);
    }
}
