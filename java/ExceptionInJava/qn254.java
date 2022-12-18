package ExceptionInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class qn254 {
    public static void main(String[] args) {
        File file=new File("test1.txt");
        try
        {
            FileInputStream fil =new FileInputStream(file);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
