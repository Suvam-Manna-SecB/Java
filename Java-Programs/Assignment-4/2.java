// Write a Java program to show method overloading.

public class MethodOverloading {
    public void display(int num) {
        System.out.println("Method with one integer parameter: " + num);
    }

    public void display(int num1, int num2) {
        System.out.println("Method with two integer parameters: " + num1 + " and " + num2);
    }

    public void display(double num) {
        System.out.println("Method with one double parameter: " + num);
    }

    public void display(String str) {
        System.out.println("Method with one String parameter: " + str);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);                
        obj.display(20, 30);            
        obj.display(3.14);              
        obj.display("Hello, world!"); 
    }
}
