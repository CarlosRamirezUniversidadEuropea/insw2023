package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle c = new Circle(2.5);
        System.out.println(c.toString());

        Rectangle r = new Rectangle(3,5);
        System.out.println(r);
        /**
         * lanzar excepcion
         * public void setMaxSpeed(int maxSpeed) throws Exception
         * trhow new Exception("la velocidad no puede ser negativa");
         */
    }
}
