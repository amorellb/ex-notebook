package com.exercises.notebook;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Inicializamos la variable radius con un valor de 10*/
        Ejercicio3 ejercicio3 = new Ejercicio3(10);

        /*Llamamos los métodos y mostramos los resultados por pantalla*/
        System.out.println("The sphere volume is: " + ejercicio3.volume());
        System.out.println("The sphere surface is: " + ejercicio3.surface());
    }

    /*Inicializamos una variable de tipo entero*/
    private Integer radius;

    /*Constructor de la clase*/
    public Ejercicio3(Integer radius) {
        this.radius = radius;
    }

    /*Método para calcular el volumen*/
    public Double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    /*Método para calcular la superficie*/
    public Double surface() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
}