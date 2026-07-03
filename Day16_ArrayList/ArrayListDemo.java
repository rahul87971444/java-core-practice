import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        // Adding Elements
        students.add("Rahul");
        students.add("Aman");
        students.add("Saswati");
        System.out.println("Student List: " + students);
        // Accessing Element
        System.out.println("First Student: " + students.get(0));
        // Updating Element
        students.set(1, "Rohit");
        System.out.println("After Update: " + students);
        // Removing Element
        students.remove(2);
        System.out.println("After Remove: " + students);
        // Size
        System.out.println("Total Students: " + students.size());
        // Traversing ArrayList
        System.out.println("\nUsing For-Each Loop:");
        for(String student : students) {
            System.out.println(student);
        }
    }
}

//Student List: [Rahul, Aman, Saswati]

//First Student: Rahul

//After Update: [Rahul, Rohit, Priya]

//After Remove: [Rahul, Rohit]

//Total Students: 2

//Using For-Each Loop:
//Rahul
//Rohit
