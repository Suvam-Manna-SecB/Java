/* Pattern:
1      1
 2    2
  3  3
    4
*/

import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		int space = 2 * n - 2;
		for(int i = 1; i <= n; i++) {
			for(int sp = 1; sp < i; sp++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(int sp = 1; sp < space; sp++) {
				System.out.print(" ");
			}
			space -= 2;
			if(i != n) System.out.print(i);
			System.out.println();
		}
	}
}
