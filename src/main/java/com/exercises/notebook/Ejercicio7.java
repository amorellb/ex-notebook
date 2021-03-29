package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ejercicio7 ejercicio7 = new Ejercicio7();

        /*Pedimos al usuario qué operación quiere realizar*/
        System.out.println("Which operation would you like to do? (S; R; P or M; D)");
        String symbol = input.nextLine();
        /*Pedimos al usuario los valores enteros con los que se harán los cálculos*/
        System.out.println("Write the first number:");
        Integer firstNumber = input.nextInt();
        System.out.println("Write the second number:");
        Integer secondNumber = input.nextInt();

        /*Realizamos un switch para cada caso, es decir, para cada operación*/
        switch (symbol.toLowerCase()) {
            case "s":
                System.out.println("You got: " + ejercicio7.addition(firstNumber, secondNumber));
                break;
            case "r":
                System.out.println("You got: " + ejercicio7.subtraction(firstNumber, secondNumber));
                break;
            case "p":
            case "m":
                System.out.println("You got: " + ejercicio7.multiplication(firstNumber, secondNumber));
                break;
            case "d":
                if (firstNumber == 0) {
                    System.out.println("First number can't be 0");
                    break;
                }
                System.out.println("You got: " + ejercicio7.division(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Not a valid operation or number");
                break;
        }
    }

    /*Método para realizar la suma*/
    public Integer addition(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    /*Método para realizar la resta*/
    public Integer subtraction(Integer firstNumber, Integer secondNumber) {
        return firstNumber - secondNumber;
    }

    /*Método para realizar la multiplicación*/
    public Integer multiplication(Integer firstNumber, Integer secondNumber) {
        return firstNumber * secondNumber;
    }

    /*Método para realizar la división*/
    public Integer division(Integer firstNumber, Integer secondNumber) {
        return firstNumber / secondNumber;
    }
}