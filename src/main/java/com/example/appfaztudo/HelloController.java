package com.example.appfaztudo;

import javafx.fxml.FXML;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onCalcularIMCButtonClick() throws IOException {
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