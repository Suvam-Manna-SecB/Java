// Write a Java program to convert a Binary number to Decimal and Decimal to Binary.

import java.util.Scanner;
public class DecimalBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number in Decimal: ");
		int n = sc.nextInt();
		long binaryNumber = 0, remainder, i = 1, step = 1;
    		while (n > 0) {
      			remainder = n % 2;
        		n /= 2;
        		binaryNumber += remainder * i;	
			i *= 10;
    		}
		System.out.println("Binary: " + binaryNumber);
		System.out.print("Enter Number in Binary: ");
		n = sc.nextInt();
		int decimalNumber = 0;
		i = 0;
		while (n > 0) {
      			remainder = n % 10;
      			n /= 10;
      			decimalNumber += remainder * Math.pow(2, i);
      			i++;
    		}
		System.out.println("Decimal: " + decimalNumber);
	}
}
