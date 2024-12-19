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




public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 8};
        System.out.println(search(arr, 7)); // 2
    }
}