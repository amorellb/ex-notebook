package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario cuantos valores quiere añadir al array*/
        System.out.println("How many numbers would you add into the first array?");
        int arrayLength = input.nextInt();

        /*Iniciamos los arrays de tamaño igual al valor pedido al usuario*/
        Integer[] v1 = new Integer[arrayLength];
        Integer[] v2 = new Integer[arrayLength];

        /*Añadimos los valores a los arrays*/
        addValues(input, arrayLength, arrayLength, v1, v2);

        /*Concatenamos los valores de los dos array en uno solo*/
        String[] vector = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            vector[i] = v1[i].toString() + v2[i].toString();
        }

        /*Mostramos el resultado por pantalla*/
        System.out.println("The array is:");
        System.out.println(Arrays.toString(vector));
    }

    /*Método para añadir los valores a los arrays*/
    public static void addValues(Scanner input, int v1Length, int v2Length, Integer[] v1, Integer[] v2) {
        for (int i = 0; i < v1Length; i++) {
            System.out.println("Add a number to the first array:");
            v1[i] = input.nextInt();
        }

        for (int i = 0; i < v2Length; i++) {
            System.out.println("Add a number to the second array:");
            v2[i] = input.nextInt();
        }
    }
}
