// Write a Java program to check whether a number is Buzz or not.

import java.util.Scanner;
public class Buzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if(n % 7 == 0 || n % 10 == 7) System.out.println(n + " is Buzz Number");
		else System.out.println(n + " is not Buzz Number");
	}
}
