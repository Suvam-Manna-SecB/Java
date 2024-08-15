// Write a Java program to check whether a number is divisible by 5 or not.

import java.util.Scanner;
public class DivBy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(n % 5 == 0) System.out.println(n + " is Divisible by 5.");
		else System.out.println(n + " is not Divisible by 5.");
	}
}
