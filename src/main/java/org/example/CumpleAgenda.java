package org.example;

public class CumpleAgenda {

    private String nombre;
    private int dia;
    private int mes;

    public CumpleAgenda(String nombre, int dia, int mes) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
    }

    public String get_nombre() {
        return nombre;
    }

    public int get_dia() {
        return dia;
    }

    public int get_mes() {
        return mes;
    }
}
