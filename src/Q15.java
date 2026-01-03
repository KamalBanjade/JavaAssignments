//15. Write a Java program to find common elements between two integer arrays.
public class Q15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5};

        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    System.out.println("Common elements between two integer arrays is: "+x);
                }
            }
        }
    }
}
