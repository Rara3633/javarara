import java.io.File;
import java.io.FileReader;

public class JavaIo {
    
    public static void main(String[] args) {
        try{
            File file = new File("newtext.txt");
            FileReader fr = new FileReader(file);    

        } catch(Exception e){ // the program can tell the user the wrong thing happend
            System.out.println("Caught checkeck: " + e.getMessage());
        }
    }
}
