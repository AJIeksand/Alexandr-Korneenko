package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkNum();}

    public static void checkNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number >= 0) {
            System.out.print("Вы ввели положительное число");
        }

        else {
            System.out.print("Вы ввели отрицательное число");
        }
    }
}

