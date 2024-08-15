/* Create an abstract class MotorVehicle with the following details:
Data Members:
modelName  (b) modelNumber  © modelPrice
Methods:
display() to show all the details

Create a subclass of this class Car that inherits the class MotorVehicle and add the following details:
Data Members:
discountRate
Methods:
display() method to display the Car name, model number, price and the discount rate.
discount() method to compute the discount.
*/

abstract class MotorVehicle {
    protected String modelName;
    protected int modelNumber;
    protected double modelPrice;
    public MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }
    abstract void display();
}
class Car extends MotorVehicle {
    private double discountRate;
    public Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }
    double discount() {
        return modelPrice * (discountRate / 100);
    }
    @Override
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: $" + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: $" + discount());
    }
}
public class MotorVehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2023, 25000, 10);
        car.display();
    }
}
