// Write a Java program to calculate the exponential of a number.

import java.util.Scanner;
public class Exponential {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		System.out.print("\nEnter Power: ");
		int p = sc.nextInt();
		int ans = 1;
		while(p > 0) {
			ans = ans * n;
			p--;
		}
		System.out.println("Exponential: " + ans);
	}
}
