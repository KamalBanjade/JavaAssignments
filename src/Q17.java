//17. Write a Java program to find the second largest element in an array.
public class Q17 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 40};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}
