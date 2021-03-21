package com.exercises.notebook;

public class Ejercicio10 {
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();

        ejercicio10.fahrenheitToCelsius();
    }

    public void fahrenheitToCelsius() {
        for (int i = 0; i < 301; i += 20) {
            System.out.println("Fahrenheit: " + i + " Celsius: " + ((float)5/9) * (float)(i - 32));
        }
    }
}