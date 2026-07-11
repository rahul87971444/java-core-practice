class Parent {
    final void display() {
        System.out.println("Final Method");
    }
}
class Child extends Parent {
    // Cannot Override Final Method
    /*
    void display() {
    }
    */
}
public class FinalDemo {
    public static void main(String[] args) {
        final int age = 21;
        System.out.println("Age : " + age);
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}

/*Age : 21

Cannot Divide By Zero

Finally Block Executed*/
