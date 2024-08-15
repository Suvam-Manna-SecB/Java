/* Create three interfaces, each with two methods, inherit a new interface from the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main(), create an object of your class and pass it to each of the methods. */

interface Interface1 {
    void method1();
    void method2();
}
interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}
class MyClass extends Object implements NewInterface {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }
    @Override
    public void method2() {
        System.out.println("Method 2");
    }
    @Override
    public void method3() {
        System.out.println("Method 3");
    }
    @Override
    public void method4() {
        System.out.println("Method 4");
    }
    @Override
    public void method5() {
        System.out.println("Method 5");
    }
    @Override
    public void method6() {
        System.out.println("Method 6");
    }
    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}
public class InterfaceDemo {
    public static void methodWithInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }
    public static void methodWithInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }
    public static void methodWithInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }
    public static void methodWithNewInterface(NewInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.newMethod();
    }
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        methodWithInterface1(myObj);
        System.out.println();
        methodWithInterface2(myObj);
        System.out.println();
        methodWithInterface3(myObj);
        System.out.println();
        methodWithNewInterface(myObj);
    }
}
