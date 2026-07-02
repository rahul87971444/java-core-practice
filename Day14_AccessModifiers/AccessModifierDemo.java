class Student {
    public String college = "ABC Engineering College";
    private int rollNo = 101;
    protected String department = "Computer Science";
    String name = "Rahul"; // Default (Package-Private)
    public void showDetails() {
        System.out.println("College: " + college);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Name: " + name);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("College: " + s.college);
        // Cannot access directly
        // System.out.println(s.rollNo);
        System.out.println("Department: " + s.department);
        System.out.println("Name: " + s.name);
        System.out.println();
        s.showDetails();
    }
}

//College: ABC Engineering College
//Department: Computer Science
//Name: Rahul

//College: ABC Engineering College
//Roll No: 101
//Department: Computer Science
//Name: Rahul
