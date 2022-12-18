package JAVAIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class qn7 {
    public static void main(String[] args) {

        File file =new File("doc.txt");

        try {
            FileReader in = new FileReader(file);

            BufferedReader br = new BufferedReader(in);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
