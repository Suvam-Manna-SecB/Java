// Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int on = n;
		int rev = 0;
		while(n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if(on == rev) System.out.println("Number is Palindrome");
		else System.out.println("Number is not Palindrome");
	}
}
