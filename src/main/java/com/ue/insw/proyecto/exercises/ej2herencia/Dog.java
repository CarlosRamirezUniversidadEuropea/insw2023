package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak {
    // todo complete extends Animal implements speak, override methods
    public Dog(String raza, String nombre, int edad){
        super(raza,nombre,edad);
    }
    @Override
    public void speak(){
        System.out.println("Guau Guau");
    }
    public String toString(){
        return "Dog = [Raza: "+getRaza()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Edad: "+getEdad();
    }
}
