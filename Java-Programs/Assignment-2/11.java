// Write a Java program to find LCM of two numbers.

import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		int min = b;
		if(a < b) {
			max = b;
			min = a;
		}
		for(int i = max; ; i+= max) {
			if(i % min == 0) {
				System.out.println("LCM : " + i);
				break;
			}
		}
	}
}
