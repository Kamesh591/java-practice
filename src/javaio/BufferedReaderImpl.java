package javaio;

import java.io.*;

public class BufferedReaderImpl {

    //To read data from line by line
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader= new BufferedReader(new FileReader(System.getProperty("user.dir")+"/practice/a.txt"));

        String line= bufferedReader.readLine();
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
        bufferedReader.close();

    }

}
