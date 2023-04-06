package org.example;

public class Calculadora {

    public int multiplicacion (int num1, int num2) {
        int resultado;
        resultado = num1 * num2;
        return resultado;
    }

    public boolean isNull (int valor) {
        boolean resultado = true;
        if(valor != 0) {
            resultado = false;
        }
        return resultado;
    }
}