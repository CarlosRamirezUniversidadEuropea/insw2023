package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        return lista != null && lista.contains(frase);
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if(!lista.isEmpty()){
            return lista.contains(palabra);
        }
        return false;
    }

    public String devolverPalabra(List<String> lista, int posicion){
        if(!lista.isEmpty()){
            return lista.get(posicion);
        }
        return null;
    }

    public String devolverPrimerElemento(List<String> lista){
        if(!lista.isEmpty()){
            return lista.get(0);
        }
        return null;
    }

    public String devolverUltimoElemento(List<String> lista){
        return lista.isEmpty() ? null : lista.get(lista.size() - 1);
        // si la lista está vacía devuelve null, si no, devuelve el último elemento
    }

}
