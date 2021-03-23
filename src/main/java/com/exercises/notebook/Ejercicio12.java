package com.exercises.notebook;

public class Ejercicio12 {
    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.fibo();
    }

    public void fibo() {
        int pos = 1;
        long num = 0;
        long prev = 1;
        while (pos <= 51) {
            System.out.println(num);
            long sumPrevious = num + prev;
            prev = num;
            num = sumPrevious;
            pos ++;
        }
    }
}