module com.ue.insw.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.ue.insw.proyecto.controller;
    opens com.ue.insw.proyecto.controller to javafx.fxml;
    exports com.ue.insw.proyecto.exercises.ej4;
    exports com.ue.insw.proyecto.exercises.ej3;
    exports com.ue.insw.proyecto.exercises.ej2;
    exports com.ue.insw.proyecto.exercises.ej1;
    opens com.ue.insw.proyecto.exercises.ej1 to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej2 to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej3 to javafx.fxml;
    opens com.ue.insw.proyecto.exercises.ej4 to javafx.fxml;
    exports com.ue.insw.proyecto;
    opens com.ue.insw.proyecto to javafx.fxml;
}