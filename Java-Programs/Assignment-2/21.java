// Write a Java program to display prime numbers between a given interval.

import java.util.Scanner;
public class RangePrime {

	public static boolean prime(int n) {
		for(int i = 2; i < n; i++) {
			if(n%i==0) return false;
		}
		return true;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Lower Limit: ");
		int l = sc.nextInt();
		System.out.print("Enter Upper Limit: ");
		int u = sc.nextInt();
		System.out.println("PRIME NUMBERS :-");
		for(int i = l; i <= u; i++) {
			if(prime(i))
				System.out.println(i);
		}
	}
}
