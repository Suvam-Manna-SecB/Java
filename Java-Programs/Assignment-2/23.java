/* Pattern:
1
2 3 4
5 6 7 8 9
*/

import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		int c = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
}
