package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public abstract class Shape {

    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract String toString();
}
