import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        // Adding Elements
        students.add("Rahul");
        students.add("Aman");
        students.add("Saswati");
        System.out.println("Student List: " + students);
        // Add First
        students.addFirst("Rohit");
        // Add Last
        students.addLast("Neha");
        System.out.println("After Adding First & Last: " + students);
        // Access First & Last
        System.out.println("First Student: " + students.getFirst());
        System.out.println("Last Student: " + students.getLast());
        // Remove First
        students.removeFirst();
        // Remove Last
        students.removeLast();
        System.out.println("After Removal: " + students);
        // Traverse
        System.out.println("\nUsing For-Each Loop:");
        for(String student : students) {
            System.out.println(student);
        }
    }
}

/*Student List: [Rahul, Aman, Priya]

After Adding First & Last:
[Rohit, Rahul, Aman, Saswati, Neha]

First Student: Rohit

Last Student: Neha

After Removal:
[Rahul, Aman, Saswati]

Using For-Each Loop:
Rahul
Aman
Saswati*/
