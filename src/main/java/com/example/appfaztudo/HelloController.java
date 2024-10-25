package com.example.appfaztudo;

import javafx.fxml.FXML;

public class HelloController {

    @FXML
    protected void onCalcularIMCButtonClick(){
        new JanelaIMC();

    }

    @FXML
    protected void onConversaoTemperaturaButtonClick(){

    }

    @FXML
    protected  void onDoacoesButtonClick(){

    }

    @FXML
    protected  void onSairButtonClick(){
        System.exit(0);
    }

}