// Write a Java program to implement the concept of inheritance.

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    public void movesTail() {
        System.out.println("Dog moves its tail");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();    
        dog.movesTail(); 
    }
}
