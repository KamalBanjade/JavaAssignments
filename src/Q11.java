//11. Write a Java program to reverse an array of integer values.
public class Q11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
