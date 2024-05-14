

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();

        System.out.print("Введите число b: ");
        int b = in.nextInt();

        int sum = a + b;

        if (sum >= 10 && sum <=20) {
            System.out.print("True");}
        else {
            System.out.print("False");
        }

    }
}

