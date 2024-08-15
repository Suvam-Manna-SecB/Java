// Write a Java program to generate multiplication table.

import java.util.Scanner;
public class MultiTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " : " + (n*i));
		}
	}
}
