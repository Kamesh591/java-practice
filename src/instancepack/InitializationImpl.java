package instancepack;

public class InitializationImpl {

    private static String m1(String msg){
        System.out.println(msg);
        return msg;
    }

    public InitializationImpl(){
        m=m1("1");
    }
    {
        m=m1("2");
    }
    String m=m1("3");

    public static void main(String[] args) {
        InitializationImpl initialization= new InitializationImpl();
    }
}
