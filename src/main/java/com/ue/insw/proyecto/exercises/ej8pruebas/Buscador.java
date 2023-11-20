package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        if(lista==null)return false;
        for(String phrase: lista){
            if(phrase.equals(frase)){
                return true;
            } 
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if(lista==null){
            return false;
        }
        return lista.contains(palabra);
    }

    public String devolverPalabra(List<String> lista, int posicion){
        if(lista==null){
            return null;
        }
        if(posicion<0 || posicion>=lista.size()){
            return null;
        }
        else{
            return lista.get(posicion);
        }
    }

    public String devolverPrimerElemento(List<String> lista){
        try{
            return lista.get(0);
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String devolverUltimoElemento(List<String> lista){
        if(lista==null||lista.isEmpty()){
            return null;
        }
        else{
            return lista.get(lista.size()-1);
        }
    }

}
