public class Q8 {
    public static void main(String[] args) {
        int[] arr1 = {12, 43, 54, 32, 12, 34, 65};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Elements of Array1 are: ");
        for (int y : arr1) {
            System.out.print(y + " ");
        }
        System.out.println(); 

        System.out.print("Elements of Array2 are: ");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}
