package strings;

public class StringConstantPool {

    public static void main(String[] args) {

        /*
        String contains 2 memory areas. Heap Area and SCP area.
        SCP stands for String Constant Pool
        For every liternal there will be an object created in SCP area.
        If any operation at runtime happens, then we don't create an object in SCP area
         */
        String s1= new String("Durga");
        String s2= new String("Durga");
        String s3="Durga";
        String s4 = "Durga";
        String s5= "Dur"+"ga";

        StringBuffer sb= new StringBuffer("Durga");
    String dummyString=    s1.concat("raghava");

        sb.append("raghava");
        sb.append("James");
        System.out.println(s1);
        System.out.println(sb);

        /*System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s3==s5);*/


    }
}
