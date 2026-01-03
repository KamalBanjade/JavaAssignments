//14. Write a Java program to find common elements between two arrays (string values).
public class Q14 {
    public static void main(String[] args) {
        String[] a = {"Java", "C", "Python"};
        String[] b = {"Python", "Java", "C++"};
        for(String x:a) {
        	for(String y:b) {
        		if(x.equals(y)) {
        			System.out.println("Common elements between two arrays is: " +x);
        		}
        	}
        }
    }
   }