package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ejercicio24 ejercicio24 = new Ejercicio24();

        /*Pedimos el nif por pantalla*/
        System.out.println("Write your NIF (8 digits followed by a letter):");
        String nif = input.nextLine();

        while (nif.length() != 9) {
            System.out.println("Not a valid length of NIF. Write it again.");
            nif = input.nextLine();
        }

        /*Separamos los dígitos de la letra*/
        String digits = nif.substring(0, 8);
        String letter = nif.substring(8);

        /*Comprobamos que el string de números contenga números y el string de letras contenga la letra*/
        if (ejercicio24.isNumber(digits) && Character.isLetter(letter.charAt(0))) {
            System.out.println("NIF válido: " + digits);
        } else {
            System.out.println("NIF no válido");
        }
    }

    /*Función para comprobar que la parte numérica del NIF esté formada por dígitos*/
    public boolean flag = false;

    public boolean isNumber(String numberString) {
        for (int i = 0; i < numberString.length(); i++) {
            if (Character.isDigit(numberString.toCharArray()[i])) {
                this.flag = true;
            } else {
                this.flag = false;
                break;
            }
        }
        return flag;
    }
}
