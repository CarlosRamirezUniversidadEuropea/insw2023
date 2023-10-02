package com.ue.insw.proyecto.exercises.ej0documentation;

/**
 * This class contains the attributes and methods of a Person
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Persona
 */
public class Persona {

    private int edad; // age
    private String nombre; // name
    private char sexo; // gender
    
    /**
     * Parameterized constructor method
     * @param nombre Employee name
     * @param edad Employee age
     * @param sexo Employee gender in H or M format
     */
	public Persona(String nombre, int edad, char sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	 /**
     * Default constructor method
     */
	public Persona() {}


     /**
      * Returns a string representation of the object.
      * @return a string representation of the object.
      */
     @Override
     public String toString() {
          return "Persona{" +
                    "edad=" + edad +
                    ", nombre='" + nombre + '\'' +
                    ", sexo=" + sexo +
                    '}';
     }

    /**
     * Method to return the age of the person
     * @return Returns the age of the person
     */
	public int getEdad() {
		return edad;
	}

	/**
     * Method that assigns the age to a person
     * @param edad, the desired age to assign
     */
	public void setEdad(int edad) {
		this.edad = edad;
	}

    /**
     * Method to return the name of the person
     * @return Returns the name of the person
     */
	public String getNombre() {
		return nombre;
	}

	/**
     * Method that assigns the name to a person
     * @param nombre, the desired name to assign
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Method to return the gender of the person
     * @return Returns the gender of the person
     */
	public char getSexo() {
		return sexo;
	}

	/**
     * Method that assigns the gender to a person
     * @param sexo, the desired gender to assign
     */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
    
	
    
}
