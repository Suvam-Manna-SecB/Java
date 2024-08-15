/* Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of the circle. */

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0);
        Circle circle = new Circle(center, 5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
