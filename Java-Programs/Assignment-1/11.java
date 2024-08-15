// Write a Java program to convert miles to kilometers.

import java.util.Scanner;
public class MK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distance in Miles: ");
		float m = sc.nextFloat();
		float km = (float)1.609 * m;
		System.out.println("Distance in Kilometers: " + km);
	}
}
