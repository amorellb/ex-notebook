package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos los valores por pantalla*/
        System.out.println("Write a number:");
        Integer first = input.nextInt();
        System.out.println("Write a number:");
        Integer second = input.nextInt();
        System.out.println("Write a number:");
        Integer third = input.nextInt();

        /*Mostramos el resultado por pantalla*/
        System.out.println("You write this three numbers: " + first + ", " + second + " and " + third);
        System.out.println("The max number is:");
        System.out.println(Ejercicio20.maxNumber(first, second, third));
    }

    /*Función que toma dos parámetros y comprueba el máximo*/
    public static Integer maxNumber(Integer firstNumber, Integer secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    /*Función que toma tres parámetros y comprueba el máximo, utilizando además la función anterior*/
    public static Integer maxNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer number = maxNumber(firstNumber, secondNumber);
        if (number > thirdNumber) {
            return number;
        }
        return thirdNumber;
    }
}
