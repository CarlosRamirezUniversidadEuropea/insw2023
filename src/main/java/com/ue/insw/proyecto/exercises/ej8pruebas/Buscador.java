package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        if (lista != null){
            for (String palabra : lista) {
                if (palabra.equals(frase)) {
                    return true;
            }
        }
    }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if (lista != null){
            for (String palabraLista : lista) {
                if (palabraLista.equals(palabra)) {
                    return true;
                }
            }
        }
        return lista.contains(palabra);
    }

    public String devolverPalabra(List<String> lista, int posicion){
        for (int i = 0; i < lista.size(); i++) {
            if (i == posicion){
                return lista.get(i);
            }
        }
        return lista.get(posicion);
    }

    public String devolverPrimerElemento(List<String> lista){
        if (lista == null){
            return null;
        }
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista){
        if (lista == null){
            return null;
        }
        return lista.get(lista.size()-1);
    }

}
