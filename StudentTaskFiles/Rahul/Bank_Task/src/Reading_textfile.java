import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reading_textfile {
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\Users\\abc\\Desktop\\rahul smoke effect code.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
