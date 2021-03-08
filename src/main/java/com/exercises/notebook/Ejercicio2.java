package com.exercises.notebook;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();

        ejercicio2.addition();
        ejercicio2.subtract();
        ejercicio2.multiplication();
        ejercicio2.division();

        System.out.println("The value of the addition is: " + ejercicio2.getAddResult());
        System.out.println("The value of the subtraction is: " + ejercicio2.getSubResult());
        System.out.println("The value of the multiplication is: " + ejercicio2.getMulResult());
        System.out.println("The value of the division is: " + ejercicio2.getDivResult());
    }

    private Integer num1 = 12;
    private Integer num2 = 4;
    private Integer addResult;
    private Integer subResult;
    private Integer mulResult;
    private Double divResult;

    public void addition() {
        this.addResult = getNum1() + getNum2();
    }

    public void subtract() {
        this.subResult = getNum1() - getNum2();
    }

    public void multiplication() {
        this.mulResult = getNum1() * getNum2();
    }

    public void division() {
        this.divResult = (double) getNum1() / (double) getNum2();
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getAddResult() {
        return addResult;
    }

    public Integer getSubResult() {
        return subResult;
    }

    public Integer getMulResult() {
        return mulResult;
    }

    public Double getDivResult() {
        return divResult;
    }
}
