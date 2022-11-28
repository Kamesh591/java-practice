package collectionsimpl.map.pack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesImpl {

    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("db.properties");

        PrintWriter printWriter= new PrintWriter(new FileWriter("db.properties"));
        Properties p=new Properties();
        p.load(reader);

        /*System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));*/
        System.out.println(p.getProperty("name","Kamesh"));
        p.put("name","Sameer");
        p.store(printWriter,null);
        System.out.println(p);
    }
}
