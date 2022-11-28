package javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteImpl {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("ravi.txt"),true);
        fileWriter.write("Kameshwara \t");
        fileWriter.write("Jaguar \n");
        fileWriter.write("Sameer");
        fileWriter.flush();
        fileWriter.close();

    }
}
