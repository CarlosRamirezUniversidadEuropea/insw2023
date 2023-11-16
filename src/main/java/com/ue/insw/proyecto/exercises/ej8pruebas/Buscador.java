package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    /*public boolean buscarFrase(String frase, List<String> lista) {
        for(String phrase: lista){
            if(phrase.equals(frase)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }*/

    public boolean buscarFrase(String phrase, List<String> list) {
        boolean found = false;
        for (String element : list) {
            if (element.equals(phrase)) {
                found = true;
            }
        }
        return found;
    }


    public boolean buscarPalabra(String palabra, List<String> lista){
        return lista.contains(palabra);
    }

    /*public String devolverPalabra(List<String> lista, int posicion){
        return lista.get(posicion);
    }*/

    public String devolverPalabra(List<String> list, int position){
        String word = "";
        if (list == null) {
            word = "Lista vacía";
        } else if (list.isEmpty()) {
            word = "Lista vacía";
        } else {
            if (position > list.size()) {
                word = "Posición no válida";
            } else {
                word = list.get(position);
            }
        }
        return word;
    }

    /*public String devolverPrimerElemento(List<String> lista){
        return lista.get(0);
    }*/
    public String devolverPrimerElemento(List<String> list){
        String word = "";
        if (list == null) {
            word = "Lista vacía";
        } else if (list.isEmpty()) {
            word = "Lista vacía";
        } else {
            word = list.get(0);
        }
        return word;
    }

    /*public String devolverUltimoElemento(List<String> lista){
        return lista.get(lista.size());
    }*/
public String devolverUltimoElemento(List<String> list){
        String word = "";
        if (list == null) {
            word = "Lista vacía";
        } else if (list.isEmpty()) {
            word = "Lista vacía";
        } else {
            word = list.get(list.size() - 1);
        }
        return word;
    }


}
