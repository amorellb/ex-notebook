package com.exercises.notebook;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*Inicializamos un array con varios string*/
        String[] array = {"A", "b", "c", "D", "e", "F"};

        /*Transformamos cada letra del array a lower case*/
        for (String letter : array) {
            if (letter.equals(letter.toLowerCase()))
                System.out.println(letter + " is a lower case letter");
        }
    }
}