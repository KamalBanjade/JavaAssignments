//12. Write a Java program to find duplicate values in an array of integer values.
public class Q12 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
