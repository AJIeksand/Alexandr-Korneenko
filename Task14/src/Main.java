
public class Main {
    public static void main(String[] args) {
            int length = 8;
            int value = 5;

            int[] updatedArray = acceptArray(length, value);

            for (int i = 0; i < updatedArray.length; i++) {
                System.out.print(updatedArray[i] + " ");
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
