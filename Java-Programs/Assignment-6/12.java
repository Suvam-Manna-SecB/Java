// Implement the below Diagram.

abstract class Vehicle {
  private String ID;
  private String name;
  private String licenseNumber;
  public Vehicle(String ID, String name, String licenseNumber) {
    this.ID = ID;
    this.name = name;
    this.licenseNumber = licenseNumber;
  }
  public String getID() {
    return ID;
  }
  public String getName() {
    return name;
  }
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public abstract String getSteeringType();
}
class TwoWheeler extends Vehicle {
  private int numWheels;
  public TwoWheeler(String ID, String name, String licenseNumber, int numWheels) {
    super(ID, name, licenseNumber);
    this.numWheels = numWheels;
  }
  @Override
  public String getSteeringType() {
    return "Handlebar";
  }
}
class FourWheeler extends Vehicle {
  private int numDoors;
  public FourWheeler(String ID, String name, String licenseNumber, int numDoors) {
    super(ID, name, licenseNumber);
    this.numDoors = numDoors;
  }
  @Override
  public String getSteeringType() {
    return "Steering wheel";
  }
}
