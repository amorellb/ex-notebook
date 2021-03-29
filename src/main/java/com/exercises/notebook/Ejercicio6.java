package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario que introduzca un peso y una altura*/
        System.out.println("Write your weight (kg): ");
        Integer weight = input.nextInt();
        System.out.println("Write your height (cm): ");
        Integer height = input.nextInt();

        /*Llamamos a la función y mostramos el resultado por pantalla*/
        System.out.println(Ejercicio6.imc(weight, height));
    }

    /*Método para calcular el IMC y que devulve un string para cada rango*/
    public static String imc(Integer weight, Integer height) {
        double imc = (double)weight / (((double)height / 100) * 2);

        if (imc < 16) {
            return "IMC = " + imc + ": Criterio de ingreso en hospital";
        }
        if (imc > 16 && imc < 17) {
            return "IMC = " + imc + ": Infrapeso";
        }
        if (imc > 17 && imc < 18) {
            return "IMC = " + imc + ": Bajo peso";
        }
        if (imc > 18 && imc < 25) {
            return "IMC = " + imc + ": Peso normal (saludable)";
        }
        if (imc > 25 && imc < 30) {
            return "IMC = " + imc + ": Sobrepeso";
        }
        if (imc > 30 && imc < 35) {
            return "IMC = " + imc + ": Sobrepeso crónico";
        }
        if (imc > 35 && imc < 40) {
            return "IMC = " + imc + ": Obesidad premórbida";
        }
        if (imc > 40) {
            return "IMC = " + imc + ": Obesidad mórbida";
        }
        return "IMC = " + imc + ": not a valid IMC";
    }
}