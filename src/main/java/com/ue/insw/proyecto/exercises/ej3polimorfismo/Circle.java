package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Class Circle represents a circle.
 * It has a radius and methods to calculate the perimeter and area of the circle.
 */
public class Circle extends Shape {

    /**
     * The radius of the circle
     */
    public int radius;
    /**
     * Returns a String representation of the circle
     */
    public String toString() {
        return "Circle with radius: " + radius;
    }

    /**
     * Constructor of the class Circle
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Returns the perimeter of the circle
     * @return the perimeter of the circle
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns the area of the circle
     *  @return the area of the circle
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
}
