package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{
    private String nombre;
    private int edad;
    public Human(String raza, String nombre, int edad){
        super(raza,nombre,edad);
    }
    @Override
    public void speak(){
        System.out.println("Hola muy buenas");
    }
    public String toString(){
        return "Human = [Raza: "+getRaza()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Edad: "+getEdad();
    }

}
