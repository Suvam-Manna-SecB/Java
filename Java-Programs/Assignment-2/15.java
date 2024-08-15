// Write a Java program to check whether a number is prime or not.

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println("Number is not Prime");
				return;
			}
		}
		System.out.println("Number is Prime");
	}
}
