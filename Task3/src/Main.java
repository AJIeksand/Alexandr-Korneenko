package org.example;

public class Main {
    public static void main(String[] args) {
        printColor();
    }

    private static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.print("Красный");
        }

        else if (value <= 100) {
            System.out.print("Желтый");
        }

        else  {
            System.out.print("Зеленый");
        }
    }

}