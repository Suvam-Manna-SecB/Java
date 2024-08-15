// Implement the below Diagram. Here AbstractProduct is only an abstract class.

abstract class AbstractProduct {
  public String productId;
  public String name;
  public String description;
  public AbstractProduct(String productId, String name, String description) {
    this.productId = productId;
    this.name = name;
    this.description = description;
  }
  public abstract void displayProductInfo();
}
class ConcreteProductA extends AbstractProduct {
  public ConcreteProductA(String productId, String name, String description) {
    super(productId, name, description);
  }
  @Override
  public void displayProductInfo() {
    System.out.println("Concrete Product A details:");
    System.out.println("Product ID: " + productId);
    System.out.println("Name: " + name);
    System.out.println("Description: " + description);
  }
}
class ConcreteProductB extends AbstractProduct {
  public ConcreteProductB(String productId, String name, String description) {
    super(productId, name, description);
  }
  @Override
  public void displayProductInfo() {
    System.out.println("Concrete Product B details:");
    System.out.println("Product ID: " + productId);
    System.out.println("Name: " + name);
    System.out.println("Description: " + description);
  }
}
abstract class AbstractFactory {
  public abstract AbstractProduct createProductA();
  public abstract AbstractProduct createProductB();
}
class ConcreteFactoryA extends AbstractFactory {
  @Override
  public AbstractProduct createProductA() {
    return new ConcreteProductA("A101", "Product A1", "Description of Product A1");
  }
  @Override
  public AbstractProduct createProductB() {
    return new ConcreteProductB("B201", "Product B1", "Description of Product B1");
  }
}
class ConcreteFactoryB extends AbstractFactory {
  @Override
  public AbstractProduct createProductA() {
    return new ConcreteProductA("A201", "Product A2", "Description of Product A2");
  }
  @Override
  public AbstractProduct createProductB() {
    return new ConcreteProductB("B202", "Product B2", "Description of Product B2");
  }
}
