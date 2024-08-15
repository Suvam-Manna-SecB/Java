/* Write a Java program to compute the value of Euler’s number that is used as the base of natural logarithms. Use the following formula:
	e=1 + 1/1! + 1/2! + 1/3! + ………….. 1/n!
*/

import java.util.Scanner;
public class EulerNumber {

	public static int fact(int n) {
		int fact = 1;
		while(n > 0) {
			fact *= n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		double e = 1;
		for(int i = 1; i <= n; i++) {
			e += (double)(1/(double)fact(i));
		}
		System.out.println("e : " + e);
	}
}
