package com.exercises.notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ejercicio22 ejercicio22 = new Ejercicio22();

        System.out.println("Write a number:");
        Integer number = input.nextInt();

        System.out.println("The prime dividers of number " + number + " are:");
        System.out.println(ejercicio22.primeDividers(number));
    }

    /*Método para obtener todos los divisores primos de un número*/
    public List<Integer> primeDividers(Integer num) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
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