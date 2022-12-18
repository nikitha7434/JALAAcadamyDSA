package JAVAIO;

import java.io.File;
import java.io.FileWriter;

public class qn6 {
    public static void main(String[] args) {
        File file =new File("doc.txt");
        try{
            FileWriter fiW =new FileWriter(file);
            String mess ="this change again change";
            fiW.write(mess);
            fiW.close();
            System.out.println("scucess..");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
