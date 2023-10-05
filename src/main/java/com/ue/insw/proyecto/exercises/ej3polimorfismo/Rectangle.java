package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    private double base;
    private double altura;

    public Rectangle(double base, double altura){
        this.base=base;
        this.altura=altura;

    }
    public double getbase(){return base;}
    public void setbase(double base){this.base=base;}

    public double getaltura(){return altura;}
    public void setaltura(double altura){this.altura=altura;}

    @Override
    public  double calculatePerimeter(){
        double resperimeter=0;
        resperimeter=altura*base*altura*base;
        return resperimeter;
    }

    @Override
    public double calculateArea() {
        double resArea=0;
        resArea=altura*base;
        return resArea;
    }
    @Override
    public String toString(){
        return null;
    }
}
