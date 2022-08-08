import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        fileWriter("file","Aa\nBb\nCc\nDd\nEe\nFf\nGg\nHh\nIi\nJj\nKk\nLl\nMm\nNn\nOo\nPp\nQq\nRr\nSs\nTt\nUu\nVv\nWw\nXx\nYy\nZz\n" +
                "0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
        fileReader("file");
    }

    public static void fileWriter(String name, String text) {

        try (FileWriter writer = new FileWriter(name)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void fileReader(String name) {

        try (FileReader reader = new FileReader(name)) {
            Scanner scanner = new Scanner(reader);
            int count = 1;
            while (scanner.hasNextLine()) {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}