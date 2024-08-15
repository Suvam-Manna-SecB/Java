/* Admission to a professional course is subject to the following conditions:
marks in Mathematics >= 60    (b) marks in Physics >= 50
     (c) marks in Chemistry >= 40        (d) Total in all 3 subjects >= 200
								(Or)
						Total in Maths & Physics >= 150
Given the marks in the 3 subjects of n (user input) students, write a program to process the applications to list the eligible candidates.
*/

import java.util.Scanner;
public class Admission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students: ");
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] m = new int[n];
		int[] c = new int[n];
		boolean[] allowed = new boolean[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Enter Marks of Student " + (i+1) + " in Physics: ");
			p[i] = sc.nextInt();
			System.out.print("Enter Marks of Student " + (i+1) + " in Chemistry: ");
			c[i] = sc.nextInt();
			System.out.print("Enter Marks of Student " + (i+1) + " in Mathematics: ");
			m[i] = sc.nextInt();
			if(m[i] >= 60 && p[i] >= 50 && c[i] >= 40 && ((m[i] + p[i] + c[i] >= 200) || (m[i] + p[i] >= 150))) allowed[i] = true;
		}
		for(int i = 0; i < n; i++) {
			if(allowed[i]) System.out.println("Student " + (i+1) + " can take Admission");
			else System.out.println("Student " + (i+1) + " cannot take Admission");
		}
	}
}
