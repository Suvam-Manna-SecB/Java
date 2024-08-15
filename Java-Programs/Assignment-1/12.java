// Write a Java program to check whether a year is a leap year or not.

import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int y = sc.nextInt();
		boolean flag = false;
		if(y % 400 == 0) flag = true;
		else if(y % 100 == 0) flag = false;
		else if(y % 4 == 0) flag = true;
		else flag = false;
		if(flag) System.out.println("Leap Year");
		else System.out.println("Not a Leap Year");
	}
}
