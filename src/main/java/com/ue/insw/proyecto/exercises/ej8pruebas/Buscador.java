package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        for(String phrase: lista){
            if(phrase.equals(frase)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){

        return lista.contains(palabra); //devuelve la palabra que contenga la lista
    }

    public String devolverPalabra(List<String> lista, int posicion){

        return lista.get(posicion); //devuelve la palabra de la posicion que le hayamos introducido
    }

    public String devolverPrimerElemento(List<String> lista){

        return lista.get(0); //devuelve el elememto de la primera posicion
    }

    public String devolverUltimoElemento(List<String> lista){

        return lista.get(lista.size()-1); //devuelve el size del array, que seria 3, y le resta 1 posicion para que devuelva el ultimo elemento
    }

}
