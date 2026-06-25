class Student {
    int id;
    String name;
    // Default Constructor
    Student() {
        id = 101;
        name = "Rahul";
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        System.out.println();
        Student s2 = new Student(102, "Aman");
        s2.display();
    }
}

output-
Default Constructor Called
ID: 101
Name: Rahul

Parameterized Constructor Called
ID: 102
Name: Aman
