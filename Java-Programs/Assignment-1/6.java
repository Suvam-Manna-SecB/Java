// Write a Java program to find the area and perimeter of a circle.

import java.util.Scanner;
public class APC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		int r = sc.nextInt();
		float area = (float)3.14 * r * r;
		float perimeter = 2 * (float)3.14 * r;
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
	}
}
