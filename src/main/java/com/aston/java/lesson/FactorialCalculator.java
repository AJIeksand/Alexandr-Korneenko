package com.aston.java.lesson;

public class FactorialCalculator {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            if (Long.MAX_VALUE / i < result) {
                throw new ArithmeticException("Результат вычисления факториала слишком велик и вызвал переполнение.");
            }
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " равен: " + factorial(number));
    }
}