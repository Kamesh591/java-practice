package strings;

import java.util.Locale;

public class StringConstructor {

    public static void main(String[] args) {
        String s=new String();
        String s1= new String("Kamesh");
        String s2= new String(new StringBuffer("Raghu"));
        String s4= new String(new StringBuilder("Ram"));
        char[] ch={'a','b','c','d'};
        String s5= new String(ch);
        byte[] bt= {97,98,126};
        String s6= new String(bt);

        System.out.println(s1.charAt(2));
      //  System.out.println(s1.charAt(15));
        System.out.println(s1.concat("Durga"));

        System.out.println(s1.equals("Kmamesh"));
        System.out.println(s1.equals("kamesh"));
        System.out.println(s1.equalsIgnoreCase("kamesh"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s1.length());
        System.out.println(s1.replace('K','a'));
        System.out.println(s1.substring(3,s1.length()));
        System.out.println(s1.substring(2));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf("me"));
        System.out.println(s1.lastIndexOf('m'));
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
    }
}
