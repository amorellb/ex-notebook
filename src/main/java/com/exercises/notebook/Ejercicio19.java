package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos los tamaños de los arrays por consola*/
        System.out.println("How many numbers would you add to the first array?");
        int v1Length = input.nextInt();
        System.out.println("How many numbers would you add to the second array?");
        int v2Length = input.nextInt();

        /*Inicializamos los dos arrays con el tamaño dado por el usuario*/
        Integer[] v1 = new Integer[v1Length];
        Integer[] v2 = new Integer[v2Length];

        /*Añadimos los valores a los arrays*/
        Ejercicio18.addValues(input, v1Length, v2Length, v1, v2);

        /*Añadimos los valores del array v1 y del array v2 al array v, una vez sumados los valores*/
        Integer[] v;
        if (v1Length >= v2Length) {
            v = new Integer[v1Length];
            for (int i = 0; i < v1Length; i++) {
                if (i < v2Length) {
                    v[i] = v1[i] + v2[i];
                } else {
                    v[i] = v1[i];
                }
            }
        } else {
            v = new Integer[v2Length];
            for (int i = 0; i < v2Length; i++) {
                if (i < v1Length) {
                    v[i] = v2[i] + v1[i];
                } else {
                    v[i] = v2[i];
                }
            }
        }

        /*Mostramos los resultados por consola*/
        System.out.println("First array:");
        System.out.println(Arrays.toString(v1));
        System.out.println("Second array:");
        System.out.println(Arrays.toString(v2));
        System.out.println("The array's sum is:");
        System.out.println(Arrays.toString(v));
    }
}
