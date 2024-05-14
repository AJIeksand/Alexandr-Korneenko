public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }
    private static void checkSumSign() {
        int a = 1;
        int b = 1;
        int c = a + b;
        if (c >= 0) {
            System.out.print("Сумма положительная");
        }
        else {
            System.out.print("Сумма отрицательная");
        }

    }
}