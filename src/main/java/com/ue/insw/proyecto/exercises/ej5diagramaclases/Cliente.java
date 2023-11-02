package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona{
    /**
     * Name of the company
     */
    private String empresa;
    
    /**
     * Phone number to contact the client
     */
    private int telefono_de_contacto;

    /**
     * Constructor
     * @param name Name of the client
     * @param age Age of the client
     * @param company Name of the company
     * @param phone Phone number to contact the client
     */
    public Cliente(String name, int age, String company, int phone) {
        super(name, age);
        this.empresa = company;
        this.telefono_de_contacto = phone;
    }

    /**
     * To string method to print the object
     */
    public String mostrar() {
        return "Cliente{" + "name=" + getNombre() + ", age=" + getEdad() + ", company=" + empresa + ", phone=" + telefono_de_contacto + '}';
    }

    /**
     * Getter for the name of the company
     * @return Name of the company
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Setter for the name of the company
     * @param company Name of the company
     */
    public void setEmpresa(String company) {
        this.empresa = company;
    }

    /**
     * Getter for the phone number to contact the client
     * @return Phone number to contact the client
     */
    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    /**
     * Setter for the phone number to contact the client
     * @param phone Phone number to contact the client
     */
    public void setTelefono_de_contacto(int phone) {
        this.telefono_de_contacto = phone;
    }
}