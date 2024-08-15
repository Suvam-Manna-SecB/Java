// Write a Java program to print all multiples of 10 between a given interval.

import java.util.Scanner;
public class Multiples10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Lower Limit: ");
		int l = sc.nextInt();
		System.out.print("Enter Upper Limit: ");
		int u = sc.nextInt();
		for(int i = l; i <= u; i++) {
			System.out.println("10 X " + i + " : " + (10*i));
		}
	}
}
