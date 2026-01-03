public class Q9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int element = 25;
        int pos = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.print("Array after insertion: ");
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
