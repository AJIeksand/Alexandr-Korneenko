
public class Main {
    public static void main(String[] args) {
        reverseArr();
    }

    public static void reverseArr() {
        int[] nums1 = new int[]{1, 0, 1, 0, 1, 1, 0, 0, 1, 1};

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
            System.out.print(nums2[i] + "");
        }

    }

}