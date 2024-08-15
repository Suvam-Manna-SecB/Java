/* Define a class called circle that contains:
Two private instance variables radius (of type double) and color (of type String),
Initialize the variables radius and color with default value of 1.0 and “red” respectively using default constructor.
Include a second constructor that will use the default value for color and sets the radius to the value passed as parameter.
Two public methods: getRadius() and getArea() for returning the radius and area of the circle.
Invoke the above methods and constructors in the main. */

class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // Default color
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleDemo2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(3.5); // Constructor with radius parameter
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
    }
}
