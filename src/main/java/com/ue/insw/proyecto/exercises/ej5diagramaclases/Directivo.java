package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado {
    
    // Atributos
    private String categoria;

    /**
     * Constructor de la clase
     * @param nombre Nombre del directivo
     * @param edad Edad del directivo
     * @param sueldo_bruto Sueldo bruto del directivo
     * @param categoria Categoría del directivo
     */
    public Directivo(String nombre, int edad, double sueldo_bruto, String categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    // Getters y setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
