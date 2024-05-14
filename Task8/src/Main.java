
public class Main {
    public static void main(String[] args) {
        printString();
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
}

