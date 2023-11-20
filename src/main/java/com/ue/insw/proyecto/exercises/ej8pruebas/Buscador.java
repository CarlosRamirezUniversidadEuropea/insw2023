package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {

        for (String s : lista) {
            if (frase.equals(s)) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if(lista!=null && palabra!= null){
            return lista.contains(palabra);
        }else{
            return false;
        }
    }

    public String devolverPalabra(List<String> lista, int posicion) throws Exception{
        if(posicion>lista.size()){
            throw new Exception("Index out of bounds exception");
        }
        else if(posicion<0){
            throw new Exception("Posicion negativa, eso no es posible");
        }
        else {
            return lista.get(posicion);
        }
    }

    public String devolverPrimerElemento(List<String> lista){
        if(lista!=null) {
            return lista.get(0);
        }else{
            return "NullPointer exception";
        }
    }

    public String devolverUltimoElemento(List<String> lista){
        if(lista!=null) {
            return lista.get(lista.size()-1);
        }else{
            return "NullPointer exception";
        }
    }

}
