package javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterImpl {
    //Newline method implemented to write data into a new line
    //To write data into FileWriter or BufferedWriter, we can only insert char data. we can't add int, float or boolean. we should send them as string
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = null;
        System.out.println(System.getProperty("user.dir"));
        try{
            bufferedWriter  = new BufferedWriter( new FileWriter(System.getProperty("user.dir")+"\\practice\\c.txt"));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        bufferedWriter.write("RAGHURAM");
        bufferedWriter.newLine();
        bufferedWriter.write("RAVI");
        bufferedWriter.flush();
        bufferedWriter.close();


    }
}
