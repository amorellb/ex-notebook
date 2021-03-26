package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos un número por pantalla*/
        System.out.println("Write a number:");
        int inputNumber = input.nextInt();

        /*Mostramos el resultado de comprobar si el número es primo a no*/
        Ejercicio21 ejercicio21 = new Ejercicio21();
        System.out.println("Is the number " + inputNumber + " a prime number?");
        System.out.println(ejercicio21.isPrime(inputNumber));
    }

    /*Método que comprobará si un número es primo o no*/
    public Boolean isPrime(Integer number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
