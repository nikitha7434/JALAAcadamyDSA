package JAVAIO;

import java.io.*;

public class qn4 {
    public static void main(String[] args) {
        File file = new File("doc.txt");
        try {
            FileOutputStream fil = new FileOutputStream(file);

            BufferedOutputStream bout = new BufferedOutputStream(fil);
            String s = "this message add ";
            byte[] b = s.getBytes();
            bout.write(b);

            bout.close();
            System.out.println("Success !");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
