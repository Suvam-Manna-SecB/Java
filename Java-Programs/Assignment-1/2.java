// Write a Java program to add two numbers.

import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum: " + (a+b));
	}
}
