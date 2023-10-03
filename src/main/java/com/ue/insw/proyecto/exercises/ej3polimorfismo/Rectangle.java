package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Class Rectangle represents a rectangle.
 * It has a base, a height and methods to calculate the perimeter and area of the rectangle.
 */
public class Rectangle extends Shape {

    /**
     * The base of the rectangle
     */
    public int base;
    /**
     * The height of the rectangle
     */
    public int height;


    /**
     * Returns a String representation of the rectangle
     */
    public String toString() {
        return "Rectangle with base: " + base + " and height: " + height;
    }

    /**
     * Constructor of the class Rectangle
     * @param base the base of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Returns the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public double calculatePerimeter() {
        return 2 * (base + height);
    }

    /**
     * Returns the area of the rectangle
     * @return the area of the rectangle
     */
    public double calculateArea() {
        return base * height;
    }
}
