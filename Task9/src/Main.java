import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            LeapYearVerificator();
}

    public static void LeapYearVerificator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeap = isYearLeap(year);

        if (isLeap) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println(year + " - это не високосный год");
        }

    }

    public static  boolean isYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

}