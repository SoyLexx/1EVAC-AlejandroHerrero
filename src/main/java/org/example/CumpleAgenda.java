package org.example;

/**
 * Contiene los datos de la agenda.
 *
 * @author Alejandro Herrero
 */

public class CumpleAgenda {

    /**
     * Variables de la agenda
     */

    private String nombre;
    private int dia;
    private int mes;

    /**
     * Variable del dia y mes
     */
    public CumpleAgenda(String nombre, int dia, int mes) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
    }
    /**
     * Variable del nombre
     */
    public String get_nombre() {
        return nombre;
    }
    /**
     * Variable del dia
     */
    public int get_dia() {
        return dia;
    }
    /**
     * Variable del mes
     */
    public int get_mes() {
        return mes;
    }
}
