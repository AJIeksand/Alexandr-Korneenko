package org.example;


public class Main {
    public static void main(String[] args) {
        compareNumbers();
    }
    private static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.print("a >= b");
        }
        else {
            System.out.print("a < b");
        }
    }
}