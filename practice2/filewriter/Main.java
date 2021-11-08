package practice2.filewriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nE");
            writer.append("\nA poem by AJ");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
