//18. Write a Java program to find the second smallest element in an array.
public class Q18 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 40};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < smallest) {
                second = smallest;
                smallest = x;
            } else if (x < second && x != smallest) {
                second = x;
            }
        }

        System.out.println("Second Smallest = " + second);
    }
}

