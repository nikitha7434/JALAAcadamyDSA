package JAVAIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class qn3 {
    public static void main(String[] args) {

        File file =new File("doc.txt");
        try{
            FileInputStream fin =new FileInputStream("doc.txt");

            BufferedInputStream buffInputStr
                    = new BufferedInputStream(fin);

            while (buffInputStr.available()>0){
                char c = (char)buffInputStr.read();
                System.out.print( c);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
