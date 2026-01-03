//13. Write a Java program to find duplicate values in an array of string values.
public class Q13 {
    public static void main(String[] args) {
        String[] arr = {"Java", "C", "Java", "Python"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
