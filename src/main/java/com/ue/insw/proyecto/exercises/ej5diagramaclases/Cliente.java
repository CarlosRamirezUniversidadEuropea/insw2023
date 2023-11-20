package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona {
    
    // Atributos
    private String nombre_empresa;
    private String telefono_de_contacto;

    /**
     * Constructor de la clase
     * @param nombre Nombre del cliente
     * @param edad Edad del cliente
     * @param nombre_empresa Nombre de la empresa del cliente
     * @param telefono_de_contacto Teléfono de contacto del cliente
     */
    public Cliente(String nombre, int edad, String nombre_empresa, String telefono_de_contacto) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    // Getters y setters
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

}
