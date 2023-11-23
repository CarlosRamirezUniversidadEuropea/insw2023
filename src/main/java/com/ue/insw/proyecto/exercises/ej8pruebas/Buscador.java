package com.ue.insw.proyecto.exercises.ej8pruebas;
import java.util.List;

public class Buscador {
    public boolean buscarFrase(String frase, List<String> lista) {
        if (frase == null || lista == null) {
            return false;
        }
        for (String phrase : lista) {
            if (frase.equals(phrase)) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista) {
        return lista.contains(palabra);
    }

    public String devolverPalabra(List<String> lista, int posicion) {
        if (lista == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }
        if (posicion < 0 || posicion >= lista.size()) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }
        return lista.get(posicion);
    }

    public String devolverPrimerElemento(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista es nula o esta vacía");
        }
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista es nula o esta vacía");
        }
            return lista.get(lista.size() - 1);
    }
}
