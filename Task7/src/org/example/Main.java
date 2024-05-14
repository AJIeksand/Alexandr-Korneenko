package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        enterNum();
    }

    public static void enterNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        boolean par = isNumNeg(number);

        if (par) {
            System.out.println(number + "- True");
        } else {
            System.out.println(number + "- False");
        }

    }


        public static boolean isNumNeg(int number) {

            return number < 0;
        }

    }


