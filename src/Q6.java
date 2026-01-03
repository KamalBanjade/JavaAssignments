//6. Write a Java program to find the index of an array element.
public class Q6{
	public static void main(String[] args) {
		int[] numbers= {12,34,56,78,90,32,54,76,98};
		int search=78;
		int index=-1;
		for(int i=0;i<numbers.length;i++) {
			if (numbers[i]==search){
				index=i;
				break;
			}
		}
		if(index!= -1) {
			System.out.println("Index of " + search +" is " + index);
		}
		else {
			System.out.println("Element isn't found");
		}
		
	}
}