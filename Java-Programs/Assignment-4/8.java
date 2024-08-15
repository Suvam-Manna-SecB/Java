/* Create a base class Building that stores the number of floors of a building, number of rooms and its total footage. Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. Demonstrate the working of the classes. */

class Building {
    protected int floors;
    protected int rooms;
    protected double totalFootage;

    public Building(int floors, int rooms, double totalFootage) {
        this.floors = floors;
        this.rooms = rooms;
        this.totalFootage = totalFootage;
    }

    public void displayBuildingInfo() {
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Total Footage: " + totalFootage);
    }
}

class House extends Building {
    private int bedrooms;
    private int bathrooms;

    public House(int floors, int rooms, double totalFootage, int bedrooms, int bathrooms) {
        super(floors, rooms, totalFootage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public void displayHouseInfo() {
        super.displayBuildingInfo();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}

public class HouseBuildingDemo {
    public static void main(String[] args) {
        House myHouse = new House(2, 5, 2000.0, 3, 2);

        System.out.println("House Information:");
        myHouse.displayHouseInfo();
    }
}
