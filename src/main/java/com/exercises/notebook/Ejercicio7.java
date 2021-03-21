package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which operation would you like to do? (S; R; P or M; D)");
        String symbol = input.nextLine();
        System.out.println("Write the first number:");
        Integer firstnNumber = input.nextInt();
        System.out.println("Write the second number:");
        Integer secondNumber = input.nextInt();

        Ejercicio7 ejercicio7 = new Ejercicio7();

        switch (symbol.toLowerCase()) {
            case "s":
                System.out.println("You got: " + ejercicio7.addition(firstnNumber, secondNumber));
                break;
            case "r":
                System.out.println("You got: " + ejercicio7.subtraction(firstnNumber, secondNumber));
                break;
            case "p":
            case "m":
                System.out.println("You got: " + ejercicio7.multiplication(firstnNumber, secondNumber));
                break;
            case "d":
                if (firstnNumber == 0) {
                    System.out.println("First number can't be 0");
                    break;
                }
                System.out.println("You got: " + ejercicio7.division(firstnNumber, secondNumber));
                break;
            default:
                System.out.println("Not a valid operation or number");
                break;
        }
    }

    public Integer addition(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    public Integer subtraction(Integer firstNumber, Integer secondNumber) {
        return firstNumber - secondNumber;
    }

    public Integer multiplication(Integer firstNumber, Integer secondNumber) {
        return firstNumber * secondNumber;
    }

    public Integer division(Integer firstNumber, Integer secondNumber) {
        return firstNumber / secondNumber;
    }
}
