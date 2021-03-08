package com.exercises.notebook;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3(10);
        System.out.println("The sphere volume is: " + ejercicio3.volume());
        System.out.println("The sphere surface is: " + ejercicio3.surface());
    }

    private Integer radius;

    public Ejercicio3(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public Double volume() {
        return (4.0/3.0) * Math.PI * getRadius() * 3;
    }

    public Double surface() {
        return 4 * Math.PI * getRadius() * 2;
    }
}