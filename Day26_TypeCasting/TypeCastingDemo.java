public class TypeCastingDemo {

    public static void main(String[] args) {

        // ---------- Implicit Type Casting ----------
        int num = 100;

        double d = num;

        System.out.println("Implicit Casting:");
        System.out.println("Integer : " + num);
        System.out.println("Double  : " + d);

        // ---------- Explicit Type Casting ----------
        double price = 99.99;

        int amount = (int) price;

        System.out.println("\nExplicit Casting:");
        System.out.println("Double : " + price);
        System.out.println("Integer: " + amount);

        // ---------- Character to Integer ----------
        char ch = 'A';

        int ascii = ch;

        System.out.println("\nCharacter : " + ch);
        System.out.println("ASCII Value : " + ascii);
    }
}
