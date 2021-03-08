package com.exercises.notebook;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1(1);
        System.out.println("The first valur is: " + ejercicio1.getFirstValue());
        System.out.println("The second valur is: " + ejercicio1.getSecondValue());
        ejercicio1.setSecondValue(2);
        System.out.println("The first valur is: " + ejercicio1.getFirstValue());
        System.out.println("The second valur is: " + ejercicio1.getSecondValue());
        /*When adding a new value to the attribute secondValue through the getter, the attribute value changes.*/
    }

    private Integer firstValue = 1;
    private Integer secondValue;

    public Ejercicio1(Integer firstValue) {
        this.firstValue = firstValue;
        this.secondValue = firstValue;
    }

    public Integer getFirstValue() {
        return firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }
}
