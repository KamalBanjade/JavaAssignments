/*
3. Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
*/

public class Q3{
	public static void main(String[] args) {
		for(int i=0; i<9;i++) {
			for(int j=0; j<9;j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}