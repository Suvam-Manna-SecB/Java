/* Write a Java program for following grading system.
Note: Percentage >= 90% : Grade A
	Percentage >= 80% : Grade B
	Percentage >= 70% : Grade C
	Percentage >= 60% : Grade D
	Percentage >= 40% : Grade E
	Percentage < 40%   : Grade F
*/

import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Percentage: ");
		int p = sc.nextInt();
		char grade = 'F';
		if(p >= 90) grade = 'A';
		else if(p >= 80) grade = 'B';
		else if(p >= 70) grade = 'C';
		else if(p >= 60) grade = 'D';
		else if(p >= 40) grade = 'E';
		System.out.println("GRADE: " + grade);
	}
}
