package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario por consola que escriba el peso y la altura*/
        System.out.println("Write your weight (kg): ");
        Integer weight = input.nextInt();
        System.out.println("Write your height (cm): ");
        Integer height = input.nextInt();

        /*Llamamos a la función para calcular el IMS*/
        ejercicio4.calculateIMS(weight, height);

        /*Mostramos los resultados por pantalla*/
        System.out.println("Your IMS is: " + ejercicio4.getIms());
        if (ejercicio4.getIms() >= 18.0 && ejercicio4.getIms() <= 25.0) {
            System.out.println("Your are in a good condition.");
        }
    }

    /*Inicializamos una variable de tipo double*/
    private Double ims;

    /*Método para calcular el IMS*/
    public void calculateIMS(Integer weight, Integer height) {
        setIms((double) weight / (((double) height / 100) * 2));
    }

    /*Getter y setter de la variable ims*/
    public Double getIms() {
        return ims;
    }
    public void setIms(Double ims) {
        this.ims = ims;
    }
}