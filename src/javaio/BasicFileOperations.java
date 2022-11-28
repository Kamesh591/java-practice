package javaio;

import java.io.File;
import java.io.IOException;

public class BasicFileOperations {

    public static void main(String[] args) throws IOException, InterruptedException {
/*
        File file = new File("practice");
        System.out.println(file.exists());
        file.mkdir();
        //System.out.println(file.mkdir());
        File createFile= new File(file,"xyz.txt");
        createFile.createNewFile();
        createFile.delete();*/
       // file.is

      /*  File file= new File("bxz.txt");
        System.out.println(file.exists());
        file.createNewFile();
       // file.delete();
        System.out.println(file.exists());*/

        String[] filenames;
        File folder= new File("practice");
      if (folder.exists()) {
          filenames = folder.list();

         // System.out.println(folder.list());

          for (String file:filenames){
              if (file.equalsIgnoreCase("b.txt")){
                  File file1= new File(file);
                  file1.delete();
                  //folder.delete();
              }
              System.out.println(file);
          }
      }
      else {
          folder.mkdir();
          Thread.sleep(5000);
          folder.delete();
      }


      //  System.out.println( file.getAbsoluteFile());
        /* file.*/


}

        }
