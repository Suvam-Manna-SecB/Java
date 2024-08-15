// Write a Java program for Fibonacci series.

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("FIBONACCI SERIES :-");
		while(n > 0) {
			int c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
			n--;
		}
	}
}
