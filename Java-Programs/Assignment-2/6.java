// Write a Java program to find all roots of a quadratic equation.

CODE :-

import java.util.Scanner;
public class Roots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Coefficient of x^2: ");
		double a = sc.nextDouble();
		System.out.print("Enter the Coefficient of x: ");
		double b = sc.nextDouble();
		System.out.print("Enter the Constant Term: ");
		double c = sc.nextDouble();
		double d = b * b - 4 * a * c;
		if(d > 0) {
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.format("Root 1: %.2f\nRoot 2: %.2f", root1, root2);
		} else if(d == 0) {
			double root = -b / (2 * a);
			System.out.format("Root 1: %.2f\nRoot 2: %.2f", root, root);
		} else {
			double real = (-b / (2 * a));
			double img = (Math.sqrt(-d) / (2 * a));
			System.out.format("Root 1: %.2f + %.2f\n", real, img);
			System.out.format("Root 2: %.2f - %.2f", real, img);
		}
	}
}
