package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number:");
        int n = input.nextInt();
        System.out.println("Write the power of the number:");
        int m = input.nextInt();
        int N = n;

        for (int i = 1; i < m; i++) {
            n *= N;
        }
        System.out.println(N + " to the power of " + m + " is: " + n);
    }
}
