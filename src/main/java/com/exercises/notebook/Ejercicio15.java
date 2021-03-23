package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int randomValue = (int) (100 * Math.random() + 1);
        int lives = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("You have " + lives + " lives. Good luck!");
        System.out.println("Try to guess the number:");
        int inputNumber = input.nextInt();

        while (lives > 0) {
            lives--;
            if (lives == 0) {
                System.out.println("You died.");
                break;
            }
            if (inputNumber > randomValue) {
                System.out.println(inputNumber + " Your number is too big:");
                System.out.println("Remaining lives: " + lives);
                System.out.println("Try to guess the number:");
                inputNumber = input.nextInt();
            }
            if (inputNumber < randomValue) {
                System.out.println(inputNumber + " Your number is too small:");
                System.out.println("Remaining lives: " + lives);
                System.out.println("Try to guess the number:");
                inputNumber = input.nextInt();
            }
            if (inputNumber == randomValue) {
                System.out.println("Good job! You are right!");
                System.out.println("You wrote " + inputNumber + " and the number is " + randomValue);
                System.out.println("Remaining lives: " + lives);
                break;
            }
        }
    }
}
