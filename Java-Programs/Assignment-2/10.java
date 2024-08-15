// Write a Java program to find HCF of two numbers.

import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("HCF : " + a);
	}
}