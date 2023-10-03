package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Class Shape is an abstract class that represents a shape: circle, rectangle, etc.
 * It has a color and methods to calculate the perimeter and area of the shape.
 */
public abstract class Shape {

    /**
     * The color of the shape
     */
    private String color;
    
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract String toString();
}
