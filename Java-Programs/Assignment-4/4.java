// Write a Java program to show method hiding.

class Parent {
    public static void display() {
        System.out.println("Static method of Parent class");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method of Child class");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Parent.display(); 
        Child.display();   
        Parent obj = new Child();
        obj.display(); 
    }
}
