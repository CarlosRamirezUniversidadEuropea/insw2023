package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado{
    /**
     * Category of the manager
     */
    private String categoria;

    /**
     * Constructor
     * @param name Name of the manager
     * @param age Age of the manager
     * @param salary Salary of the manager
     * @param category Category of the manager
     */
    public Directivo(String name, int age, int salary, String category) {
        super(name, age, salary);
        this.categoria = category;
    }

    /**
     * To string method to print the object
     */
    @Override
    public String toString() {
        return "Directivo{" + "name=" + super.getNombre() + ", age=" + super.getEdad() + ", salary=" + super.getSueldo_bruto() + ", category=" + categoria + '}';
    }

    /**
     * Getter for the category of the manager
     * @return Category of the manager
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Setter for the category of the manager
     * @param category Category of the manager
     */
    public void setCategoria(String category) {
        this.categoria = category;
    }
}
