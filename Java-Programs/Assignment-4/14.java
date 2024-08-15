/* Create a base class called “vehicle” that stores the number of wheels and speed. Create the following derived classes –
“car” that inherits “vehicle” and also stores the number of passengers.
“truck” that inherits “vehicle” and also stores the load limit.
Write a main function to create objects of these two derived classes and display all the information about “car” and “truck”. Also compare the speed of these two vehicles - car and truck and display which one is faster. */

class Vehicle {
    protected int wheels;
    protected double speed;

    public Vehicle(int wheels, double speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Number of Wheels: " + wheels);
        System.out.println("Speed: " + speed + " mph");
    }
}

class Car extends Vehicle {
    private int passengers;

    public Car(int wheels, double speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Passengers: " + passengers);
    }
}

class Truck extends Vehicle {
    private double loadLimit;

    public Truck(int wheels, double speed, double loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}

public class VehicleDemo2 {
    public static void main(String[] args) {
        Car myCar = new Car(4, 100.0, 5);

        System.out.println("Car Information:");
        myCar.displayInfo();
        System.out.println();

        Truck myTruck = new Truck(6, 80.0, 10.0);

        System.out.println("Truck Information:");
        myTruck.displayInfo();
        System.out.println();

        if (myCar.speed > myTruck.speed) {
            System.out.println("The car is faster than the truck.");
        } else if (myTruck.speed > myCar.speed) {
            System.out.println("The truck is faster than the car.");
        } else {
            System.out.println("Both car and truck have the same speed.");
        }
    }
}
