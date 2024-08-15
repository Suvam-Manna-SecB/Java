// Write a Java program to check whether a given number is Armstrong or not.

import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int on = n;
		int ans = 0;
		while(n > 0) {
			int rem = n % 10;
			ans = ans + rem * rem * rem;
			n /= 10;
		}
		if(on == ans) System.out.println("Armstrong Number");
		else System.out.println("Not an Armstrong Number");
	}
}
