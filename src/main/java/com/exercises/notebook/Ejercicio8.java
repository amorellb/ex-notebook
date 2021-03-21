package com.exercises.notebook;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] array = {"A", "b", "c", "D", "e", "F"};

        for (String letter : array) {
            if (letter.equals(letter.toLowerCase()))
                System.out.println(letter + " is a lower case letter");
        }
    }
}