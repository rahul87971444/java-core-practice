import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        // Adding Key-Value Pairs
        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Neha");
        System.out.println("Student Records:");
        System.out.println(students);
        // Accessing Value
        System.out.println("\nStudent with ID 102: " +
                students.get(102));
        // Updating Value
        students.put(102, "Rohit");
        System.out.println("\nAfter Update:");
        System.out.println(students);
        // Remove Entry
        students.remove(103);
        System.out.println("\nAfter Removal:");
        System.out.println(students);
        // Contains Key
        System.out.println("\nContains ID 101: " +
                students.containsKey(101));
        // Contains Value
        System.out.println("Contains Aman: " +
                students.containsValue("Aman"));
        // Traversing HashMap
        System.out.println("\nUsing for-each:");
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                    entry.getKey() +
                    " -> " +
                    entry.getValue());
        }
    }
}

/* Student Records:
{101=Rahul, 102=Aman, 103=Neha}

Student with ID 102: Aman

After Update:
{101=Rahul, 102=Rohit, 103=Neha}

After Removal:
{101=Rahul, 102=Rohit}

Contains ID 101: true

Contains Aman: false

Using for-each:
101 -> Rahul
102 -> Rohit */
