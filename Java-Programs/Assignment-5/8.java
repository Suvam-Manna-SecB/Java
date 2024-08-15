/* Write a program to define a class Item containing code and price. Accept this data for five objects using an array of objects. Display code, price in tabular form and also display total price of all items. */

import java.util.Scanner;

class Item {
    private int code;
    private double price;

    public Item(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item[] items = new Item[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Enter code: ");
            int code = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            items[i] = new Item(code, price);
        }

        System.out.println("\nItem Details:");
        System.out.println("Code\tPrice");

        double totalPrice = 0.0;
        for (Item item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
            totalPrice += item.getPrice();
        }
        System.out.println("\nTotal Price of all Items: " + totalPrice);
    }
}
