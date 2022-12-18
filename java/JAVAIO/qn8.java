package JAVAIO;

import java.io.FileWriter;

public class qn8 {
    public static void main(String[] args) {

        String s ="this is adavanced file creatation";

        try
        {
            FileWriter fileWriter =new FileWriter("doc.txt");

            char[] ch =new char[s.length()];
            fileWriter.write(s);
            fileWriter.close();
            System.out.println("sucess .. bye");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
