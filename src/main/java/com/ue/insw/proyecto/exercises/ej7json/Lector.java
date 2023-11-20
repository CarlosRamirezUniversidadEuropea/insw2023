package com.ue.insw.proyecto.exercises.ej7json;
import java.util.List;
public class Lector {
    // Atributos de la clase Lector
    int type; // Tipo de lector
    int num; // Número de lector
    List<List<Val>> values; // Lista de listas de valores

    // Constructor de la clase Lector
    public Lector(int type, int num, List<List<Val>> values) {
        this.type = type;
        this.num = num;
        this.values = values;
    }

    // Método para obtener la lista de listas de valores
    public List<List<Val>> getValues() {
        return values;
    }

    // Método para obtener el número de lector
    public int getNum() {
        return num;
    }

    // Método para obtener el tipo de lector
    public int getType() {
        return type;
    }

    // Método para establecer la lista de listas de valores
    public void setValues(List<List<Val>> values) {
        this.values = values;
    }

    // Representación en cadena de texto de la clase Lector
    @Override
    public String toString() {
        return "\n\t\tReading{" + "\n\t\ttype=" + type + ", \n\t\tnum=" + num + ", \n\t\tvalues=" + values + '}';
    }

    // Clase interna Val que representa un valor
    public class Val {
        double v; // Valor

        // Representación en cadena de texto de la clase Val
        @Override
        public String toString() {
            return "Val{" + "v=" + v + '}';
        }
    }
}
