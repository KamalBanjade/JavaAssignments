public class Q10 {
    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 3, 89};

        int max = arr[0], min = arr[0];

        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
