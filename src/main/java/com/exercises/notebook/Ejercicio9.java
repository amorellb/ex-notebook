package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number");
        Integer number = input.nextInt();

        Ejercicio9 ejercicio9 = new Ejercicio9();
        System.out.println("Factorial of " + number + " is: " + ejercicio9.factorial(number));
    }

    public Integer factorial(Integer number) {
        int result = 0;
        for (int i = number; i > 0; i--) {
            result += i;
        }
        return result;
    }
}