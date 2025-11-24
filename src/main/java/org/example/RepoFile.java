package org.example;

import java.util.ArrayList;
import java.util.List;

public class RepoFile {

    private List<CumpleAgenda> Lista = new ArrayList<>();

    public List<CumpleAgenda> get_lista() {
        return Lista;
    }

    public void add_cumple(CumpleAgenda c) {
        Lista.add(c);
    }

    public CumpleAgenda buscar_nombre(String nombre) {
        for (CumpleAgenda c : Lista) {
            if (c.get_nombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    public List<CumpleAgenda> buscar_dia(int dia) {
        List<CumpleAgenda> resultado = new ArrayList<>();
        for (CumpleAgenda c : Lista) {
            if (c.get_dia() == dia) resultado.add(c);
        }
        return resultado;
    }

    public boolean eliminar_nombre(String nombre) {
        CumpleAgenda encontrado = buscar_nombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
