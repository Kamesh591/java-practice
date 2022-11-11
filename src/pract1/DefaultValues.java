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

       System.out.println(b);
       System.out.println(s);
       System.out.println(i);
       System.out.println(c);
       System.out.println(l);
       System.out.println(f);
       System.out.println(d);
       System.out.println(boo);


    }

    public static void main(String[] args) {
       int age=20;
       DefaultValues defaultValues= new DefaultValues();
        System.out.println(defaultValues.num);
        System.out.println(age);
        System.out.println(b);

    }
}
