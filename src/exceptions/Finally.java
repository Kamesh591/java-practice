package exceptions;

public class Finally {

    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }
       /* catch (Exception e){
            e.printStackTrace();
        }*/
        finally {
            System.out.println("Irrespective of try and catch block, finally always get the option");
        }
    }
}
