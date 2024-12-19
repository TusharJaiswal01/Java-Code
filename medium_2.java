import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt");
        writer.write("Hello, File!");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}