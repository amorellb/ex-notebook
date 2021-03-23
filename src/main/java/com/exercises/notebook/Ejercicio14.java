package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write an integer (>0):");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("The number is lower tha or equals to 0.");
            System.out.println("Write an integer (>0):");
            n = input.nextInt();
        }

        int i = 1;
        while (n > 0) {
            i *= n;
            n--;
        }
        System.out.println(i);
    }
}
