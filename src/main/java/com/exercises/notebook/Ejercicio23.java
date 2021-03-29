package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ejercicio23 ejercicio23 = new Ejercicio23();

        /*Pedimos el valor en grados Fahrenheit por pantalla*/
        System.out.println("Write the fahrenheit degrees:");
        int fahrenheit = input.nextInt();

        /*Mostramos el resultado de la conversión por pantalla*/
        System.out.println((double)fahrenheit + "ºF = " + ejercicio23.fahrenheitToCelsius(fahrenheit) + "ºC");
    }

    /*Función de conversión de grados Fahrenheit a Celsius*/
    public double fahrenheitToCelsius(double fahrenheitDegrees) {
        return ((double)5 / 9) * (fahrenheitDegrees - 32);
    }
}
