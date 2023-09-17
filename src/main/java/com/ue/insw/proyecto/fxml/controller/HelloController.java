package com.ue.insw.proyecto.fxml.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //todo aañdir un botón que lleve a otra pantalla con datos de vuestra información de estudiante
}