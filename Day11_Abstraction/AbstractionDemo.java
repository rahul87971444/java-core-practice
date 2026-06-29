abstract class Animal {
    // Abstract Method
    abstract void sound();
    // Normal Method
    void sleep() {
        System.out.println("Animal is Sleeping");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.sleep();
    }
//Dog Barks
//Animal is Sleeping
