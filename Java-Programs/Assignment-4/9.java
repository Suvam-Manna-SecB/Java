/* In the earlier program, create a second derived class Office that inherits Building and stores the number of telephones and tables. Now, demonstrate the working of all three classes. */

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

class Office extends Building {
    private int telephones;
    private int tables;

    public Office(int floors, int rooms, double totalFootage, int telephones, int tables) {
        super(floors, rooms, totalFootage);
        this.telephones = telephones;
        this.tables = tables;
    }

    public void displayOfficeInfo() {
        super.displayBuildingInfo();
        System.out.println("Telephones: " + telephones);
        System.out.println("Tables: " + tables);
    }
}

public class HouseOfficeBuildingDemo {
    public static void main(String[] args) {

        House myHouse = new House(2, 5, 2000.0, 3, 2);

        System.out.println("House Information:");
        myHouse.displayHouseInfo();
        System.out.println();

        Office myOffice = new Office(5, 10, 5000.0, 20, 30);

        System.out.println("Office Information:");
        myOffice.displayOfficeInfo();
    }
}
