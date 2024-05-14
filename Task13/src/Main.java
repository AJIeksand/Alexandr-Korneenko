
public class Main {
    public static void main(String[] args) {
        DiagonalArr();
    }

    public static void DiagonalArr() {
        int size = 6;
        int[][] squareArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) squareArr[i][j] = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}