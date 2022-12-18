package JAVAIO;

import java.io.File;
import java.io.FileOutputStream;

public class qn2 {
    public static void main(String[] args) {
        File file =new File("doc.txt");

        try {
            FileOutputStream fil =new FileOutputStream(file);
            String s ="welcome to ";
            byte[] b=s.getBytes();
            fil.write(b);
            fil.close();;
            System.out.println("sucess...");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
