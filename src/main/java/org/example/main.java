package org.example;

import java.util.Scanner;

public class main {

    public static final String NOMBRE = "Nombre: ";

    public static void main(String[] args) {

        repo_file Repo = new repo_file();
        Scanner Sc = new Scanner(System.in);
        boolean Salir = false;

        while (!Salir) {
            System.out.println(Constantes.AGENDA);
            System.out.println(Constantes.LISTAR);
            System.out.println(Constantes.BUSCAR_POR_DÍA);
            System.out.println(Constantes.BUSCAR_POR_NOMBRE);
            System.out.println(Constantes.AÑADIR);
            System.out.println(Constantes.ELIMINAR);
            System.out.println(Constantes.SALIR);

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    for (cumple_agenda c : Repo.get_lista()) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "2":
                    System.out.print(Constantes.DÍA);
                    for (cumple_agenda c : Repo.buscar_dia(Integer.parseInt(Sc.nextLine()))) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "3":
                    System.out.print(NOMBRE);
                    cumple_agenda c = Repo.buscar_nombre(Sc.nextLine());
                    if (c != null) System.out.println(c.get_nombre());
                    break;

                case "4":
                    System.out.print(NOMBRE);
                    String N = Sc.nextLine();
                    System.out.print(Constantes.DÍA);
                    int D = Integer.parseInt(Sc.nextLine());
                    System.out.print(Constantes.MES);
                    int M = Integer.parseInt(Sc.nextLine());
                    Repo.add_cumple(new cumple_agenda(N, D, M));
                    break;

                case "5":
                    System.out.print(Constantes.NOMBRE1);
                    Repo.eliminar_nombre(Sc.nextLine());
                    break;

                case "6":
                    Salir = true;
                    break;
            }
        }
    }
}
