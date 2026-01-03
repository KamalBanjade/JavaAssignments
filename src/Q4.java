//4. Write a Java program to calculate the average value of array elements.
public class Q4{
	public static void main(String[] args) {
		int[] numbers= {10,23,45,67,89,90};
		double average=0;
		int sum=0;
		for(int num:numbers) {
			sum+= num;
			average= (double)sum/numbers.length;
		}
		System.out.println("Average of given array is : "+ average);
	}
}