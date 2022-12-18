package JAVAIO;


import java.io.FileInputStream;

public class qn1 {
    public static void main(String[] args) {

        try {
            FileInputStream fin =new FileInputStream("doc.txt");
            int contest ;
            while ((contest=fin.read())!=-1){
                System.out.print((char)contest);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
