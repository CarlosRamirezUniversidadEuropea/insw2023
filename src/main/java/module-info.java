module com.ue.insw.proyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires com.google.gson;
    requires java.desktop;
    requires junit;

    opens com.ue.insw.proyecto.exercises.ej7json to com.google.gson;
    exports com.ue.insw.proyecto.fxml.controller;
    opens com.ue.insw.proyecto.fxml.controller to javafx.fxml,org.json;
    exports com.ue.insw.proyecto.exercises.ej4;
    exports com.ue.insw.proyecto.exercises.ej8pruebas;
    exports com.ue.insw.proyecto.exercises.ej3polimorfismo;
    exports com.ue.insw.proyecto.exercises.ej2herencia;
    exports com.ue.insw.proyecto.exercises.ej1interfaz;
    opens com.ue.insw.proyecto.exercises.ej1interfaz to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej2herencia to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej3polimorfismo to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej4 to javafx.fxml;
    exports com.ue.insw.proyecto.exercises.ej1interfaz.enumerates;
    opens com.ue.insw.proyecto.exercises.ej1interfaz.enumerates to javafx.fxml;
    exports com.ue.insw.proyecto.exercises.ej1interfaz.interfaces;
    opens com.ue.insw.proyecto.exercises.ej1interfaz.interfaces to javafx.fxml;
    exports com.ue.insw.proyecto.exercises.ej1interfaz.objects;
    opens com.ue.insw.proyecto.exercises.ej1interfaz.objects to javafx.fxml;
}