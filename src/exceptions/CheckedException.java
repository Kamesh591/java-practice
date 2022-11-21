package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) {
        File file= new File("/abc.txt");
        try{
            FileInputStream fileInputStream= new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
