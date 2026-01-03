////5. Write a Java program to test if an array contains a specific value.
public class Q5{
	public static void main(String[] args) {
		int[] numbers= {23,45,67,34,12,56,76};
		int searchElement =23;
		boolean found=false;
		
		for(int num:numbers) {
			if(num==searchElement) {
				found= true;
				break;
			}
		}
		if(found) {
			System.out.println("Element " + searchElement + " is Found in the array.");
		}
		else {
			System.out.println("Element " + searchElement + " isn't Found in the array.");
		}
		
	}
}