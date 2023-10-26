package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class ObjetoDescripciones {
    
    // Atributos
    protected int type;
    protected int num;
    protected List<Campos> fields;
    protected List<Propiedades> properties;

    /**
     * Constructor de la clase
     * @param type Tipo del sensor
     * @param num Número del sensor
     * @param fields Campos
     * @param properties Propiedades
     */
    public ObjetoDescripciones(int type, int num, List<Campos> fields, List<Propiedades> properties) {
        this.type = type;
        this.num = num;
        this.fields = fields;
        this.properties = properties;
    }

    // Getters y setters
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Campos> getFields() {
        return fields;
    }

    public void setFields(List<Campos> fields) {
        this.fields = fields;
    }

    public List<Propiedades> getProperties() {
        return properties;
    }

    public void setProperties(List<Propiedades> properties) {
        this.properties = properties;
    }

    // Método toString
    @Override
    public String toString() {
        return "Descripción del sensor: Tipo ~> " + type + " // Número ~> " + num + " // Campos ~> " + fields + " // Propiedades ~> " + properties + "\n";
    }
}
