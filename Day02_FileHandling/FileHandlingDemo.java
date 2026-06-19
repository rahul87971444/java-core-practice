import java.io.*;
public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Writing data to file
            FileWriter writer =
                    new FileWriter("student.txt");
            writer.write("Rahul Kumar\n");
            writer.write("Computer Science (IoT)\n");
            writer.write("CGPA: 8.53");
            writer.close();
            System.out.println("Data Written Successfully\n");
            // Reading data from file
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("student.txt"));
            String line;
            System.out.println("File Contents:");
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch(Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}
