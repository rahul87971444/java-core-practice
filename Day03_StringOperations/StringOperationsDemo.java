public class StringOperationsDemo {
    public static void main(String[] args) {
        String name = "Rahul Kumar";
        System.out.println("Original String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Substring: " + name.substring(0, 5));
        System.out.println("Contains Rahul: " + name.contains("Rahul"));
        System.out.println("Replace: " +
                name.replace("Rahul", "Aman"));
    }
}
