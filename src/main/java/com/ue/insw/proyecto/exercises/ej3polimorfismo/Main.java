package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle c = new Circle();
        System.out.println("el area del circulo es:" + c.calculateArea(2));
        System.out.println("el perimetro del circulo es:" + c.calculatePerimeter(2));
        Rectangle r = new Rectangle();
        System.out.println("el area del rectangulo es:" + r.calculateArea(3,4));
        System.out.println("el perimetro del rectangulo es:" + r.calculatePerimeter(6,4));
    }
}
