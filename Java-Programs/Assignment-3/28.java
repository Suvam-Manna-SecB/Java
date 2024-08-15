/* Write a class Commission, which has an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission.
Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. Finally, call the commission() method to get and print the commission. If the sales are negative, your demo should print the message “Invalid Input”.
*/

import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }
    public double commission() {
        if (sales < 0) {
            return -1; // Invalid input
        }
        if (sales <= 1000) {
            return sales * 0.05;
        } else if (sales <= 5000) {
            return 1000 * 0.05 + (sales - 1000) * 0.08;
        } else {
            return 1000 * 0.05 + 4000 * 0.08 + (sales - 5000) * 0.10;
        }
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);

            double commissionAmount = commission.commission();
            if (commissionAmount == -1) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("Commission: $" + commissionAmount);
            }
        }
    }
}
