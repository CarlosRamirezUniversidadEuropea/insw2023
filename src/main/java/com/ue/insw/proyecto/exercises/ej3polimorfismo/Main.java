package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(2, 3);
       System.out.println(rectangle);

       Circle circle = new Circle(2);
        System.out.println(circle);

    }
}
