package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario que escriba un valor entero*/
        System.out.println("Write an integer (>0):");
        int number = input.nextInt();
        int n = number;

        /*Mientras el valor no cumpla con los requisitos se pedirá que vuelva a introducirlo*/
        while (n <= 0) {
            System.out.println("The number is lower than or equals to 0.");
            System.out.println("Write an integer (>0):");
            n = input.nextInt();
        }

        /*Calculamos el valor del factorial del número añadido por el usuario*/
        int i = 1;
        while (n > 0) {
            i *= n;
            n--;
        }
        System.out.println("!" + number + " = " + i);
    }
}
