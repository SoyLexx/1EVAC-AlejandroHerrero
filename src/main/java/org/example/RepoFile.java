package org.example;
/**
 * Contiene cosas.
 *
 * @author Alejandro Herrero
 */
import java.util.ArrayList;
import java.util.List;

public class RepoFile {
    /**
     *
     */
    private List<CumpleAgenda> lista = new ArrayList<>();

    public List<CumpleAgenda> getLista() {
        return lista;
    }


    public void addCumple(CumpleAgenda c) {
        lista.add(c);
    }

    public CumpleAgenda buscarNombre(String nombre) {
        for (CumpleAgenda c : lista) {
            if (c.get_nombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    public List<CumpleAgenda> buscarDia(int dia) {
        List<CumpleAgenda> resultado = new ArrayList<>();
        for (CumpleAgenda c : lista) {
            if (c.get_dia() == dia) resultado.add(c);
        }
        return resultado;
    }

    public boolean eliminarNombre(String nombre) {
        CumpleAgenda encontrado = buscarNombre(nombre);
        if (encontrado != null) {
            lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
