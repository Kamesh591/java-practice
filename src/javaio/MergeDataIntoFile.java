package javaio;

import java.io.*;

public class MergeDataIntoFile {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter= new PrintWriter(System.getProperty("user.dir")+"/practice/newFile.txt");

        BufferedReader bufferedReader= new BufferedReader(new FileReader(System.getProperty("user.dir")+"/practice/a.txt"));
        BufferedReader bufferedReader1= new BufferedReader(new FileReader(System.getProperty("user.dir")+"/practice/b.txt"));

        String file1Text= bufferedReader1.readLine();
        String fileText=bufferedReader.readLine();

        while (fileText !=null || file1Text!=null ){

        }

    }
}
