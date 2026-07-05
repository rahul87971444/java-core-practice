import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        // Adding Elements
        students.add("Rahul");
        students.add("Aman");
        students.add("Saswati");

        // Duplicate Value
        students.add("Rahul");
        System.out.println("Students: " + students);
        // Search
        System.out.println("Contains Aman: " +
                students.contains("Aman"));
        // Remove
        students.remove("Saswati");
        System.out.println("After Removal: " + students);
        // Size
        System.out.println("Total Students: " +
                students.size());
        // Traversing
        System.out.println("\nUsing For-Each Loop:");
        for(String student : students) {
            System.out.println(student);
        }
    }
}

/*
Students: [Rahul, Aman, Saswati]

Contains Aman: true

After Removal:
[Rahul, Aman]

Total Students: 2

Using For-Each Loop:
Rahul
Aman 
*/
