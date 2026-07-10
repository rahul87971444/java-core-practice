class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
public class ObjectClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(101, "Aman");
        System.out.println(s1);
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}

/*Student{id=101, name='Rahul'}

Equals: true

HashCode s1: 101

HashCode s2: 1018*/
