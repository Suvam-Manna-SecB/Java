/* Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100km per second. Demonstrate the working of the classes. */

class Distance {
    protected double distance; // distance in miles

    public Distance(double distance) {
        this.distance = distance;
    }

    public void travelTime() {
        double time = distance / 60.0;
        System.out.println("Time taken to cover the distance: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double distance) {
        super(distance);
    }

    @Override
    public void travelTime() {
        double time = distance / 100.0; 
        System.out.println("Time taken to cover the distance: " + time + " hours");
    }
}

public class DistanceDemo {
    public static void main(String[] args) {
        Distance distance = new Distance(100); // distance in miles

        System.out.println("Using Distance class:");
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(160.934); // distance in kilometers

        System.out.println("\nUsing DistanceMKS class:");
        distanceMKS.travelTime();
    }
}
