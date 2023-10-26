package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radioC;

    public Circle(String color, double radio){ // la clase toma el radio como parametro
        super(color);// Llama al constructor de la clase base para inicializar el atributo color
        this.radioC = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radioC, 2);
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radioC;
    }
    @Override
    public String toString() {
        return "Circle [color= " + getColor() + ", radio=" + radioC + "]";
    }
}
