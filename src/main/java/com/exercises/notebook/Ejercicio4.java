package com.exercises.notebook;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();

        Scanner input = new Scanner(System.in);
        System.out.println("Write your weight (kg): ");
        Integer weight = input.nextInt();
        System.out.println("Write your height (cm): ");
        Integer height = input.nextInt();

        ejercicio4.calculateIMS(weight, height);

        System.out.println("Your IMS is: " + ejercicio4.getIms());
        if (ejercicio4.getIms() >= 18.0 && ejercicio4.getIms() <= 25.0) {
            System.out.println("Your are in a good condition.");
        }
    }

    private Double ims;

    public void calculateIMS(Integer weight, Integer height) {
        setIms((double) weight / (((double) height / 100) * 2));
    }

    public Double getIms() {
        return ims;
    }

    public void setIms(Double ims) {
        this.ims = ims;
    }
}