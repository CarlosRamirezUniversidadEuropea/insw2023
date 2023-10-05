package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
    public class Rectangle extends Shape {
    private double lado1;
    private double lado2;

    public Rectangle(){
    }
    public  Rectangle (double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;


}
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calculatePerimeter() {
        double perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        double area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo [El perimetro es = " + calculatePerimeter() +
                "] [El area es = "  + calculateArea() + "]";
    }
}