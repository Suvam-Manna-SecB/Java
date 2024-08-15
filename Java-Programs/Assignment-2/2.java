// Write a Java program to calculate factorial of 12.

public class Factorial12 {
	public static void main(String[] args) {
		int n = 12;
		int fact = 1;
		while(n > 0) {
			fact *= n;
			n--;
		}
		System.out.println("Factorial of 12: " + fact);
	}
}
