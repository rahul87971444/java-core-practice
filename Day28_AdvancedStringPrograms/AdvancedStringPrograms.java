import java.util.*;
public class AdvancedStringPrograms {
    // 1. Anagram
    static void anagram(String s1, String s2) {
        char a[] = s1.toLowerCase().toCharArray();
        char b[] = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
    // 2. Character Frequency
    static void frequency(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
    // 3. Remove Duplicate Characters
    static void removeDuplicate(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }
        for(char ch : set) {
            System.out.print(ch);
        }
        System.out.println();
    }
    // 4. Reverse Words
    static void reverseWords(String str) {
        String words[] = str.split(" ");
        for(int i=words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
    // 5. First Non-Repeating Character
    static void firstNonRepeating(String str) {
        LinkedHashMap<Character,Integer> map =
                new LinkedHashMap<>();
        for(char ch:str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()) {
            if(map.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
    }
    public static void main(String[] args) {
        anagram("listen","silent");
        frequency("programming");
        removeDuplicate("programming");
        reverseWords("Java is easy");
        firstNonRepeating("aabbcdde");
    }
}
