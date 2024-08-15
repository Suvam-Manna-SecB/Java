// Write a Java program to find the area and perimeter of a rectangle.

import java.util.Scanner;
public class APR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length and Breadth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int area = l * b;
		int perimeter = 2 * (l + b);
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
	}
}
