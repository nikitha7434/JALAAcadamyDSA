package JAVAIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class qn9 {
    public static void main(String[] args) throws IOException {
        Properties props =new Properties();

        props.put("Device_name", "OnePlus7");
        props.put("Android_version", "9");
        props.put("Model", "GM1901");
        props.put("CPU", "Snapdragon855");

        String path =new String("doc.txt");
        FileOutputStream outputStrem = new FileOutputStream(path);
        //Storing the properties file
        props.store(outputStrem, "This is a sample properties file");
        System.out.println("Properties file created......");

    }
}
