import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();
        printColor(150);
        checkSumInRange();
        checkNum();
        enterNum();
        printString();
        LeapYearVerificator();
        reverseArr();
        fillArr();
        multiplyArr();
        DiagonalArr();
        multiplyArr();
        int length = 8;
        int value = 5;
        int[] updatedArray = acceptArray(length, value);

        for (int i = 0; i < updatedArray.length; i++) {
            System.out.print(updatedArray[i] + " ");
        }
        int num1 = 6;
        int num2 = 14;
        boolean result = checkSumInRange(num1, num2);
        System.out.println("Сумма чисел " + num1 + " и " + num2
                + " в пределах от 10 до 20? " + result);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void checkSumInRange() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();

        System.out.print("Введите число b: ");
        int b = in.nextInt();

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void checkNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static void enterNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isNegative = isNumNeg(number);

        if (isNegative) {
            System.out.println(number + " - True");
        } else {
            System.out.println(number + " - False");
        }
    }

    public static boolean isNumNeg(int number) {
        return number < 0;
    }

    public static void printString() {
        String passString = "Hi, Bro!";
        int repeat = 5;
        printString(passString, repeat);
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void LeapYearVerificator() {
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

    public static boolean isYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void reverseArr() {
        int[] nums1 = new int[] {1, 0, 1, 0, 1, 1, 0, 0, 1, 1};
        int[] nums2 = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums2[i] = 1;
            } else {
                nums2[i] = 0;
            }
        }
        System.out.print("Замененный массив: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }

    public static void fillArr() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print("Массив: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void multiplyArr() {
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.print("Новый массив после умножения: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void DiagonalArr() {
        int size = 6;
        int[][] squareArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    squareArr[i][j] = 1;
            }
        }
        System.out.println("Диагональный массив: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] acceptArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
