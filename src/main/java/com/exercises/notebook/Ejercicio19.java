package com.exercises.notebook;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you add to the first array?");
        int v1Length = input.nextInt();
        System.out.println("How many numbers would you add to the second array?");
        int v2Length = input.nextInt();

        Integer[] v1 = new Integer[v1Length];
        Integer[] v2 = new Integer[v2Length];

        for (int i = 0; i < v1Length; i++) {
            System.out.println("Add a number to the first array:");
            v1[i] = input.nextInt();
        }

        for (int i = 0; i < v2Length; i++) {
            System.out.println("Add a number to the second array:");
            v2[i] = input.nextInt();
        }

        Integer[] v = new Integer[v1Length];
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

        System.out.println("First array:");
        System.out.println(Arrays.toString(v1));
        System.out.println("Second array:");
        System.out.println(Arrays.toString(v2));
        System.out.println("The array's sum is:");
        System.out.println(Arrays.toString(v));
    }
}
