package com.exercises.notebook;

public class Ejercicio5 {
    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        System.out.println(ejercicio5.getGreater(24, 3));
        System.out.println(ejercicio5.getGreater(3, 10));
    }

    private Integer num1;
    private Integer num2;

    public Integer getNum1() {
        return num1;
    }
    
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getGreater(Integer firstNumber, Integer secondNumber) {
        setNum1(firstNumber);
        setNum2(secondNumber);

        if (getNum1() > getNum2()) {
            return getNum1();
        }
        return getNum2();
    }
}
