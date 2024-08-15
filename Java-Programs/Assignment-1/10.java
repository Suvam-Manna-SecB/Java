// Write a Java program to swap two numbers.

import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swap: A: " + a + " and B: " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After Swap: A: " + a + " and B: " + b);
	}
}
