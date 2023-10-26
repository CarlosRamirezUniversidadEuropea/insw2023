package com.ue.insw.proyecto.exercises.ej3polimorfismo;
//todo extends shope
public class Rectangle{

        private double width;
        private double height;


        public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        }

        public double calculatePerimeter() {
            return 2 * (width + height);
        }

        public double calculateArea() {
            return width * height;
        }

@Override
public String toString() {return "Rectangle with width " + width + " and heigh " + height;
        }

}