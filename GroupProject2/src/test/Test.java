package test;

public class Test {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		int arr[] = {2, 6, 8, 10, 12, 14};
		
		//Adding some new stuff
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
	}
}
