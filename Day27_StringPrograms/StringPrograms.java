public class StringPrograms {
    // 1. Reverse String
    static void reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse : " + reverse);
    }
    // 2. Palindrome
    static void palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " is Not Palindrome");
    }
    // 3. Count Vowels
    static void countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels : " + count);
    }
    // 4. Count Characters
    static void countCharacters(String str) {
        System.out.println("Characters : " + str.length());
    }
    // 5. Convert Uppercase
    static void upperCase(String str) {
        System.out.println(str.toUpperCase());
    }
    // 6. Convert Lowercase
    static void lowerCase(String str) {
        System.out.println(str.toLowerCase());
    }
    // 7. Remove Spaces
    static void removeSpaces(String str) {
        System.out.println(str.replace(" ", ""));
    }
    // 8. Compare Strings
    static void compareStrings(String s1, String s2) {
        System.out.println(s1.equals(s2));
    }
    // 9. Check Empty
    static void checkEmpty(String str) {
        System.out.println(str.isEmpty());
    }
    // 10. Find Character
    static void findCharacter(String str) {
        System.out.println(str.charAt(0));
    }
    public static void main(String[] args) {
        reverseString("Java");
        palindrome("madam");
        countVowels("Programming");
        countCharacters("Java");
        upperCase("java");
        lowerCase("JAVA");
        removeSpaces("Hello World");
        compareStrings("Java", "Java");
        checkEmpty("");
        findCharacter("Rahul");
    }
}
