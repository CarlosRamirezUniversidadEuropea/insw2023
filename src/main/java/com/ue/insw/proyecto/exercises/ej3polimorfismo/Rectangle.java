package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//clase rectangulo
public class Rectangle {
    double base;
    double altura;


    //constructor de rectangulo
    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //metodo para calcular el perimetro
    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }

    //metodo para calcular el area
    public double calcularArea(){
        return base*altura;
    }

}
