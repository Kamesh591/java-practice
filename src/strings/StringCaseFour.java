package strings;

public class StringCaseFour {

    /*
    During the conversion at run time , if the content is not changing in string then new object won't be created and only new ref will be assigned to previous object
     */

    public static void main(String[] args) {
        String s1= new String("kamesh");

        String s2=s1.toUpperCase();

        String s3= s1.toLowerCase();
        String s4=s2.toLowerCase();

        System.out.println(s1==s2);

        System.out.println(s1==s3);
        System.out.println(s1==s4);

    }
}
