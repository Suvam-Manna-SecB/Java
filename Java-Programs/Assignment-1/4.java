// Write a Java program to change temperature from Fahrenheit to Celsius.

import java.util.Scanner;
public class FC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit: ");
		float f = sc.nextFloat();
		float c = (f - 32) / (float)1.8;
		System.out.println("Temperature in Celsius: " + c);
	}
}
