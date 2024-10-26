package com.example.appfaztudo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConversaoTemperaturaController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] itens = {"Kelvin", "Fahrenheit"};
        comboMetrica.getItems().addAll(itens);
    }

    @FXML
    private TextField textValorCelsius;
    @FXML
    private ComboBox<String> comboMetrica;
    @FXML
    private Label labelResultado;

    @FXML
    protected void onConverterButtonClick(){
        double resultado = 0.0;
        double ValoremCelsius = Double.parseDouble(textValorCelsius.getText());
        if (comboMetrica.getValue().equals("Kelvin")){
            labelResultado.setText(Uti);
        }else if (comboMetrica.getValue().equals("Fahrenheit")){

        }
    }
}
