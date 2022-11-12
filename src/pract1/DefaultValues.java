package pract1;

public class DefaultValues {

    static byte b;
    static short s;
    static int i;
    static long l;
    static char c;
    static float f;
    static double d;
    static boolean boo;

    int num;
   static  {

       System.out.println("JVM default value of Byte is:"+b);
       System.out.println("JVM default value of Short is:"+s);
       System.out.println("JVM default value of int is:"+i);
       System.out.println("JVM default value of Char is:"+c);
       System.out.println("JVM default value of long is:"+l);
       System.out.println("JVM default value of Float is:"+f);
       System.out.println("JVM default value of Double is:"+d);
       System.out.println("JVM default value of Boolean is:"+boo);


    }

    public static void main(String[] args) {
       int age=20;
       DefaultValues defaultValues= new DefaultValues();
        System.out.println(defaultValues.num);
        System.out.println(age);
        System.out.println(b);

    }
}
