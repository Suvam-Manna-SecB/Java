/* Write a Java program to read two integer values m and n and to decide and print whether m is a multiple of n.
*/

import java.util.Scanner;
public class MN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter M and N: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m % n == 0) System.out.println("M is a multiple of N");
		else System.out.println("M is not a multiple of N");
	}
}
