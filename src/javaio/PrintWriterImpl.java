package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterImpl {

    //With PrintWriter, we can write any kind of data into file



    public static void main(String[] args) throws FileNotFoundException {
        String filePath="C:\\Users\\Shalini\\Downloads\\java-pract1\\practice\\d.txt";

        //PrintWriter printWriter= new PrintWriter(new File("filePath"));

        PrintWriter printWriter= new PrintWriter(filePath);
        printWriter.write(100);
        printWriter.println(2000);
        printWriter.write((char)100);
        printWriter.print("Raghu");
        printWriter.flush();
        printWriter.close();

    }


}

