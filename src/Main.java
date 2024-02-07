import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            String text = "Hello, world!";
            writer.write(text);
            System.out.println("Data has been written to output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
