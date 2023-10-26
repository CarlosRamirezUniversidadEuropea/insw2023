package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public abstract class Shape {
    public Shape(String color) {
        this.color = color;
    }

    private String color;
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract String toString();
    public String getColor() {
        return color;
    }

}
