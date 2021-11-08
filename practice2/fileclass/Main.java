package practice2.fileclass;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        // file = an abstract representation of file and directory pathnames

        File file = new File("wd.gaster.txt");

        if (file.exists()) {
            System.out.println("That file exists! :0");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist");
        }


    }
}
