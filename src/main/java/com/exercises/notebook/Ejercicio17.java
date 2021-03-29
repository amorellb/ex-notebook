package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario cuantos números quiere añadir al array*/
        System.out.println("How many numbers would you like to add?");
        int arrayLength = input.nextInt();

        /*Inicializamos el array con el tamaño definido por el usuario*/
        Integer[] intArray = new Integer[arrayLength];

        /*Pedimos los valores que se añadirán al array*/
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Write a number");
            int number = input.nextInt();
            intArray[i] = number;
        }

        /*Comprobamos que el array sea palíndromo*/
        boolean isPalindromic = false;
        for (int i = 0; i < arrayLength / 2; i++) {
            String message = intArray[i] + " equals " + intArray[arrayLength - (i + 1)] + "?";
            if (intArray[i].equals(intArray[arrayLength - (i + 1)])) {
                System.out.println(message);
                System.out.println("True");
                isPalindromic = true;
            } else {
                System.out.println(message);
                System.out.println("False");
                isPalindromic = false;
            }
        }

        /*Mostramos el resultado por pantalla*/
        System.out.println(Arrays.toString(intArray));
        if (isPalindromic) {
            System.out.println("The array is palindromic");
        } else {
            System.out.println("The array is not palindromic");
        }
    }
}