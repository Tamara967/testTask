package DataProvider;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
     public static void main(String[] args) throws IOException {
         Properties prop = new Properties();
         FileInputStream ip= new FileInputStream("C:\\Users\\ACER\\Desktop\\myProject\\src\\test\\Configs\\configFille.properties");
         prop.load(ip);
         System.out.println(prop.getProperty("name"));



     }
}
