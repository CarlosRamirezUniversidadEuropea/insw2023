package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //Todo crear circulo y rectangulo y calcular su area y perimetro
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,6);

        System.out.println("Circle perimeter:"+circle.calculatePerimeter());
        System.out.println("Circle area:"+circle.calculateArea());
        System.out.println("Rectangle perimeter:"+ rectangle.calculatePerimeter());
        System.out.println("Rectangle area:" + rectangle.calculateArea());
    }
}
