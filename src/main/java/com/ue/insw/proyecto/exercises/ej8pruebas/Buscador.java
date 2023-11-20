package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.List;

public class Buscador {

    public boolean buscarFrase(String frase, List<String> lista) {
        for(int i = 0;i<lista.size();i++) {
            if(lista.get(i).equals(frase)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        if(lista == null){
            return false;
        }else{
        return lista.contains(palabra);}
    }

    public String devolverPalabra(List<String> lista, int posicion){
        return lista.get(posicion);
    }

    public String devolverPrimerElemento(List<String> lista){
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista){
        return lista.get(lista.size()-1);
    }

}
