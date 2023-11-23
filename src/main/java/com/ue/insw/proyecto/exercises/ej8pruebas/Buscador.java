package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        // CÓDIGO CORREGIDO
        if (lista.size() == 0) {
            return false;
        } else if (lista.size() == 1) {
            return lista.get(0).equals(frase);
        } else {
            String listaString = "";
            for (String word : lista) {
                listaString += word;
            }
            if (listaString.contains(frase)) {
                return true;
            } else {
                listaString = "";
                // Añadimos espacios al concatenar esta vez
                for (String word : lista) {
                    listaString += word + " ";
                }
                if (listaString.contains(frase)) {
                    return true;
                } 
                else {
                    return false;
                }
            }
        }

        /**
         * CÓDIGO ORIGINAL
         * 
         * for(String phrase: lista){
         *   if(phrase.equals(frase)){
         *       return true;
         *   } else {
         *       return false;
         *   }
         * }
         */
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        return lista.contains(palabra);
    }

    public String devolverPalabra(List<String> lista, int posicion){
        return lista.get(posicion);
    }

    public String devolverPrimerElemento(List<String> lista){
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista){
        // CÓDIGO CORREGIDO
        if (lista.size() == 0) {
            return "La lista está vacía";
        } else {
            return lista.get(lista.size() - 1);
        }

        /**
        * CÓDIGO ORIGINAL
        * return lista.get(lista.size());
        */
    }

}
