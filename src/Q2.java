//2. Write a Java program to sum values of an array.
public class Q2{
	public static void main(String[] args) {
		int sum=0;
		int [] numbers = {10,34,65,34,56,78,90};
		
		for(int num :numbers) {
			sum=+num;
		}
		System.out.println("Sum is : "+ sum);
	}
	
}