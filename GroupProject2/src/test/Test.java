package test;

public class Test {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		int arr[] = {2, 6, 8, 10};
		
		//Adding some new stuff
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += arr[i];
		}
		System.out.println("Sum is: " + sum);
	}
}
