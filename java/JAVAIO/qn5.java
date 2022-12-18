package JAVAIO;

import java.io.File;
import java.io.FileReader;

public class qn5 {

    public static void main(String[] args) {

        File file=new File("doc.txt");

        try {
            FileReader fileReader=new FileReader(file);
            char[] ch =new char[(int) file.length()];
            fileReader.read(ch);

            String s =new String(ch);
            System.out.println( ch);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
