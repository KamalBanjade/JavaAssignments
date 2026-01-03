//16. Write a Java program to remove duplicate elements from an array.
public class Q16 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20};

        System.out.print("After removing duplicate elements from an array: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
