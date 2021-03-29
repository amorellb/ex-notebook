package com.exercises.notebook;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();

        /*Mostramos el valor inicial de las variables por consola*/
        System.out.println("The first valur is: " + ejercicio1.getFirstValue());
        System.out.println("The second valur is: " + ejercicio1.getSecondValue());

        /*Modificamos el valor de la segunda variable y mostramos el cambio por pantalla*/
        ejercicio1.setSecondValue(2);
        System.out.println("The first valur is: " + ejercicio1.getFirstValue());
        System.out.println("The second valur is: " + ejercicio1.getSecondValue());
        /*When adding a new value to the attribute secondValue through the getter, the attribute value changes.*/
    }

    /*Inicializamos las variables*/
    private Integer firstValue = 1;
    private Integer secondValue = firstValue;

    /*Getters de las variables*/
    public Integer getFirstValue() {
        return firstValue;
    }
    public Integer getSecondValue() {
        return secondValue;
    }

    /*Setter de la variable secondValue*/
    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }
}
