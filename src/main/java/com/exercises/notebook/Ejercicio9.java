package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos un valor entero por consola*/
        System.out.println("Write a number");
        Integer number = input.nextInt();

        /*Llamamos a la función y mostramos el resultado por pantalla*/
        Ejercicio9 ejercicio9 = new Ejercicio9();
        System.out.println("Factorial of " + number + " is: " + ejercicio9.factorial(number));
    }

    /*Creamos la función para calcular el factorial de un número*/
    public Integer factorial(Integer number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}