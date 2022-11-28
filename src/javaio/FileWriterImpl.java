package javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl {

    public static void main(String[] args) throws IOException {

        String fileLocation="C:\\Users\\Shalini\\Downloads\\java-pract1\\bxz.txt";
        File file= new File("C:\\Users\\Shalini\\Downloads\\java-pract1\\practice\\a.txt");
        FileWriter fileWriter= new FileWriter(fileLocation);
        FileWriter fileWriter1= new FileWriter(file);
        //FileWriter fileWriter2= new FileWriter(fileLocation,true);
        FileWriter fileWriter3= new FileWriter(file,true);

        char[] ch = {'d','u','r','g','a'};

        //Methods
      /*  fileWriter.write(98);
        fileWriter.write("KAMESH");
        fileWriter.write(ch);
        fileWriter.flush();
        fileWriter.close();*/
        fileWriter3.append((char)98);
        fileWriter3.append("KAMESH \n");
       // fileWriter3.append(ch);

        fileWriter3.append("Jameer");

        fileWriter3.flush();
        fileWriter3.close();

        //With file writer, we should specify line seperator. Hence developers don't use FileWriter regularly

    }
}
