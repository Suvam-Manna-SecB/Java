// Write a Java program to find maximum of three numbers.

import java.util.Scanner;
public class MaxOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a >=b && b >= c) {
			System.out.println(a + " is Maximum");
		} else if(b >= c && b >= a) {
			System.out.println(b + " is Maximum");
		} else {
			System.out.println(b + " is Maximum");
		}
	}
}
