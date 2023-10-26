package com.ue.insw.proyecto.exercises.ej7json;

/**
 * Clase para las propiedades de los datos de los sensores
 * @author Pablo Ribas Borrego
*/
public class Propiedades {

    // Atributos
    protected String id;
    protected String name;

    /**
     * Constructor de la clase
     * @param id Identificador
     * @param name Nombre
     */
    public Propiedades(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método toString
    @Override
    public String toString() {
        return "ID ~> " + id + " // Nombre ~> " + name;
    }
}