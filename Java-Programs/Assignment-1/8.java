// Write a Java program to check if a number is Positive or Negative.

import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(n >= 0) {
			System.out.println(n + " is Positive");
		} else {
			System.out.println(n + " is Negative");
		}
	}
}
