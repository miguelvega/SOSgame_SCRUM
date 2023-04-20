package com.example.activity;

public class Calculadora {
    private boolean status;

    public Calculadora() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }
    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede divisor por cero");
        } else {
            return a / b;
        }
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public double power(double a, double b) {
        return Math.pow(a,b);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede obtener la raíz de un negativo");
        } else {
            return Math.sqrt(a);
        }
    }
}
