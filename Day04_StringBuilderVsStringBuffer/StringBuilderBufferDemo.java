public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb1 =
                new StringBuilder("Java");
        sb1.append(" Programming");
        System.out.println(
                "StringBuilder: " + sb1);
        StringBuffer sb2 =
                new StringBuffer("Java");
        sb2.append(" Programming");
        System.out.println(
                "StringBuffer: " + sb2);
    }
}
