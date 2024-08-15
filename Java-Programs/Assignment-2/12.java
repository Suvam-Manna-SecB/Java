// Write a Java program to count the number of digits of an integer.

CODE :-

import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int c = 0;
		while(n > 0) {
			c++;
			n/=10;
		}
		System.out.println("Number of Digits: " + c);
	}
}
