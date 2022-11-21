package strings;

/*
String class is Immutable (State of the object doesn't change). This is because of SCP
StringBuffer class is Mutable (We can modify the string with the same variable)

String is the mostly used object in Java, hence String has the concept of StringConstantPool.
All Wrapper classed also Immutable in java /Byte, Short, Int, Char
 */
public class StringFirst {

    public static void main(String[] args) {
        String s="durga";
        s.concat("Rame");
        System.out.println(s);

        StringBuffer stringBuffer= new StringBuffer("Durga");
        stringBuffer.append("Software");
        System.out.println(stringBuffer);
    }
}
