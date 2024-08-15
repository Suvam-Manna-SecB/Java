/* Write a program to accept value of apple sales for each day of the week (using array of type float) and then, calculate the average sale of the week. */

import java.util.Scanner;

public class AppleSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] sales = new float[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter apple sales for day " + (i + 1) + ": ");
            sales[i] = scanner.nextFloat();
        }

        float totalSales = 0;
        for (float sale : sales) {
            totalSales += sale;
        }

        float averageSale = totalSales / 7;

        System.out.println("Average sale of the week: " + averageSale);
    }
}
