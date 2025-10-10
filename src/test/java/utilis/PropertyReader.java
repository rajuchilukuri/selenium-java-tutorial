package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    Properties properties = new Properties();

    public void fileRader() throws IOException {


        FileInputStream fileInputStream = new FileInputStream(System.getProperty("C:\\Users\\devansh\\Desktop\\Tutorial\\selenium-java-tutorial\\src\\test\\resources\\application.properties"));
   properties.load(fileInputStream);
    }

    public String getUrl(){
        return properties.getProperty("url");
    }

    public String  getUserName(){
        return properties.getProperty("username");
    }

}
