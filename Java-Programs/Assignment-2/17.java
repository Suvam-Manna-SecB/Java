// Write a Java program to find median of a set of numbers.

import java.util.Scanner;
public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("Enter Number: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		if(arr.length % 2 == 0) {
			System.out.println("Median: " + ((arr[arr.length / 2] + arr[arr.length/2 - 1])/2.0));
		} else {
			System.out.println("Median: " + arr[arr.length / 2]);
		}
	}
}
