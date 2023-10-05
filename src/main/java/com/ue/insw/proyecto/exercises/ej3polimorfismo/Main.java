package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(2, 3, "black");
       System.out.println(rectangle);

       Circle circle = new Circle(2, "White");
        System.out.println(circle);

    }
}
