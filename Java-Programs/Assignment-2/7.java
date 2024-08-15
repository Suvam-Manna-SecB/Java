// Write a Java program to calculate the sum of natural numbers up to a certain range.

import java.util.Scanner;
public class SumNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of Natural Numbers upto " + n + " : " + sum);
	}
}
