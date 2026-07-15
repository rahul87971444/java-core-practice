public class CommandLineDemo {

    public static void main(String[] args) {

        System.out.println("Arguments:");

        for(String arg : args) {

            System.out.println(arg);
        }
    }
}
/*
Run
java CommandLineDemo Rahul Java 101
Output
Arguments:

Rahul
Java
101
*/
