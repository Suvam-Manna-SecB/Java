// Program to create an interface ‘Mango’ and implement it in classes ‘Winter’ and ‘Summer’.

interface Mango {
    void displayTaste();
}
class Winter implements Mango {
    @Override
    public void displayTaste() {
        System.out.println("Winter mango tastes sweet and tangy.");
    }
}
class Summer implements Mango {
    @Override
    public void displayTaste() {
        System.out.println("Summer mango tastes juicy and sweet.");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Mango winterMango = new Winter();
        Mango summerMango = new Summer();
        System.out.println("Taste of Winter Mango:");
        winterMango.displayTaste();
        System.out.println("\nTaste of Summer Mango:");
        summerMango.displayTaste();
    }
}
