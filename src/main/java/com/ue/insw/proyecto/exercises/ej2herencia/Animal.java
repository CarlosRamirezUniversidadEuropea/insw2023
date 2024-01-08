package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal{
    
    private String raza;
    private String nombre;
    private int edad;

    /**
     * 
     * @param raza se refiere a la raza del animal
     * @param nombre se refiere al nombre del animal
     * @param edad se refiere a la edad del animal
     */
    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}
