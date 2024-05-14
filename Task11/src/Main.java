
public class Main {
    public static void main(String[] args) {
        fillArr();
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

    }
}