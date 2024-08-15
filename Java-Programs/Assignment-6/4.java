/* Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData() to show “This is a vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber is Bus and manufacturerName in Car and both of them having showData() method showing all details of Bus and Car respectively with content of the super class’s showData() method. */

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    protected void showData() {
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("This is a vehicle class.");
    }
}
class Bus extends Vehicle {
    private String routeNumber;
    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    public void showData() {
        super.showData(); 
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
    private String manufacturerName;
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    public void showData() {
        super.showData(); 
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class VehicleDemo3 {
    public static void main(String[] args) {
        // Create a Bus object
        Bus bus = new Bus("1234", 60, "Red", "John Doe", "Route 1");
        System.out.println("Bus Details:");
        bus.showData();
        System.out.println();
        Car car = new Car("5678", 100, "Blue", "Jane Doe", "Toyota");
        System.out.println("Car Details:");
        car.showData();
    }
}
