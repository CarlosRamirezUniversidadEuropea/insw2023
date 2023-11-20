package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        if(lista != null){
            for(String phrase: lista){
                if(phrase.equals(frase)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if(lista != null){
            return lista.contains(palabra);
        }
        return false;
    }

    public String devolverPalabra(List<String> lista, int posicion){
        if(lista != null){
            return lista.get(posicion);
        }
        return null;
    }

    public String devolverPrimerElemento(List<String> lista){
        if(lista != null){
            return lista.get(0);
        }
        return null;
    }

    public String devolverUltimoElemento(List<String> lista){
        if(lista != null){
            return lista.get(lista.size()-1);
        }
        return null;
    }

}
