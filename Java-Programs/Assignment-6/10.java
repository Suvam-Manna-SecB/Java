/* Implement the below Diagram.
Here, Asset class is an abstract class containing an abstract method displayDetails() method. Stock, Bond and Savings class inherit the Asset class and displayDetails() method is defined in every class. */

abstract class Asset {
  private String descriptor;
  private String date;
  private double current_value;
  public Asset(String descriptor, String date, double current_value) {
    this.descriptor = descriptor;
    this.date = date;
    this.current_value = current_value;
  }
  public abstract void displayDetails();
}
class Stock extends Asset {
  private int num_shares;
  private double share_price;
  public Stock(String descriptor, String date, double current_value, int num_shares, double share_price) {
    super(descriptor, date, current_value);
    this.num_shares = num_shares;
    this.share_price = share_price;
  }
  @Override
  public void displayDetails() {
    System.out.println("Stock descriptor: " + descriptor);
    System.out.println("Stock date: " + date);
    System.out.println("Stock current value: " + current_value);
    System.out.println("Number of shares: " + num_shares);
    System.out.println("Share price: " + share_price);
  }
}
class Bond extends Asset {
  private double interest_rate;
  private Asset asset;
  public Bond(String descriptor, String date, double current_value, double interest_rate, Asset asset) {
    super(descriptor, date, current_value);
    this.interest_rate = interest_rate;
    this.asset = asset;
  }
  @Override
  public void displayDetails() {
    System.out.println("Bond descriptor: " + descriptor);
    System.out.println("Bond date: " + date);
    System.out.println("Bond current value: " + current_value);
    System.out.println("Interest rate: " + interest_rate);
    System.out.println("Underlying asset details: ");
    asset.displayDetails(); 
  }
}
class Savings extends Asset {
  private double interest_rate;
  public Savings(String descriptor, String date, double current_value, double interest_rate) {
    super(descriptor, date, current_value);
    this.interest_rate = interest_rate;
  }
  @Override
  public void displayDetails() {
    System.out.println("Savings descriptor: " + descriptor);
    System.out.println("Savings date: " + date);
    System.out.println("Savings current value: " + current_value);
    System.out.println("Interest rate: " + interest_rate);
  }
}
