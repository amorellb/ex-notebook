package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you add into the first array?");
        int arrayLength = input.nextInt();

        Integer[] v1 = new Integer[arrayLength];
        Integer[] v2 = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Add a number to the first array:");
            v1[i] = input.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Add a number to the second array:");
            v2[i] = input.nextInt();
        }

        String[] vector = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            vector[i] = v1[i].toString() + v2[i].toString();
        }

        System.out.println("The array is:");
        System.out.println(Arrays.toString(vector));
    }
}
