package com.exercises.notebook;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario, por consola, cuantos números quiere añadir*/
        System.out.println("How many numbers would you like to add?");
        int arrayLength = input.nextInt();

        /*Inicializamos el array con el tamaño definido por el usuario*/
        Integer[] arrayNumbers = new Integer[arrayLength];

        /*Pedimos al usuario los valores que quiere añadir al array y los añadimos*/
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Write a number please:");
            int number = input.nextInt();
            arrayNumbers[i] = number;
        }

        /*Mostramos por consola el valor máximo y mínimo del array*/
        System.out.println("The maximum number is: " + Collections.max(Arrays.asList(arrayNumbers)));
        System.out.println("The minimum number is: " + Collections.min(Arrays.asList(arrayNumbers)));
    }
}
