/* Pattern 2: 
      1
    212
  32123
4321234
*/

import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int sp = 1; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for(int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
