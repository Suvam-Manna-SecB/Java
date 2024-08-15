// Write a Java Program to Ask the User His Name and Greets Him With His Name.

import java.util.Scanner;
public class GreetingWithName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + name + "! Welcome to our program.");
    }
}
