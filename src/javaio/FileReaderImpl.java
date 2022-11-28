package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderImpl {

    public static void main(String[] args) throws IOException {

        // We use FileReader to read data char by char.

        String filePath="C:\\Users\\Shalini\\Downloads\\java-pract1\\practice\\a.txt";
        FileReader fileReader1= new FileReader(new File(filePath));
        FileReader fileReader = new FileReader(filePath);

        int i=fileReader.read();
        while (i!=-1){
            System.out.println((char)fileReader.read());
            i=fileReader.read();
        }
    }
}
