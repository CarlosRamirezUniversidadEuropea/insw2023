package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle p= new Circle(3.5);
        p.calculateArea();
        p.calculatePerimeter();
        Rectangle c=new Rectangle(20.3,10.5);
        c.calculateArea();
        c.calculatePerimeter();

        System.out.println("EL area del Circulo es: "+p.calculateArea()+" El perimetro es: "+p.calculatePerimeter());
        System.out.println("");
        System.out.println("El area del Rectangulo es : "+c.calculateArea()+"El perimetro es: "+c.calculatePerimeter());

    }
}
