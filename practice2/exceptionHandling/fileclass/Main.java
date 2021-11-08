package practice2.exceptionHandling.fileclass;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        // file = an abstract representation of file and directory pathnames

        File file = new File("wd.gaster.txt");

        if (file.exists()) {
            System.out.println("That file exists! :0");
        }
        else {
            System.out.println("That file doesn't exist");
        }


    }
}
