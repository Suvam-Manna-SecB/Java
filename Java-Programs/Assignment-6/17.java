// Program to demonstrate use of hierarchical inheritance using interface.

interface Shape {
    double area();
}
class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
