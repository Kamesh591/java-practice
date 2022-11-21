package strings;

public class StringBufferImpl {

    //StringBuffer initial capacity is 16 characters
    // if 16 already completed then the capacity will be (currentCapacity+1)*2, for 17 char string, it will create 34 char length string
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("abcdefghijklmnop");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("abcdefghijklmnopqrstu");
        System.out.println(stringBuffer.capacity());
    }
}
