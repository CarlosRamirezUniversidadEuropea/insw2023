package com.ue.insw.proyecto.exercises.ej8pruebas;

import java.util.ArrayList;
import java.util.List;

public class BuscadorTest {

    public static void main(String[] args) {
        pruebaCajaBB();
    }

    public static void pruebaCajaBB() {
        Buscador buscador = new Buscador();

        // Pruebas para buscarFrase
        List<String> lista1 = new ArrayList<>();
        lista1.add("Hola");
        lista1.add("Mundo");
        System.out.println(buscador.buscarFrase("Hola", lista1)); // Deberia imprimir true
        System.out.println(buscador.buscarFrase("Adios", lista1)); // Deberia imprimir false

        // Pruebas para buscarPalabra
        List<String> lista2 = new ArrayList<>();
        lista2.add("Java");
        lista2.add("Programacion");
        System.out.println(buscador.buscarPalabra("Java", lista2)); // Deberia imprimir true
        System.out.println(buscador.buscarPalabra("Python", lista2)); // Deberia imprimir false

        // Pruebas para devolverPalabra
        List<String> lista3 = new ArrayList<>();
        lista3.add("Rojo");
        lista3.add("Verde");
        System.out.println(buscador.devolverPalabra(lista3, 1)); // Deberia imprimir "Verde"
        // Añade más pruebas segun las sugerencias mencionadas
        System.out.println(buscador.devolverPalabra(lista3, 0)); // Deberia imprimir "Rojo"
        // Prueba con posicion negativa, deberia imprimir un mensaje de error o lanzar una excepcion segun la implementacion

        // Pruebas para devolverPrimerElemento
        List<String> lista4 = new ArrayList<>();
        lista4.add("A");
        lista4.add("B");
        System.out.println(buscador.devolverPrimerElemento(lista4)); // Deberia imprimir "A"
        // Prueba con lista vacia, deberia manejar esto adecuadamente

        // Pruebas para devolverUltimoElemento
        List<String> lista5 = new ArrayList<>();
        lista5.add("X");
        lista5.add("Y");
        System.out.println(buscador.devolverUltimoElemento(lista5)); // Deberia imprimir "Y"

        lista5.clear();
        System.out.println(buscador.devolverUltimoElemento(lista5)); // Deberia manejar lista vacia
    }
}
