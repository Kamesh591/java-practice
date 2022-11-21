package strings;

public class Comparisions {

    public static void main(String[] args) {

        /*
        .equals() method in String is overridden for content comparision whereas it's not overridden in SB
         */
        String s1= new String("Durga");
        String s2= new String("Durga");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        StringBuffer stringBuffer= new StringBuffer("Durga");
        StringBuffer stringBuffer1= new StringBuffer("Durga");

        System.out.println(stringBuffer1== stringBuffer);
        System.out.println(stringBuffer.equals(stringBuffer1));
    }
}
