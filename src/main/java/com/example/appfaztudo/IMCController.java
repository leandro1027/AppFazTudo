package com.example.appfaztudo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IMCController {
    @FXML
    private TextField textPeso;
    @FXML
    private TextField textAltura;
    @FXML
    private TextField textIMC;
    @FXML
    private Label labelResultado;

    @FXML
   protected void onCalcularIMCButtonClick(){
        double peso = Double.parseDouble(textPeso.getText());
        double altura = Double.parseDouble(textAltura.getText());
        double imc = peso/(altura*altura);
        labelResultado.setText("Seu IMC:" + imc);

   }
}
