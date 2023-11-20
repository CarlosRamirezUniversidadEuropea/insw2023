package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        for(String phrase: lista){
            if(phrase.equals(frase)){
                return true;
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista) {
        if (lista != null) {
            return lista.contains(palabra);
        }else{
            return false;
        }
    }

    public String devolverPalabra(List<String> lista, int posicion)  {
        if(posicion<=lista.size()-1 && posicion>=0) {
            return lista.get(posicion);
        }
        else{
           return null;
        }

    }

    public String devolverPrimerElemento(List<String> lista){
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista){
        return lista.get(lista.size()-1);
    }

}
