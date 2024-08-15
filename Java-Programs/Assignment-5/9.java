/* Write a program to define a class Tender containing data members cost and company name. Accept data for five objects and display the company name for which the cost is minimum. */

import java.util.Scanner;

class Tender {
    private double cost;
    private String companyName;

    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    public double getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tender " + (i + 1) + ":");
            System.out.print("Enter cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter company name: ");
            String companyName = scanner.nextLine();

            tenders[i] = new Tender(cost, companyName);
        }

        double minCost = tenders[0].getCost();
        String minCostCompany = tenders[0].getCompanyName();

        for (int i = 1; i < 5; i++) {
            if (tenders[i].getCost() < minCost) {
                minCost = tenders[i].getCost();
                minCostCompany = tenders[i].getCompanyName();
            }
        }
        System.out.println("\nCompany Name with Minimum Cost: " + minCostCompany);
    }
}
