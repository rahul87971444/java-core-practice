interface Animal {
    void sound();
    void eat();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
    @Override
    public void eat() {
        System.out.println("Dog Eats Food");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.eat();
    }
}
//Dog Barks
//Dog Eats Food
