public class Q7 {
    public static void main(String[] args) {
        int[] array = {12, 32, 43, 34, 56, 78, 54, 67, 89};
        int remove = 34;

        System.out.println("Array before removing " + remove + " is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

  
        for (int i = 0; i < array.length; i++) {
            if (array[i] == remove) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                break; 
            }
        }

        // Print array after removal
        System.out.println("Array after removing " + remove + " is:");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
