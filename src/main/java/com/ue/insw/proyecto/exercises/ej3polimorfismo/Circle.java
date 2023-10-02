package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//class circulo
public class Circle {
    double radio;
    double pi = 3.1416;

    // constructor de circulo
    public Circle(double radius){
        this.radio = radius;
    }
// metodo para calcular el perimetro
    public double calcularPerimetro(){
        return 2*pi*radio;
    }
// metodo para calcular el area
    public double calcularArea(){
        return pi*radio*radio;
    }

}
