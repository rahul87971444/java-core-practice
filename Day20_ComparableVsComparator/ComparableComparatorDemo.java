import java.util.*;
class Student implements Comparable<Student> {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }
    @Override
    public String toString() {
        return id + " " + name;
    }
}
public class ComparableComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(103, "Rahul"));
        list.add(new Student(101, "Aman"));
        list.add(new Student(102, "Neha"));
        // Comparable Sorting (By ID)
        Collections.sort(list);
        System.out.println("Sorted By ID:");
        for(Student s : list) {
            System.out.println(s);
        }
        // Comparator Sorting (By Name)
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("\nSorted By Name:");
        for(Student s : list) {
            System.out.println(s);
        }
    }
}

/*Sorted By ID:
101 Aman
102 Neha
103 Rahul

Sorted By Name:
101 Aman
102 Neha
103 Rahul*/
