/* Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea() and volume(). Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional object. The dimensions of the objects are to be taken from the users and passed through the respective constructors of each derived class. Write a main method to test these classes.
*/

import java.util.Scanner;
class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0;
    }
    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * ((length * width) + (width * height) + (height * length));
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for Box (length, width, height):");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Whole Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());


        System.out.println("Enter side length for Cube:");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Whole Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Enter dimensions for Cylinder (radius, height):");
        double radiusCylinder = scanner.nextDouble();
        double heightCylinder = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radiusCylinder, heightCylinder);
        System.out.println("Cylinder Whole Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Enter dimensions for Cone (radius, height):");
        double radiusCone = scanner.nextDouble();
        double heightCone = scanner.nextDouble();
        Cone cone = new Cone(radiusCone, heightCone);
        System.out.println("Cone Whole Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
