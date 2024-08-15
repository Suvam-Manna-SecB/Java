// Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.Scanner;
public class CF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: ");
		float c = sc.nextFloat();
		float f = (float)1.8 * c + 32;
		System.out.println("Temperature in Fahrenheit: " + f);
	}
}
