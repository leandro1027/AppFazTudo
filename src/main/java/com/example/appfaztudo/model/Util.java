package com.example.appfaztudo.model;

public class Util {

    public static double calculaIMC(double peso, double altura) {
        double imc = peso/(altura*altura);
        return imc;
    }
}
