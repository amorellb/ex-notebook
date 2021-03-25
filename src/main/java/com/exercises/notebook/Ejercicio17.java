package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to add?");
        int arrayLength = input.nextInt();

        Integer[] intArray = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Write a number");
            int number = input.nextInt();
            intArray[i] = number;
        }

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

        System.out.println(Arrays.toString(intArray));
        if (isPalindromic) {
            System.out.println("The array is palindromic");
        } else {
            System.out.println("The array is not palindromic");
        }
    }
}