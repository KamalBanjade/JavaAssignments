//1. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Q1{
	public static void main(String[] args) {
		int[] numbers= {34,12,56,78,98,67};
		String[] names= {"Kamal","Asha","Ram","Sita"};
		Arrays.sort(numbers);
		Arrays.sort(names);
		
		System.out.println("Sorted Array Of Numbers : ");
		for(int num: numbers) {
			System.out.println(num + " ");
		}
		
		System.out.println("Sorted Array Of Names : ");
		for(String name: names) {
			System.out.println(name + " ");
			
		}
	}
}